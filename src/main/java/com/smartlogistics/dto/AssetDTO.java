package com.smartlogistics.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class AssetDTO {
	
	
	@NotBlank(message = "assetType cannot be blank")
	@NotEmpty
	private String assetType;
	
	private String goodsType;
	
	private Long warehouseId;
	
	@NotBlank(message = "assetName cannot be blank")
	@NotEmpty
	private String assetName;
	
	private Long trackerId;
	
	@NotBlank(message = "trackerName cannot be blank")
	@NotEmpty
	private String trackerName;
	
	@NotBlank(message = "trackerStatus cannot be blank")
	@NotEmpty
	private String trackerStatus;
	
	private Double trackerBattery;
	
	private Double temperature;
	
	private Double noOfUnit;
	
	private String source;
	
	private String category;
	
	private Date packagePickedUp;
	
	private Date initialScan;
	
	private Date staggingAndTagging;
	
	private Date putaway;
	
	@NotBlank(message = "assetLocation cannot be blank")
	@NotEmpty
	private String assetLocation;
	
	private Date connected;
	
	private String statgeOfBox;
	
	@NotBlank(message = "geofenceType cannot be blank")
	@NotEmpty
	private String geofenceType;
	
	@NotBlank(message = "geofenceName cannot be blank")
	@NotEmpty
	private String geofenceName;
	
	private Double geoLatitude;
	
	private Double geoLongitude;
	
	private Double radius;
	
	private Boolean outsideGeofence;
	
	private Boolean backToGeofence;
	
	private String equipmentType;
	
	private Double equipmentUtilization;
	
	private String equipmentState;
	
	private String equipmentOperator;
	
	private Date lastUpdate;
	
	private String make;
	
	private String dimension;
	

}
