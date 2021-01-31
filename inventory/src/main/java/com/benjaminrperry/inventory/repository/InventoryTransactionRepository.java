package com.benjaminrperry.inventory.repository;

import com.benjaminrperry.inventory.domain.InventoryTransaction;
import com.benjaminrperry.inventory.dto.InventoryRecordDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventoryTransactionRepository extends JpaRepository<InventoryTransaction,Long> {
    @Query("Select new ")
    List<InventoryRecordDto> getUserInventory(Long userId);
}
