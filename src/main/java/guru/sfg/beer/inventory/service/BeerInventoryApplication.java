package guru.sfg.beer.inventory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

/**
 * Created by Luca Moro on 24/01/2021.
 */
@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class BeerInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerInventoryApplication.class, args);
    }

}
