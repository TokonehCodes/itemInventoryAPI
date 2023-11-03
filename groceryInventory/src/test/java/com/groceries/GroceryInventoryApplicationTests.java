package com.groceries;

import com.groceries.Entities.Item;
import com.groceries.Repo.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GroceryInventoryApplicationTests {

	@Autowired
	private ItemRepository testrepo;

	@Test
	void createItem() {
		Item item = new Item();
		item.setId(4);
		item.setName("big");
		item.setPrice(20d);
		item.setQuantity(7);
		testrepo.save(item);
	}

}
