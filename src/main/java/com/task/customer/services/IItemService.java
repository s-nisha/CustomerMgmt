package com.task.customer.services;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public interface IItemService {
	    Item create(double price, String description);
	    Item findByID(int itemID);
	    Item buyItem(String itemID, long customerID);

}
