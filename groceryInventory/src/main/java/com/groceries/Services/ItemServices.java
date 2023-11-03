package com.groceries.Services;

import com.groceries.Entities.Item;
import com.groceries.Repo.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemServices {

    Item saveItem(Item item);

    Item getItem(int Id);

    Item updateItem(Item item, int Id);

    Item updateItem(Item item);

    void deleteItem(int Id);

    List<Item> getAllItems();


}
