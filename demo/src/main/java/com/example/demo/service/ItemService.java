package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Cacheable(value = "items", key = "#id")
    public Optional<Item> getItemById(String id) {
        return itemRepository.findById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @CacheEvict(value = "items", key = "#id")
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    @CacheEvict(value = "items", key = "#item.id")
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }
}
