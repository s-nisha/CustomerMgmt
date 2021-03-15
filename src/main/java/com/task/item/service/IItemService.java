package com.task.item.service;

import com.task.item.entites.Item;

public interface IItemService {
	    Item create(double price, String description);
	    Item findByID(int itemID);
	    Item buyItem(int itemID, long customerID);

}
