package in.nikhil.classes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService /* implements InitializingBean */ {

    Map<Integer, String> mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("CartService Constructor");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initialization callback - Bean is ready");
//        mp.put(1, "Nikhil");
//        mp.put(2, "Umesh");
//    }

    public void addToCart() {
        System.out.println("Added to Cart");
    }

    public String getValue(int key) {
        return mp.get(key);
    }

//    public void start() {
//        System.out.println("Initialization callback - Bean is ready");
//        mp.put(1, "Nikhil");
//        mp.put(2, "Umesh");
//    }

    @PostConstruct
    public void start2() {
        System.out.println("Initialization callback - Bean is ready");
        mp.put(1, "Nikhil");
        mp.put(2, "Umesh");
    }
}
