package ua.adeptius.watchers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ua.adeptius.HttpWorker;
import ua.adeptius.dao.PendingUserDao;
import ua.adeptius.dao.PendingUserRepository;
import ua.adeptius.model.HttpReport;
import ua.adeptius.model.PendingUser;
import ua.adeptius.model.Site;
import ua.adeptius.model.UserContainer;

import javax.annotation.Nonnull;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Component
@EnableScheduling
public class Scheduler extends Thread {

    private static Logger LOGGER = LoggerFactory.getLogger(Scheduler.class.getSimpleName());
    public static final ExecutorService EXECUTOR = new ThreadPoolExecutor(10, 100, 60L, TimeUnit.SECONDS, new SynchronousQueue<>());

    @Autowired
    PendingUserDao pendingUserDao;

    @Autowired
    UserContainer userContainer;

    @Scheduled(fixedRate = 60000)
    private void clean(){
        List<PendingUser> pendingUsers = pendingUserDao.findAll();
        Iterator<PendingUser> it = pendingUsers.iterator();
        while (it.hasNext()){
            PendingUser pendingUser = it.next();
            try{
                long timeCreated = pendingUser.getDate().getTime();
                long timeNow = new Date().getTime();
                long pastTime = timeNow - timeCreated;
                int pastMinutes = (int)(pastTime / 1000 / 60);
                if (pastMinutes>30){
                    LOGGER.info("Pending user {} was removed. Past {} minutes", pendingUser.getLogin(), pastMinutes);
                    UserContainer.pendingUsers.remove(pendingUser);
                    pendingUserDao.delete(pendingUser);
                    it.remove();
                }
            }catch (Exception e){
                LOGGER.error("Pending user because error",e);
                UserContainer.pendingUsers.remove(pendingUser);
                pendingUserDao.delete(pendingUser);
                it.remove();
            }
        }
    }

    @Scheduled(fixedRate = 20000)
    private void checkAllSites() {
        LOGGER.info("SiteWatcher checking all sites");
        List<Site> sites = UserContainer.getUsers().stream().flatMap(user -> user.getSites().stream()).collect(Collectors.toList());
        sites.forEach(site -> EXECUTOR.submit(() -> {
            HttpReport report = HttpWorker.getResultViaJsoupConnect(site.getUrl(), site.getLookingWord());
            LOGGER.trace("Site {} is checked", site.getUrl());
            System.out.println(report);
        }));
    }

}
