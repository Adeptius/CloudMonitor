package ua.adeptius.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.adeptius.model.Site;

import javax.transaction.Transactional;
import java.util.List;


//@Repository
public class SiteRepository {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    protected Session getSession() {
//        return this.sessionFactory.getCurrentSession();
//    }
//
//    @Transactional
//    public void save(Site site) {
//        getSession().save(site);
//    }
//
//    @Transactional
//    public Site findById(long id) {
//        return getSession().get(Site.class, id);
//    }
//
//    @Transactional
//    public List<Site> findAll(){
//        Query query = getSession().createQuery("select s from Site s");
//        List<Site> list = query.list();
//        return list;
//    }
}
