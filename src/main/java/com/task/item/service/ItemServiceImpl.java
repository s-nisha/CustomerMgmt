package com.task.item.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.item.dao.ItemDAOImpl;
import com.task.item.entites.Item;

@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	ItemDAOImpl	 itemDAO;

	@Transactional
	@Override
	public Item create(double price, String description) {
	    Item item = new Item();
	    item.setItemPrice(price);
	    item.setItemDescription(description);
	    LocalDateTime localDateTime = LocalDateTime.now();
	    item.setItemAddedDate(localDateTime);
	    
	    Item items = itemDAO.add(item);
	    
		//create objects
		return items;
	}

	@Override
	public Item findByID(int itemID) {
		//call using DAO
		return itemDAO.findByID(itemID);
	}

	@Override
	public Item buyItem(int itemID, long customerID) {
		return itemDAO.buyItem(itemID, customerID);
	}

}
