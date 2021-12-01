package Retos_Web.Retos_Web.Service;

import Retos_Web.Retos_Web.Model.Laptop;
import Retos_Web.Retos_Web.Repository.LaptopRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sandra Patricia Molano c
 */
@Service
public class LaptopService {
    @Autowired
    private LaptopRepository clotheRepository;

    public List<Laptop> getAll() {
        return clotheRepository.getAll();
    }

   public Optional<Laptop> getClothe(int id) {
        return clotheRepository.getClothe(id);
    }

    public Laptop create(Laptop accesory) {
        if (accesory.getId() == null) {
            return accesory;
        } else {
            return clotheRepository.create(accesory);
        }
    }

    public Laptop update(Laptop accesory) {

        if (accesory.getId() != null) {
            Optional<Laptop> accesoryDb = clotheRepository.getClothe(accesory.getId());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getModel() != null) {
                    accesoryDb.get().setModel(accesory.getModel());
                }
                
                if (accesory.getProcesor() != null) {
                    accesoryDb.get().setProcesor(accesory.getProcesor());
                }
                
                if (accesory.getOs() != null) {
                    accesoryDb.get().setOs(accesory.getOs());
                }
                
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                
                if (accesory.getMemory() != null) {
                    accesoryDb.get().setMemory(accesory.getMemory());
                }
                
                if (accesory.getHardDrive() != null) {
                    accesoryDb.get().setHardDrive(accesory.getHardDrive());
                }
                
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(int id) {
        Boolean aBoolean = getClothe(id).map(accesory -> {
            clotheRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
       
}