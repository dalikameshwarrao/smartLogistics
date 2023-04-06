package com.smartlogistics.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.smartlogistics.dto.StoresDTO;

import lombok.Data;



@Data
@Entity
@Table(name="create_manifest")
public class CreateManifestEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="manifestId")
	private String manifestId;
	
	@Column(name="warehouse_Id")
	private String warehouseId;
	
	@Column(name="trailer_Id")
	private String trailerId;
	
	@Column(name="startDate")
	private Date   startDate;
	
	@Column(name="startTime")
	private Time   startTime;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = StoreEntity.class)
	private List<StoresDTO> stores;

}
