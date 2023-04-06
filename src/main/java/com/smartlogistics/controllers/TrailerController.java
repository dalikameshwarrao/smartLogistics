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

import com.smartlogistics.entity.StoreEntity;
import com.smartlogistics.entity.TrailersEntity;
import com.smartlogistics.service.TrailerService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("ma/srtlogistics")
@RestController
@Slf4j
public class TrailerController {

	@Autowired
	private TrailerService service;

	@PostMapping("insertTrailerDetails")
	public ResponseEntity<TrailersEntity> inserDetails(@RequestBody TrailersEntity entity) {
		log.info("In TrailerController...inserDetail() methode has started ");
		try {
			log.info("In TrailerController...insertDetails() method registred");
			TrailersEntity trailerEntity = service.saveDetails(entity);
			return new ResponseEntity<>(trailerEntity, HttpStatus.OK);

		} catch (Exception e) {
			log.error("In TrailerController...insertDetails() error message accured" + e.getMessage());
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("getAllTrailers")
	public List<TrailersEntity> getAll() {

		log.info("In TrailerController...getAll() method registred");
		List<TrailersEntity> trailersEntity = service.getAll();
		return trailersEntity;

	}

}
