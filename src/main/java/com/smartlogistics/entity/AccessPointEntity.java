package com.smartlogistics.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "Access_Point")
@Data
public class AccessPointEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "access_point_id")
	private String accessPointId;

	@Column(name = "access_point_name")
	private String accessPointName;

	@Column(name = "status")
	private String status;

	@Column(name = "access_point_location")
	private String accessPointLocation;

	@Column(name = "warehouse_id")
	private Long warehouseId;

	

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = AccessPointTagEntity.class)
	@JoinColumn(name = "access_point_id", referencedColumnName = "access_point_id")
	private List<AccessPointTagEntity> tags;

}
