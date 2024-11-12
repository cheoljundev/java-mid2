package one.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int amt) {
        cartMap.put(product, amt);
    }
    public void minus(Product product, int amt) {
        int oldAmt = cartMap.get(product);
        int result = oldAmt - amt;
        if (result > 0) {
            cartMap.put(product, result);
        } else {
            cartMap.remove(product);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
