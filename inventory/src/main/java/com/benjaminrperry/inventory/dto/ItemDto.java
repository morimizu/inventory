package com.benjaminrperry.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto implements Serializable {
    private Long itemId;
    private String itemNumber;
    private String description;
    private Long categoryId;
    private double quantity;
    private String uom;
}
