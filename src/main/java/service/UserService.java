package service;

import model.User;
import model.hiberDAO.impl.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
@Service
public class UserService implements IService<User> {

    @Autowired
    UserDao dao;

    @Override
    public int create(User entity) {
        return dao.create(entity);
    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(User entity) {
        dao.update(entity);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
