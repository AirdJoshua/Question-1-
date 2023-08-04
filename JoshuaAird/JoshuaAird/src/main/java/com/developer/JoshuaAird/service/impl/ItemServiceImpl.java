package com.developer.JoshuaAird.service.impl;

import com.developer.JoshuaAird.dto.mapper.ItemMapper;
import com.developer.JoshuaAird.dto.request.ItemReq;
import com.developer.JoshuaAird.dto.response.ItemRes;
import com.developer.JoshuaAird.entity.ItemEn;
import com.developer.JoshuaAird.repository.Itemrepo;
import com.developer.JoshuaAird.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    private final itemrepos itemrepos;

    public ItemServiceImpl(Itemrepo itemrepos) {
        this.itemrepos = itemrepos;
    }

    @Override
    public List<ItemEn> findAllItem() {
        return itemrepos.findAll();
    }

    @Override
    public Optional<ItemEn> findById(Long id) {
        return itemrepos.findById(id);
    }

    @Override
    public ItemEn saveItem(ItemEn itementity) {
        return itemrepos.save(ItemEn);
    }

    @Override
    public ItemEn updateItem(ItemEn itementity) {
        return itemrepos.save(ItemEn);
    }

    @Override
    public void deleteItem(Long id) {
        itemrepos.deleteById(id);
    }



    @Override
    public ItemRes saveItem(ItemReq ItemRequest) {
        ItemEn ItemEn = ItemMapper.MAPPER.fromRequestToEntity(ItemRequest);
        itemrepos.save(ItemEn);
        return ItemMapper.MAPPER.fromEntityToResponse(ItemEn);
    }

    @Override
    public ItemRes updateItem(ItemReq itemRequest, Long id) {

        Optional<ItemEn> checkExistingItem = findById(id);
        if (! checkExistingItem.isPresent())
            throw new RuntimeException(" Id "+ id + " Not Found!");

        ItemEn ItemEn = ItemMapper.MAPPER.fromRequestToEntity(ItemReq);
        ItemEn.setId(id);
        itemrepos.save(ItemEn);
        return ItemMapper.MAPPER.fromEntityToResponse(ItemEn);
    }

}