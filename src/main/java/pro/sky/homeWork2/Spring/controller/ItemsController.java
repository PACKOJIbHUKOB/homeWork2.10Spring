package pro.sky.homeWork2.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeWork2.Spring.item.Product;
import pro.sky.homeWork2.Spring.service.ItemService;

import java.util.Collection;

@RestController
@RequestMapping(path = "/items")

public class ItemsController {
    private final ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }
    public Collection<Product> getAll() {
        return itemService.getAll();
    }
}
