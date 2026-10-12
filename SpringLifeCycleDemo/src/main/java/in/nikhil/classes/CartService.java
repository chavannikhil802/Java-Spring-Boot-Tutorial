package in.nikhil.classes;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService {

    Map<Integer, String> mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("CartService Constructor");
    }
    
    public void addToCart() {

        System.out.println("Added to Cart");
    }
}
