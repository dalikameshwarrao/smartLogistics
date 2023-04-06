package com.smartlogistics.dto;

import java.sql.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PalletDTO {

	
	  private String palletId;
	  
	  private String storeId;
	  
	  private String storeLocation;
	  
	  private String storeName;
	  
	  private String trackerId;
	  
	  private String status;
	  
	  private Date dispatchedDate;
	  
	  private Date deliveredDate;
	  
	  private Double temperature;
	  
	  private Double humidity;
	  
	  private Double pressure;
	  
	  private Date palletReadyForShippment;
	  
	  private Date leftGroceryWarehouse;
	  
	  private Date inTransit;
	  
	  private Date storeReachedDate;
	  
	  private Boolean isInTransit;
	  
	  private Boolean isIncident;
	  
	  private Boolean isDelayed;
	 
	
    
}
