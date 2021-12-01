package Retos_Web.Retos_Web.Interfaces;

import Retos_Web.Retos_Web.Model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Sandra Patricia Molano C
 */
public interface InterfaceLaptop extends MongoRepository<Laptop, Integer>{
    
}
