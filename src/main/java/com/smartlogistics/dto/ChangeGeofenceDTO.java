package com.smartlogistics.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ChangeGeofenceDTO {
	
        private String assetId;
        
    	private String geofenceType;
    	
    	private String geofenceName;
    	
    	private Double geoLatitude;
    	
    	private Double geoLongitude;
    	
    	private Double geoRadius;
    	
    	private Boolean outGeofence;
    	
    	private Boolean backGeofence;
}
