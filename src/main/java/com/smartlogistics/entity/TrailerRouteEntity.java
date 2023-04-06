package com.smartlogistics.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table(name = "TrailerRoute")
@Entity
public class TrailerRouteEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid",strategy = "uuid")
	@Column(name = "trailer_Route_Details_Id")
	private String trailerRouteDetailsId;

	
	@Column(name = "trailer_Id")
	private String trailerId;

	@Column(name = "place")
	private String place;

	@Column(name = "location")
	private String location;

	@Column(name = "current_Location")
	private String currentLocation;

	@Column(name = "date")
	private Date date;
}
