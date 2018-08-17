package model.repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vladyslava_Hubenko on 8/17/2018.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByNameIgnoreCaseContaining (String name);

}
