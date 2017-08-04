package ua.adeptius.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ua.adeptius.model.User;

import javax.annotation.Nonnull;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


//@Repository
//@Component
public class UserRepository {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    protected Session getSession() {
//        return this.sessionFactory.getCurrentSession();
//    }
//
//    @Transactional
//    public void save(@Nonnull User user) {
//        getSession().save(user);
//    }
//
//    @Transactional
//    public void update(User user) {
//        getSession().update(user);
//    }
//
//    @Transactional
//    public void remove(User user) {
//        getSession().delete(user);
//    }
//
//
//    @Transactional
//    public User findByName(String name) {
//        return getSession().get(User.class, name);
//    }
//
//    @Transactional
//    public User findByPassword(String pass) {
//        return (User) getSession().createQuery("from User where password = '" + pass + "'").uniqueResult();
//    }
//
//    @Transactional
//    public List<User> findAll() {
//        List<User> users = new ArrayList<>();
//        Session session = sessionFactory.getCurrentSession();
////        Object o = session.get(User.class, "adeptius");
////        users.add(adeptius);
//
////        Session session = sessionFactory.getCurrentSession();
//        User adeptius = session.get(User.class, "adeptius");
////        users.add(adeptius);
//
////        Query query = getSession().createQuery("select u from User u");
////        List<User> list = query.list();
//        return users;
//    }
}
