package io.github.webcane.spring;

import io.github.webcane.model.Item;
import io.github.webcane.repo.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by cane
 */
@Slf4j
@Component
public class ItemLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ItemRepository repo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Item item1 = new Item(true, "first checked item");
        item1 = repo.save(item1);
        log.info("Added item: " + item1);

        Item item2 = new Item(false, "second unchecked item");
        item2 = repo.save(item2);
        log.info("Added item: " + item2);
    }
}
