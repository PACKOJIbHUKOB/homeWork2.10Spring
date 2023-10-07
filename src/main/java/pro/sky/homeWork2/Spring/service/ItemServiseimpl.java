package pro.sky.homeWork2.Spring.service;

import pro.sky.homeWork2.Spring.item.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ItemServiseimpl implements ItemService {
    Map<Integer, Product>products = new HashMap<>(Map.of(
            1, new Product("Potato"),
            2,new Product("Carrot"),
            3,new Product("Pepper"),
            4,new Product("Tomato"),
            5,new Product("Onion"),
            6,new Product("Cabbage"),
            7,new Product("Bread"),
            8,new Product("Corn"),
            9,new Product("Coffee"),
            10,new Product("Beer")
    ));
    @Override
    public Collection<Product> getAll(){
        return Collections.unmodifiableCollection(products.values());
    }

}
