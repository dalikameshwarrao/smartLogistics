package com.smartlogistics.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "manifest")
@Entity
public class Manifest {

	@Id
	@Column(name = "manifestId")
	private String manifestId;

	@Column(name = "startDateandTime")
	private Date startDateandTime;

	@Column(name = "trailerId")
	private String trailerId;

	@Column(name = "sourceWarehouse")
	private String sourceWarehouse;

	@Column(name = "deliveryStores")
	private Long deliveryStores;

	@Column(name = "noOfPallets")
	private Long noOfPallets;

	@Column(name = "endLocation")
	private String endLocation;

	@Column(name = "endDatandTime")
	private Date endDatandTime;

	@Column(name = "manifestStatus")
	private String manifestStatus;

	@Column(name = "wrongDelivery")
	private Long wrongDelivery;

}
