package com.smartlogistics.service;

import java.util.List;

import com.smartlogistics.dto.NotificationResponseDTO;
import com.smartlogistics.entity.NotificationEntity;

public interface NotificationService {

	NotificationResponseDTO getAllnotificationsByType(Long warehouseId, Long assetId);
	
	//public List<NotificationEntity> findById(Long warehouseId, Long assetId);

}
