package model.hiberDAO;


import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/16/2018.
 */
public interface GeneralDao<T> {
    int create(T entity);
    T findById(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);
}
