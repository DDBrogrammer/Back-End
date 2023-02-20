package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.InventoryResponse;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {
   private  final InventoryRepository inventoryRepository;
   @Transactional(readOnly = true)
   /*@SneakyThrows*/
   public List<InventoryResponse> isInStock(List<String> skuCodes)  {
      /*log.info("Wait Started");
      Thread.sleep(10000);
      log.info("Wait end");*/
      return inventoryRepository.findBySkuCodeIn(skuCodes).stream()
              .map(inventory ->
         InventoryResponse.builder()
                 .skuCode(inventory.getSkuCode())
                 .isInStock(inventory.getQuantity()>0)
                 .build()
              ).toList();
   }
}
