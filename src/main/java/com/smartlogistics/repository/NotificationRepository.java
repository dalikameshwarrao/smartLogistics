package com.smartlogistics.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartlogistics.entity.NotificationEntity;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long>{
		
		static final String QUERY_TO_GET_NOTIFICATIONS_BY_WAREHOUSEID_ASSETID =" select * from notification where warehouse_id=:warehouseId and asset_id=:assetId and notification_type=:notificationType ";
		static final String QUERY_TO_GET_NOTIFICATIONS_BY_TYPE =" select * from notification  where  notification_type=:notificationType ";
		static final String QUERY_TO_GET_NOTIFICATIONS_BY_WAREHOUSEID=" select * from notification where warehouse_id=:warehouseId  and notification_type=:notificationType ";
		static final String QUERY_TO_GET_NOTIFICATIONS_BY_ASSETID =" select * from notification where  notification_type=:notificationType and asset_id=:assetId  ";
		@Query(value = QUERY_TO_GET_NOTIFICATIONS_BY_WAREHOUSEID_ASSETID,nativeQuery = true)
		List<NotificationEntity> getNotifications(@Param("warehouseId")Long warehouseId, @Param("assetId")Long assetId,@Param("notificationType")String notificationType);

		@Query(value = QUERY_TO_GET_NOTIFICATIONS_BY_TYPE,nativeQuery = true)
		List<NotificationEntity> getNotifications(@Param("notificationType")String notificationType);
		
		@Query(value = QUERY_TO_GET_NOTIFICATIONS_BY_WAREHOUSEID,nativeQuery = true)
		List<NotificationEntity> getNotifications(@Param("warehouseId")Long warehouseId,@Param("notificationType")String notificationType);
		@Query(value = QUERY_TO_GET_NOTIFICATIONS_BY_ASSETID,nativeQuery = true)
		List<NotificationEntity> getNotifications(@Param("notificationType")String notificationType,@Param("assetId")Long assetId);
		
		
		
	
}
