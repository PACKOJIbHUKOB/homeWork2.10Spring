package pro.sky.homeWork2.Spring.service;

import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

public interface Bascketservice {
    List<Integer> add (List<Integer>ids);

    List<Integer> get();
}
