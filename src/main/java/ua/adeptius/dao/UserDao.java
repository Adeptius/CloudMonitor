package ua.adeptius.dao;


import org.springframework.data.repository.CrudRepository;
import ua.adeptius.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserDao extends CrudRepository<User, String> {

    public List<User> findAll();

}
