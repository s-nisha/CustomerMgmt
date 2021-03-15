package com.task.customer.services;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.customer.dao.ItemDAOImpl;
import com.task.customer.entities.Items;

@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	ItemDAOImpl itemDAO;

	@Transactional
	@Override
	public Item create(double price, String description) {
	    Items item = new Items();
	    item.setItemPrice(price);
	    item.setItemDescription(description);
	    LocalDateTime localDateTime = LocalDateTime.now();
	    item.setItemAddedDate(localDateTime);
	    
	    Item items = itemDAO.add(price,description);
	    
		//create objects
		return items;
	}

	@Override
	public Item findByID(int itemID) {
		//call using DAO
		return itemDAO.findByID(itemID);
	}

	@Override
	public Item buyItem(String itemID, long customerID) {
		// who bought, what bought
		return null;
	}

}
