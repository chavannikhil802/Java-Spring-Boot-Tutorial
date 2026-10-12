package in.nikhil.classes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware /*, DisposableBean implements InitializingBean */ {

    Map<Integer, String> mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("CartService Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext - "+applicationContext);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initialization callback - Bean is ready");
//        mp.put(1, "Nikhil");
//        mp.put(2, "Umesh");
//    }

//    public void start() {
//        System.out.println("Initialization callback - Bean is ready");
//        mp.put(1, "Nikhil");
//        mp.put(2, "Umesh");
//    }

//    public void stop() {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    @PostConstruct
//    public void start2() {
//        System.out.println("Initialization callback - Bean is ready");
//        mp.put(1, "Nikhil");
//        mp.put(2, "Umesh");
//    }

    @PreDestroy
    public void stop() {
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }

    public void addToCart() {
        System.out.println("Added to Cart");
    }

    public String getValue(int key) {
        return mp.get(key);
    }

//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }
}
