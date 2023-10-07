package pro.sky.homeWork2.Spring.service;

import org.springframework.stereotype.Service;
import pro.sky.homeWork2.Spring.item.Product;

import java.util.Collection;
@Service

public interface ItemService {
    Collection<Product> getAll();
}
