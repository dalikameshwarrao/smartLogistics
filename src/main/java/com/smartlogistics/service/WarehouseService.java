package com.smartlogistics.service;

import java.util.List;

import com.smartlogistics.entity.WarehouseEntity;

public interface WarehouseService {

	
	public WarehouseEntity registerWarehouseDetails(WarehouseEntity  warehouseEntity);
	
	public List<WarehouseEntity> getListAllWarehouses();
	
	public void updateWarehouseDetails(WarehouseEntity entity);

}
