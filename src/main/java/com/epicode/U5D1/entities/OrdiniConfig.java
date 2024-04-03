package com.epicode.U5D1.entities;

import com.epicode.U5D1.entities.AppConfig;
import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Ordine;
import com.epicode.U5D1.entities.Tavolo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrdiniConfig {
    @Bean
    public CommandLineRunner orderRunner(Menu menu, AppConfig config) {
        return args -> {

            menu.initializeMenu(config);


            Ordine order = new Ordine(1, 2, menu.getPizzaList().subList(0, 2), new Tavolo(1, 4));
            Ordine order1 = new Ordine(2,4, menu.getPizzaList().subList(2,4),new Tavolo(5,6));


            System.out.println(order);
            System.out.println(order1);
        };
    }
}
