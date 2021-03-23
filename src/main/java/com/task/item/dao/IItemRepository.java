package com.task.item.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.item.entites.Item;

public interface IItemRepository extends JpaRepository<Item, String>{

}
