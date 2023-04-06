package com.smartlogistics.dto;

import java.sql.Date;

import lombok.Data;


@Data
public class TrailersRouteDTO {
	
	
	
	private Long trailerRouteDetailsId;

	
	private String trailerId;

	private String place;

	private String location;

	private String currentLocation;

	private Date date;

}
