package service;

import model.Car;
import model.hiberDAO.impl.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
@Service
public class CarService implements IService<Car> {

    @Autowired
    CarDao dao;

    @Override
    public int create(Car entity) {
        return dao.create(entity);
    }

    @Override
    public Car findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Car> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(Car entity) {
        dao.update(entity);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}