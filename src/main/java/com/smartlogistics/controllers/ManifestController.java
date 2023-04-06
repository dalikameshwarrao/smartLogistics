package com.smartlogistics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.entity.CreateManifestEntity;
import com.smartlogistics.service.ManifestService;

@RestController
@RequestMapping("/smartlogistics")
public class ManifestController {
	
	@Autowired
	private ManifestService service;
	@PostMapping("/insertManifest")
	public ResponseEntity<CreateManifestEntity> saveDetails(@RequestBody  CreateManifestEntity manifestEntity)
	{
		CreateManifestEntity manifest=service.registerManifest(manifestEntity);
		return new ResponseEntity<>(manifest,HttpStatus.OK);
	}

}
