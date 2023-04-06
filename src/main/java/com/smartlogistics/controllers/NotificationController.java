package com.smartlogistics.controllers;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.dto.NotificationRequestDTO;
import com.smartlogistics.dto.NotificationResponseDTO;
import com.smartlogistics.service.NotificationService;




@RestController
@RequestMapping(path = "/smartlogistics")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/v1/getNotification")
	public NotificationResponseDTO getNotificationDetails( @RequestBody NotificationRequestDTO dto ) throws ValidationException  {
				
						Long warehouseId = dto.getWarehouseId();
						Long assetId =dto.getAssetId();
						return notificationService.getAllnotificationsByType(warehouseId,assetId);
	  
}
	
	
}