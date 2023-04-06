package com.smartlogistics.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.entity.WarehouseEntity;
import com.smartlogistics.repository.WarehouseRepository;
import com.smartlogistics.service.NotificationService;
import com.smartlogistics.service.WarehouseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/smartlogistics")
public class WarehouseController {

	@Autowired
	private WarehouseService service;

	@Autowired
	private WarehouseRepository repository;
	
	@Autowired
	NotificationService notificationService;

	@PostMapping("/insertWarehouse")
	public ResponseEntity<WarehouseEntity> insertWarehouse(@RequestBody WarehouseEntity warehouseEntity) 
	{
		log.info("In WarehouseController...insertWarehouse() started");
		try {
			log.info("In WarehouseController...insertWarehouse() registred");
			WarehouseEntity entity = service.registerWarehouseDetails(warehouseEntity);
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception

			log.error("In WarehouseController...insertWarehouse() error message");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	@GetMapping("/getAllWarehouses")
	public ResponseEntity<List<WarehouseEntity>> getListOfWarehouses()
	{
		log.info("In WarehouseController...getListOfWarehouses() started");
		try {
			
			log.info("In WarehouseController...getListOfWarehouses() registred");
			List<WarehouseEntity> warehouses=service.getListAllWarehouses();
			return new ResponseEntity<>(warehouses,HttpStatus.OK);
			
		} catch (Exception e) {
			
			log.error("In WarehouseController...insertWarehouse() error message");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping("/updateWarehouse")
	public ResponseEntity<?> updateDetails(@RequestBody WarehouseEntity entity)
	{
		try {
			
			service.updateWarehouseDetails(entity);
			return  new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
