package com.smartlogistics.service;

import java.util.List;

import com.smartlogistics.entity.StoreEntity;

public interface StoreService {
	
	public StoreEntity saveDeatils(StoreEntity entity);
	
	
	public List<StoreEntity>  getAllStores();

}
