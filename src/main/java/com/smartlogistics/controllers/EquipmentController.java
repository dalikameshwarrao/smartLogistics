package com.smartlogistics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.dto.RootDTO;
import com.smartlogistics.service.EquipmentService;

@RestController
@RequestMapping(path = "/smartlogistics")
public class EquipmentController {
	@Autowired
	EquipmentService equipmentService;

	@GetMapping("/v1/getEquipmentDetail/{warehouseId}/{assetType}")
	public ResponseEntity<?> getEquipmentDetails(@PathVariable Long warehouseId,@PathVariable String assetType ){
		RootDTO rootDTO = new RootDTO();
		rootDTO=equipmentService.getEquipmentDetail(warehouseId, assetType);
			
		return new ResponseEntity<>(rootDTO,HttpStatus.OK);
		
	}
}
