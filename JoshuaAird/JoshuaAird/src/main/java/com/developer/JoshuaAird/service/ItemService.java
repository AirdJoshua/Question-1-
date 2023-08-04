package com.developer.JoshuaAird.service;

import com.developer.JoshuaAird.entity.ItemEnEn;

import java.util.List;
import java.util.Optional;
public interface ItemService {
    List<ItemEn> findAllItem();
    Optional<ItemEn> findById(Long id);
    ItemEn saveItem(ItemEn itementity);
    ItemEn updateItem(ItemEn itementity);
    void deleteItem(Long id);
  

}
