package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class ItemCategory {
    @Id
    @SequenceGenerator(name = "ITEM_CAT_SEQ",allocationSize = 25)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ITEM_CAT_SEQ")
    private Long id;
    private String name;
    private String Description;
}
