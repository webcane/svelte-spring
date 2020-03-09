package io.github.webcane.repo;

import io.github.webcane.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cane
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

    /**
     * @param checked
     * @return only check/unchecked items
     */
    List<Item> findByChecked(boolean checked);
}
