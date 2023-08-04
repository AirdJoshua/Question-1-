package com.developer.JoshuaAird.controller;


import com.developer.JoshuaAird.dto.request.ItemReq;
import com.developer.JoshuaAird.dto.response.ItemRes;
import com.developer.JoshuaAird.entity.ItemEn;
import com.developer.JoshuaAird.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemCon {

    private final ItemService itemServices;

    public ItemCon(ItemService itemServices) {
        this.itemServices = itemServices;
    }

    @GetMapping
    public List<ItemEn> findAllItem() {
        return itemServices.findAllItem();
    }

    @GetMapping("/{id}")
    public Optional<ItemEn> findItemById(@PathVariable("id") Long id) {
        return itemServices.findById(id);
    }

    @PostMapping
    public ItemEntity saveItem(@RequestBody ItemEntity itemEn) {
        return itemServices.saveItem(itemEntity);
    }

    @PutMapping
    public ItemEntity updateItem(@RequestBody ItemEntity itemEn) {
        return itemServices.updateItem(itemEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable("id") Long id) {
        itemServices.deleteItem(id);
    }

//    Using Request and Response with save and update item

    @PostMapping("/res")
    public ItemResponse saveItemResponse(@RequestBody ItemRequest itemRequest) {
        return itemServices.saveItem(itemRequest);
    }

    @PutMapping("/res/{id}")
    public ItemResponse updateItemResponse(@RequestBody ItemRequest itemRequest, @PathVariable("id") Long id) {
        return itemServices.updateItem(itemRequest, id);
    }

}
