package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {
    @Id
    @SequenceGenerator(name = "ITEM_SEQ",allocationSize = 25)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ITEM_SEQ")
    private Long itemId;
    private Long userId;
    private Long categoryId;
    private String itemNumber;
    private String description;
}
