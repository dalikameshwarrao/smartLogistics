package com.smartlogistics.service;

import org.springframework.stereotype.Service;

import com.smartlogistics.dto.RootDTO;

@Service
public interface EquipmentService {
	public RootDTO getEquipmentDetail(Long warehouseId, String assetType);
}
