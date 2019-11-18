package io.java.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"io.java.upgrade"})
public class CampsiteApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CampsiteApiApplication.class, args);
	}

}
