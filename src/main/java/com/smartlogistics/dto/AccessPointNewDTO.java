package com.smartlogistics.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AccessPointNewDTO {

	private String accessPointName;

	private String status;

	private String accessPointLocation;

	private Long warehouseId;

	private List<AccessPointTagDTO> tags;
}
