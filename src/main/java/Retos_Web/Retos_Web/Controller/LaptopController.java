package Retos_Web.Retos_Web.Controller;

import Retos_Web.Retos_Web.Model.Laptop;
import Retos_Web.Retos_Web.Service.LaptopService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sandra Patricia Molano C
 */
@RestController
@RequestMapping("/api/laptop")
@CrossOrigin("*")
public class LaptopController {
    @Autowired
    private LaptopService accessoryService;
       
     @GetMapping("/all")
    public List<Laptop> getAll() {
        return accessoryService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Laptop> getClothe(@PathVariable("id") int id) {
        return accessoryService.getClothe(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Laptop create(@RequestBody Laptop gadget) {
        return accessoryService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Laptop update(@RequestBody Laptop gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return accessoryService.delete(id);
    } 
    
}
