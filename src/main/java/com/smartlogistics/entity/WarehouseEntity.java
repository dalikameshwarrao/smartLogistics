package com.smartlogistics.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Warehouse")
@Data
public class WarehouseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "warehouse_id")
	private Long warehouseId;

	@Column(name = "warehouse_name")
	private String warehouseName;

	@Column(name = "location")
	private String location;

	@Column(name = "goods_count")
	private Integer goodsCount;

	@Column(name = "equipment_count")
	private Integer equipmentCount;

	@Column(name = "access_point_count")
	private Integer accessPointCount;

	@Column(name = "last_update")
	private Date lastUpdate;

}
