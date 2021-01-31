package com.benjaminrperry.inventory.service;

import com.benjaminrperry.inventory.domain.Item;
import com.benjaminrperry.inventory.dto.InventoryRecordDto;
import com.benjaminrperry.inventory.dto.ItemDto;
import com.benjaminrperry.inventory.dto.PageableInventoryRecordDto;
import com.benjaminrperry.inventory.dto.PageableItemDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    PageableItemDto listItemsByCategoryId(Long userId, Long categoryId);
    PageableItemDto listAllUserItem(Long userId);
    Optional<PageableItemDto> getItemById(Long userId, Long itemId);
    Optional<PageableItemDto> createItem(Long userId, ItemDto newItem);
    Optional<PageableItemDto> updateItem(Long userId,Long itemId, ItemDto newItem);
    void deleteItem(Long userId,Long itemId);
    boolean userIsValid(Long userId);

}
