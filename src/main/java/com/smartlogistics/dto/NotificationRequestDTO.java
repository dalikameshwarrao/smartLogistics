package com.smartlogistics.dto;

import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationRequestDTO {

		@Nullable
		private Long warehouseId;
		
		@Nullable
		private Long assetId;
		
	
}
