package service;

import model.User;
import model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
@Service
public class UserService implements IService<User> {

    @Autowired
    UserRepository repository;

    @Override
    public int create(User entity) {
        return repository.save(entity).getId();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void update(User entity) {
        User userToUpdate = repository.getOne(entity.getId());
        userToUpdate.setName(entity.getName());
        userToUpdate.setSurname(entity.getSurname());
        userToUpdate.setCars(entity.getCars());
        userToUpdate.setFixed(entity.getFixed());
        userToUpdate.setRole(entity.getRole());
        repository.save(userToUpdate);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<User> getByName(String name){
        return repository.findAllByNameIgnoreCaseContaining(name);
    }
}
