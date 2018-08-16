package service;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
public interface IService<T> {
    int create(T entity);
    T findById(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);
}
