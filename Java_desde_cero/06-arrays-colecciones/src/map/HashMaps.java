package map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,Integer> productPrices = new HashMap<>();

        productPrices.put("Laptop",1000);
        productPrices.put("SmarthPhone",5900);
        productPrices.put("Ps5",9899);

        System.out.println(productPrices);
        System.out.println(productPrices.get("Laptop"));
        productPrices.put("Laptop",1234);
        System.out.println(productPrices.get("Laptop"));
        productPrices.remove("Laptop");
        System.out.println(productPrices);
    }
}
