package model.repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vladyslava_Hubenko on 8/17/2018.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
