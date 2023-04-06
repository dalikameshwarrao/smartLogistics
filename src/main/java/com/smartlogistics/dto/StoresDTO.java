package com.smartlogistics.dto;

import java.sql.Date;
import java.util.List;

import lombok.Data;
@Data
public class StoresDTO {
	
	
	private String storeName;

	private Double storeLattitude;

	private Double storeLongitude;
	
	private String manifestId;

	private Date deliveryDate;

	private Integer noOfPallet;

	private String storeLocation;
	
	private List<PalletDTO>  pallets;

}
