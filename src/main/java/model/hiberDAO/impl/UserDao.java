package model.hiberDAO.impl;

import model.User;
import model.hiberDAO.GeneralDao;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

import static model.hiberDAO.util.HibernateUtil.getSessionFactory;

/**
 * Created by Vladyslava_Hubenko on 8/15/2018.
 */
@Component
public class UserDao implements GeneralDao<User> {

    public int create(User entity) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.save(entity);
            return entity.getId();
        }
    }

    public User findById(int id) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            return session.get(User.class, id);
        }
    }

    public List<User> findAll() {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            return (List<User>) session.createQuery("from User").list();
        }
    }

    public void update(User entity) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.saveOrUpdate(entity);
        }
    }

    public void delete(int id) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete(findById(id));
            session.getTransaction().commit();
        }
    }

}
