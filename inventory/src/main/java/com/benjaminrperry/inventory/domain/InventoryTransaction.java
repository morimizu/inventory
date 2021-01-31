package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Data
public class InventoryTransaction {
    @Id
    @SequenceGenerator(name = "TRANS_SEQ",allocationSize = 25)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRANS_SEQ")
    private Long transactionId;
    private Long userId;
    private Long locatorId;
    private Long itemId;
    private double quantity;
    private String uom;
    private LocalDateTime transactionDate;
}
