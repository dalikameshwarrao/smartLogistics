package com.smartlogistics.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table(name = "Md_Trailers_info")
@Entity
public class TrailersEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "trailer_Id")
	private String trailerId;

	@Column(name = "trailer_Name")
	private String trailerName;

	@Column(name = "warehouse_Id")
	private Long warehouseId;

	@Column(name = "manifest_Id")
	private String manifestId;

	@Column(name = "tracker_Id") //don't consider
	private Long trackerId;

	@Column(name = "status")//don't consider
	private String status;

	@Column(name = "no_Of_Pallets")
	private Integer noOfPallets;

	@Column(name = "delivery_Store_Count")//columnDefinition="long default 0")
	private long deliveryStoreCount;

	@Column(name = "start_Location")
	private String startLocation;

	@Column(name = "end_Lcation")
	private String endLocation;

	@Column(name = "current_Location")//don't consider
	private String currentLocation;

	@Column(name = "current_Lattitude")//don't consider
	private Double currentLattitude;

	@Column(name = "current_Longitude")//don't consider
	private Double currentLongitude;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = TrailersPalletEntity.class)

	@JoinColumn(name = "trailer_Id")
	private List<TrailersPalletEntity> palletInfo;

}
