package io.github.webcane.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cane
 */
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    @Column
    private boolean checked;

    @Column
    private String description;

    /**
     * Constructor
     */
    protected Item() {
    }

    /**
     * Constructor
     *
     * @param checked
     * @param description
     */
    public Item(boolean checked, String description) {
        this.checked = checked;
        this.description = description;
    }
}



