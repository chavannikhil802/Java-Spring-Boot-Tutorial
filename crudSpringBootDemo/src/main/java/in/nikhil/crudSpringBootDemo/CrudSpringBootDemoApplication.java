package in.nikhil.crudSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

// EXCLUDED AUTO CONFIGURATION TO PREVENT ERRORS
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CrudSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootDemoApplication.class, args);
	}

}
