package com.task.customer.dao;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;





public interface IItemDAO {
	
    Item update(Item item);
    Item findByID(int itemID);
	Item add(Item item);

}
