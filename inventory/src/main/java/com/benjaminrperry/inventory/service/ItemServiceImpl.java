package com.benjaminrperry.inventory.service;

import com.benjaminrperry.inventory.converter.ItemConverter;
import com.benjaminrperry.inventory.domain.Item;
import com.benjaminrperry.inventory.dto.InventoryRecordDto;
import com.benjaminrperry.inventory.dto.ItemDto;
import com.benjaminrperry.inventory.dto.PageableInventoryRecordDto;
import com.benjaminrperry.inventory.dto.PageableItemDto;
import com.benjaminrperry.inventory.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    private ItemRepository itemRepository;

    public  ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    @Override
    public PageableItemDto listItemsByCategoryId(Long userId, Long categoryId) {
        if(userIsValid(userId)){
            List<Item> items = itemRepository.getByUserIdAndCategoryId(1L,categoryId);
            return new PageableItemDto(items.stream().map(ItemConverter::itemToItemDto).collect(Collectors.toList()));
        }
        return new PageableItemDto(null);
    }

    @Override
    public PageableItemDto listAllUserItem(Long userId) {
        if(userIsValid(userId)){
            List<Item> items = itemRepository.getByUserId(1L);
            return new PageableItemDto(mapItemListToDto(items));
        }
        return new PageableItemDto(null);
    }
    private List<ItemDto> mapItemListToDto(List<Item> items){
        return items.stream().map(ItemConverter::itemToItemDto).collect(Collectors.toList());
    }

    @Override
    public Optional<PageableItemDto> getItemById(Long userId, Long itemId) {
//        if(userIsValid(userId)){
//            Optional<Item> items = itemRepository.getByUserIdAndItemId(userId,itemId);
//            return Optional.of(new PageableItemDto(mapItemListToDto(new ArrayList<Item>(items.get())));
//        }
        return Optional.empty();
    }

    @Override
    public Optional<PageableItemDto> createItem(Long userId, ItemDto newItem) {
        return Optional.empty();
    }

    @Override
    public Optional<PageableItemDto> updateItem(Long userId, Long itemId, ItemDto newItem) {
        return Optional.empty();
    }

    @Override
    public void deleteItem(Long userId, Long itemId) {

    }

    @Override
    public boolean userIsValid(Long userId) {
        return true;
    }
}
