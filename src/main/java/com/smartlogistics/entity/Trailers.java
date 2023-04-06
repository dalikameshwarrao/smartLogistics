package com.smartlogistics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="Trailers")
@Entity
public class Trailers {
	
	@Id
	@Column(name="trailerId")
	private String trailerId;
	
	@Column(name="trailerName")
	private String trailerName;

}
