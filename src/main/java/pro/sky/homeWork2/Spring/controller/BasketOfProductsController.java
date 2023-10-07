package pro.sky.homeWork2.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homeWork2.Spring.service.Bascketservice;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketOfProductsController {
    private final Bascketservice bascketservice;

    public BasketOfProductsController(Bascketservice bascketservice) {
        this.bascketservice = bascketservice;
    }
    @GetMapping(path = "/add")
    public List<Integer> add (@RequestParam List<Integer> ids){
        return bascketservice.add(ids);
    }
    @GetMapping(path = "/get")
    public List<Integer> getBasket(){
        return bascketservice.get();
    }

}
