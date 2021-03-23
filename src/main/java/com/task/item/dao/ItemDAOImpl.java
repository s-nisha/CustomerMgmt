/*
package com.task.item.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.task.customer.entities.Customer;
import com.task.item.entites.Item;




@Repository
public class ItemDAOImpl implements IItemDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	@Override
	public Item add(Item item) {
		entityManager.persist(item);
		return item;
	}
	
    @Transactional
	@Override
	public Item update(Item item) {
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item findByID(int itemID) {
		return entityManager.find(Item.class, itemID);
	}

	@Transactional
	public Item buyItem(int itemID, long customerID) {
		// find item 
		Item item = entityManager.find(Item.class , itemID) ; 
		// find customer
		Customer cus = entityManager.find(Customer.class, customerID);
		item.setBoughtBy(cus);
		// set<item> items;
		Set<Item> items = cus.getBoughtItems();
		if(items == null)
			items = new HashSet<Item>();
		items.add(item);
		
		entityManager.merge(item);
		entityManager.merge(cus);
		
		return entityManager.find(Item.class, item.getItemId());
	}

	
}
*/
