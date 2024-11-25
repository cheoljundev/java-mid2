package two.collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        Integer quantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, quantity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        Integer quantity = cartMap.get(product);
        if (quantity == null) {
            return;
        } else if ((quantity - minusQuantity) <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, quantity - minusQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + " 수량 : " + entry.getValue());
        }
    }
}
