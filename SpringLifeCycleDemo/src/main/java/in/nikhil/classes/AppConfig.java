package in.nikhil.classes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration@ComponentScan
public class AppConfig {

    public void demo() {
        System.out.println("Demo");
    }
}
