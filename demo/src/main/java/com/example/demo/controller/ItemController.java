package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping
	public ResponseEntity<Item> createItem(@RequestBody Item item) {
		Item newItem = itemService.createItem(item);
		return ResponseEntity.ok(newItem);
	}

	@GetMapping
	public ResponseEntity<List<Item>> getAllItems() {
		return ResponseEntity.ok(itemService.getAllItems());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById(@PathVariable String id) {
		Optional<Item> item = itemService.getItemById(id);
		return item.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Item> updateItem(@PathVariable String id, @RequestBody Item item) {
		item.setId(id);
		Item updatedItem = itemService.updateItem(item);
		return ResponseEntity.ok(updatedItem);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteItem(@PathVariable String id) {
		itemService.deleteItem(id);
		return ResponseEntity.noContent().build();
	}
}
