package com.task.customer.dao;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public interface IItemDAO {
	Item add(Item item);
    Item update(Item item);
    Item findByID(int itemID);

}
