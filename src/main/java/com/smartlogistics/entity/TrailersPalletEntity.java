package com.smartlogistics.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="TrailersPalletsInfos")
public class TrailersPalletEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid",strategy = "uuid")
	@Column(name = "triler_Pallet_Info_Id")
	private String trilerPalletInfoId;


	@Column(name = "pallet_Id")
	private String palletId;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "store_Location")
	private String storeLocation;

	@Column(name = "tracker_Id")//mention blank
	private String trackerId;

	@Column(name = "status")//mention blank
	private String status;

	//@Column(name = "dispatched_Date")//we need discuss with namratha
	//private Date dispatchedDate;

	@Column(name = "delivered_Date")
	private Date deliveredDate;

	@Column(name = "temperature")//mention blank
	private Double temperature;

	@Column(name = "humididty")//mention blank
	private Double humidity;

	@Column(name = "pressure")//mention blank
	private Double pressure;

	@Column(name = "pallet_Ready_For_Shippment")
	private Date palletReadyForShippment;

	@Column(name = "left_Grocery_Warehoue")
	private Date leftGroceryWarehouse;

	@Column(name="inTransit")
	private Date inTransit;

	@Column(name="storeReachedDate")
	private Date storeReachedDate;
	
	@Column(name="is_Incident")
	private Boolean isIncident;

	@Column(name="is_Delayed")
	private Boolean isDelayed;
	
	
	/*
	 @ManyToOne(fetch = FetchType.LAZY)
	 
	  @JoinColumn(name = "trailer_Id") private TrailersEntity trailersEntity;
	 */
}
