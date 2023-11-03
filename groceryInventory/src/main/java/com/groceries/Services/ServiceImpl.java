package com.groceries.Services;

import com.groceries.Entities.Item;
import com.groceries.Repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ItemServices{

    @Autowired
    private ItemRepository repository;

    @Override
    public Item saveItem(Item item) {
        return repository.save(item);
    }

    @Override
    public Item getItem(int Id) {
        return repository.findById(Id).get();
    }

    @Override
    public Item updateItem(Item item, int Id) {
        return repository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return repository.save(item);
    }

    @Override
    public void deleteItem(int Id) {
        repository.deleteById(Id);
    }

    @Override
    public List<Item> getAllItems() {
        return repository.findAll();
    }
}
