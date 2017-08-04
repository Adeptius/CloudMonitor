package ua.adeptius.dao;

import org.springframework.data.repository.CrudRepository;
import ua.adeptius.model.PendingUser;
import ua.adeptius.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PendingUserDao extends CrudRepository<PendingUser, String> {

    List<PendingUser> findAll();

    void delete(PendingUser user);

//    void saveOrUpdate(PendingUser user);

}