package com.benjaminrperry.inventory.repository;

import com.benjaminrperry.inventory.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    Optional<Item> getByUserIdAndItemNumberContaining(Long userId, String itemNumber);
    Optional<Item> getByUserIdAndItemId(Long userId, Long itemId);
    List<Item> getByUserId(Long userId);
    List<Item> getByUserIdAndCategoryId(Long categoryId,Long userId);
}
