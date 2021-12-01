package Retos_Web.Retos_Web.Interfaces;

import Retos_Web.Retos_Web.Model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Sandra Patricia Molano C
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}

