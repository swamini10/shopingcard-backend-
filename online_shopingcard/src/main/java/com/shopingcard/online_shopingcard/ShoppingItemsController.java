package com.shopingcard.online_shopingcard;


import org.springframework.web.bind.annotation.RestController;

import com.shopingcard.online_shopingcard.model.ShoppingItem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class ShoppingItemsController {

    @Autowired
    private ShoppingItemRepository shoppingItemRepository;

    @GetMapping(path = "/v1/items")
    public List<ShoppingItem> getAllItems() {
        return shoppingItemRepository.findAll();

}}
