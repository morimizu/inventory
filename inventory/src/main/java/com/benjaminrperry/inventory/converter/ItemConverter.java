package com.benjaminrperry.inventory.converter;

import com.benjaminrperry.inventory.domain.Item;
import com.benjaminrperry.inventory.dto.ItemDto;

public class ItemConverter {
    public static ItemDto itemToItemDto(Item item){
        ItemDto dto = new ItemDto();
        dto.setItemId(item.getItemId());
        dto.setItemNumber(item.getItemNumber());
        dto.setDescription(item.getDescription());
        dto.setCategoryId(item.getCategoryId());
        return dto;
    }
    public static Item itemDtoToItem(ItemDto dto){
        Item item = new Item();
        item.setItemId(dto.getItemId());
        item.setItemNumber(dto.getItemNumber());
        item.setDescription(dto.getDescription());
        item.setCategoryId(dto.getCategoryId());
        return item;
    }
}
