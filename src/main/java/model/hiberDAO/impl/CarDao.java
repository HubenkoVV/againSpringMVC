package model.hiberDAO.impl;

import model.Car;
import model.hiberDAO.GeneralDao;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

import static model.hiberDAO.util.HibernateUtil.getSessionFactory;

/**
 * Created by Vladyslava_Hubenko on 8/15/2018.
 */
@Component
public class CarDao implements GeneralDao<Car>{

    public int create(Car entity) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.save(entity);
            return entity.getId();
        }
    }

    public Car findById(int id) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            return session.get(Car.class, id);
        }
    }

    public List<Car> findAll() {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            return (List<Car>) session.createQuery("from Car").list();
        }
    }

    public void update(Car entity) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.saveOrUpdate(entity);
        }
    }

    public void delete(int id) {
        try(Session session = getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete(findById(id));
        }
    }

}
