package io.github.webcane.service;

import io.github.webcane.model.Item;
import io.github.webcane.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cane
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository repo;

    public List<Item> getAllItems() {
        return repo.findAll();
    }

    public Item addItem(Item item) {
        item.setId(null);
        return repo.saveAndFlush(item);
    }

    public Item updateItem(Item item, Long id) {
        item.setId(id);
        return repo.saveAndFlush(item);
    }

    public void deleteItem(Long id) {
        repo.deleteById(id);
    }

    public List<Item> getAllCheckedItems() {
        return repo.findByChecked(true);
    }

    public List<Item> getAllUncheckedItems() {
        return repo.findByChecked(false);
    }
}
