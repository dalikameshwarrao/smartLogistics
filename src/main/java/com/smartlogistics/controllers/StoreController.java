package com.smartlogistics.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.entity.StoreEntity;
import com.smartlogistics.service.StoreService;


	 

@RestController
@RequestMapping("/smartlogistics")
public class StoreController {

	@Autowired
	private StoreService service;
	
	@PostMapping("insertStore")
	public ResponseEntity< StoreEntity> insertDetails(@RequestBody StoreEntity entity)
	{
		StoreEntity storeEntity=service.saveDeatils(entity);
		return new ResponseEntity<>(storeEntity,HttpStatus.OK);
		
	}
	
	@GetMapping("getAllStores")
	public List<StoreEntity>  getAll()
	{
		List<StoreEntity>  storeEntity=service.getAllStores();
		return storeEntity;
	}
}
