package com.smartlogistics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="Access_Point_Tag")
public class AccessPointTagEntity {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid",strategy = "uuid")
	@Column(name="access_Point_Tag_Id")
	private String accessPointTagId;
	
	
	@Column(name="tracker_Id")
	private Long tracker_Id;
	
	
	
	 

}
