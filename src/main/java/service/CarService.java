package service;

import model.Car;
import model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
@Service
public class CarService implements IService<Car> {

    @Autowired
    CarRepository repository;

    @Override
    public int create(Car entity) {
        return repository.save(entity).getId();
    }

    @Override
    public Car findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Car> findAll() {
        return repository.findAll();
    }

    @Override
    public void update(Car entity) {
        Car carToUpdate = repository.getOne(entity.getId());
        carToUpdate.setMechanic(entity.getMechanic());
        carToUpdate.setModel(entity.getModel());
        carToUpdate.setOwner(entity.getOwner());
        repository.save(carToUpdate);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}