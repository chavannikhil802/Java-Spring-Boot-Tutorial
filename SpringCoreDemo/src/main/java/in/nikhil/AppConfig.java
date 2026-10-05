package in.nikhil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.nikhil")
public class AppConfig {

    @Bean
    public UserService createUser() {
        return new UserService(34, "Nikhil");
    }
}
