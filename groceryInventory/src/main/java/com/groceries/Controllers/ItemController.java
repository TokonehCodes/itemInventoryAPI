package com.groceries.Controllers;

import com.groceries.Entities.Item;
import com.groceries.Services.ItemServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    ItemServices service;

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

    @GetMapping
    public List<Item> getItems(){
        LOGGER.info("All items were returned");
        return service.getAllItems();
    }

    @GetMapping(value="/{Id}")
    public Item getItem(@PathVariable("Id") int id){
        LOGGER.info("Requested Item with id " + id);
        return service.getItem(id);
    }

    @PutMapping(value="/{Id}")
    public Item updateItem(@PathVariable("Id") int id, @RequestBody Item item){
        item.setId(id);
        LOGGER.info("Item " + id + "was updated");
        return service.updateItem(item);
    }

    @PostMapping()
    public Item saveItem(@RequestBody Item item){
        LOGGER.info("New item created with details: " + item);
        return service.saveItem(item);
    }

    @DeleteMapping(value="/{Id}")
    public void deleteItem(@PathVariable("Id") int Id){
        LOGGER.info("Item " + Id +" was deleted");
        service.deleteItem(Id);
    }
}
