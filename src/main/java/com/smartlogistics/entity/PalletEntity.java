package com.smartlogistics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MD_Pallet_info")
public class PalletEntity {
	
	@Id
	@Column(name="palletId")
	private String palletId;
	
	@Column(name="palletName")
	private String palletName;

}
