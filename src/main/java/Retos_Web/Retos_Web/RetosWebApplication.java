package Retos_Web.Retos_Web;

import Retos_Web.Retos_Web.Interfaces.InterfaceLaptop;
import Retos_Web.Retos_Web.Interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class RetosWebApplication implements CommandLineRunner {
   @Autowired
    private InterfaceLaptop interfaceLaptop;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(RetosWebApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceLaptop.deleteAll();
        interfaceUser.deleteAll();
    }
    
}

