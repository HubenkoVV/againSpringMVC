package model.repository;

import model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslava_Hubenko on 8/17/2018.
 */

public interface CarRepository extends JpaRepository<Car, Integer> {
}
