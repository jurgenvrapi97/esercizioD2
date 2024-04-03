package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.OrdiniConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class U5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class, OrdiniConfig.class);


		Menu m = (Menu) ctx.getBean("menu");
		CommandLineRunner runner = (CommandLineRunner) ctx.getBean("orderRunner");
		try {
			runner.run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}


		m.printMenu();
		ctx.close();
	}

}
