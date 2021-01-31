package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Locator {
    @Id
    @SequenceGenerator(name = "LOC_SEQ",allocationSize = 25)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "LOC_SEQ")
    private Long locatorId;
    private Long userId;
    private String locatorNumber;
    private String description;
}
