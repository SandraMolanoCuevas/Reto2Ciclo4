package Retos_Web.Retos_Web.Repository;


import Retos_Web.Retos_Web.Interfaces.InterfaceLaptop;
import Retos_Web.Retos_Web.Model.Laptop;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sandra Patricia Molano C
 */
@Repository
public class LaptopRepository {
    @Autowired
    private InterfaceLaptop repository;

    public List<Laptop> getAll() {
        return repository.findAll();
    }
    
    public Optional<Laptop> getClothe(int id) {
        return repository.findById(id);
    }
    public Laptop create(Laptop clothe) {
        return repository.save(clothe);
    }

    public void update(Laptop clothe) {
        repository.save(clothe);
    }
    
    public void delete(Laptop clothe) {
        repository.delete(clothe);
    }
}

