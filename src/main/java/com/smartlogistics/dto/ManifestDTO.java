package com.smartlogistics.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.smartlogistics.entity.StoreEntity;

import lombok.Data;

@Data
public class ManifestDTO {
	
	
private String warehouseId;
	
	
	private String warehouseName;
	
	private String warehouseLocation;
	
	private String trailerId;
	
	private Date   dateAndTime;
	
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = StoreEntity.class)
	private List<StoresDTO> stores;

}
