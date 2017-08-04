package ua.adeptius.dao;



import org.springframework.data.repository.CrudRepository;
import ua.adeptius.model.Site;
import ua.adeptius.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface SitesDao  extends CrudRepository<Site, Long> {

    List<Site> findAll();

}

