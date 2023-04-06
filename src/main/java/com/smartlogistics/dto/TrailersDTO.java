package com.smartlogistics.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.smartlogistics.entity.AccessPointTagEntity;
import com.smartlogistics.entity.TrailerRouteEntity;

import lombok.Data;

@Data
public class TrailersDTO {

	private String trailerName;

	private Long warehouseId;

	private Long manifestId;

	private Long trackerId;

	private String status;

	private Integer noOfPallets;

	private Long deliveryStoreCount;

	private String startLocation;

	private String endLocation;

	private String currentLocation;
	
	private Long currentLattitude;
	
	private Long currentLongitude;

	private List<PalletDTO> palletsList;

}
