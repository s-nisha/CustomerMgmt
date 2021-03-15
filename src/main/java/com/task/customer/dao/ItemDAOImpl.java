package com.task.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.stereotype.Repository;




@Repository
public abstract class ItemDAOImpl implements IItemDAO {
	
	@PersistenceContext
	EntityManager entityManager;


	@Override
	@Transactional
	public Item add(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item update(Item item) {
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item findByID(int itemID) {
		return entityManager.find(Item.class, itemID);
	}

	public Item add(double price, String description) {
		return null;
	}

	
}
