package pro.sky.homeWork2.Spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;
import java.util.stream.Collectors;
@SessionScope
@Service
public class BasketServiceImp implements Bascketservice{
    private final List<Integer> countById= new ArrayList<>();
    @Override
    public List<Integer> add (List<Integer> ids){
        countById.addAll(ids);
        return ids;
    }
    @Override
    public List<Integer> get() {
        return countById;
    }

}
