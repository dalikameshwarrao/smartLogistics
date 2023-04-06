package com.smartlogistics.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Store_Table")
public class StoreEntity {

	@Id
	@Column(name = "store_Name")
	private String storeName;

	@Column(name = "store_Lattitude")
	private Double storeLattitude;

	@Column(name = "store_Longitude")
	private Double storeLongitude;
	
	@Column(name = "manifestId")
	private String manifestId;

	@Column(name = "delivery_Date")
	private Date deliveryDate;

	@Column(name = "no_Of_Pallet")
	private Integer noOfPallet;

	@Column(name = "store_Location")
	private String storeLocation;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = PalletEntity.class)
	private List<PalletEntity> pallets;
}
