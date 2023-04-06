package com.smartlogistics.controllers;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartlogistics.dto.AssetDTO;
import com.smartlogistics.dto.ChangeGeofenceDTO;
import com.smartlogistics.entity.AssetEntity;
import com.smartlogistics.exception.AssetRuntimeException;
import com.smartlogistics.repository.AssetRepository;
import com.smartlogistics.service.AssetService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/smartlogistics")
public class AssetController {

	@Autowired
	private AssetRepository repository;

	@Autowired
	private AssetService service;

	@PostMapping("/insertAsset")
	public ResponseEntity<AssetEntity> registerAssetDetails(@RequestBody @Valid AssetDTO assetDTO) {
		log.info("In AssetController...registerAssetDetails() started");
		try {

			log.info("In AssetController...registerAssetDetails() Registred");
			AssetEntity assetEntity = new AssetEntity();

			BeanUtils.copyProperties(assetDTO, assetEntity);

			if (assetEntity.getGeofenceType() != null && assetEntity.getGeofenceType().equalsIgnoreCase("circular")) {
				assetEntity.setGeofenceType("Circular");
				if (assetEntity.getGeoLatitude() == 0) {

				}
				if ( assetEntity.getGeoLongitude() == 0) {

					
				}

			}

			if (assetEntity.getGeofenceType() != null && assetEntity.getGeofenceType().equalsIgnoreCase("polygon")) {
				assetEntity.setGeofenceType("Polygon");
			}

			AssetEntity entity = service.saveAssetDetails(assetEntity);
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/changeGeofenceConfig")
	public ResponseEntity<AssetEntity> changeGeofenceConfig(@RequestBody ChangeGeofenceDTO changeGeofenceDTO)
			throws ValidationException {
		log.info("In AssetController...changeGeofenceConfig() started");
		try {

			log.info("In AssetController...registerAssetDetails() Registred");
			AssetEntity entity = new AssetEntity();
			if (changeGeofenceDTO != null && changeGeofenceDTO.getAssetId() != null) {
				entity = service.changeGeofenceConfig(changeGeofenceDTO);
			} else {
				throw new ValidationException("In correct data - Please provide valid assetid..");
			}
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
