package com.smartlogistics.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlogistics.dto.Alerts;
import com.smartlogistics.dto.Events;
import com.smartlogistics.dto.Incidents;
import com.smartlogistics.dto.NotificationDTO;
import com.smartlogistics.dto.NotificationFieldsDTO;
import com.smartlogistics.dto.NotificationResponseDTO;
import com.smartlogistics.entity.NotificationEntity;
import com.smartlogistics.repository.NotificationRepository;
import com.smartlogistics.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	NotificationRepository notificationRepository;
	
		public static final String EVENT = "Event";
		public static final String INCIDENT = "Incident";
		public static final String ALERT = "Alert";
	

	
	@Override
	public NotificationResponseDTO getAllnotificationsByType(Long warehouseId, Long assetId) {
		NotificationResponseDTO notificationResponseDTO = new NotificationResponseDTO();
		Events events = new Events();
		Incidents incidents = new Incidents();
		Alerts alerts = new Alerts(); 
		List<NotificationEntity> eventNotificationEntityList = null;
		List<NotificationEntity> alertNotificationEntityList = null;
		List<NotificationEntity> incidentNotificationEntityList =null;
		if(warehouseId!=null && warehouseId >0L && assetId!=null && assetId>0L)
		{
			eventNotificationEntityList = notificationRepository.getNotifications(warehouseId,assetId,EVENT);
			alertNotificationEntityList = notificationRepository.getNotifications(warehouseId,assetId,ALERT);
			incidentNotificationEntityList = notificationRepository.getNotifications(warehouseId,assetId,INCIDENT);
		}
		else if(warehouseId!=null && warehouseId >0L)
		{
			eventNotificationEntityList = notificationRepository.getNotifications(warehouseId,EVENT);
			alertNotificationEntityList = notificationRepository.getNotifications(warehouseId,ALERT);
			incidentNotificationEntityList = notificationRepository.getNotifications(warehouseId,INCIDENT);
		}
		else if( assetId!=null && assetId>0L)
		{
			
			eventNotificationEntityList = notificationRepository.getNotifications(EVENT,assetId);
			alertNotificationEntityList = notificationRepository.getNotifications(ALERT,assetId);
			incidentNotificationEntityList = notificationRepository.getNotifications(INCIDENT,assetId);
		}
		else
		{
			
			eventNotificationEntityList = notificationRepository.getNotifications(EVENT);
			alertNotificationEntityList = notificationRepository.getNotifications(ALERT);
			incidentNotificationEntityList = notificationRepository.getNotifications(INCIDENT);
		}
		//System.out.println(eventNotificationEntityList);
		//System.out.println(alertNotificationEntityList);
		//System.out.println(incidentNotificationEntityList);
		String warehouseLoc= new String() ;
		if(!eventNotificationEntityList.isEmpty() && eventNotificationEntityList.size()>0)
		{
			warehouseLoc = eventNotificationEntityList.get(0).getWarehouseLoc();
		    notificationResponseDTO.setWarehouseId(String.valueOf(eventNotificationEntityList.get(0).getWarehouseId()));
		}
		
			if(!alertNotificationEntityList.isEmpty() && alertNotificationEntityList.size()>0)
			{
				warehouseLoc = alertNotificationEntityList.get(0).getWarehouseLoc();
				 notificationResponseDTO.setWarehouseId(String.valueOf(alertNotificationEntityList.get(0).getWarehouseId()));
			}
				
				if(!incidentNotificationEntityList.isEmpty() && incidentNotificationEntityList.size()>0)
				{
					warehouseLoc = incidentNotificationEntityList.get(0).getWarehouseLoc();
					 notificationResponseDTO.setWarehouseId(String.valueOf(incidentNotificationEntityList.get(0).getWarehouseId()));
				}
		// events list and count
		if(!eventNotificationEntityList.isEmpty()) {
			List<NotificationFieldsDTO> notificationFieldsDTOList = new ArrayList<>();
			for (NotificationEntity notificationEntity : eventNotificationEntityList) {
				NotificationFieldsDTO notificationFieldsDTO = new NotificationFieldsDTO();
				notificationFieldsDTO.setEquipLocation(notificationEntity.getEquipmentLocation());
				notificationFieldsDTO.setEquipType(notificationEntity.getEquipmentType());
				notificationFieldsDTO.setEquipUtilization(notificationEntity.getEquipmentUtilization());
				notificationFieldsDTO.setEventTime(notificationEntity.getEventDateAndTime());
				notificationFieldsDTO.setLocation(notificationEntity.getWarehouseLoc());
				notificationFieldsDTO.setRackerDetail(notificationEntity.getRackerDetails());
				notificationFieldsDTO.setReason(notificationEntity.getReason());
				notificationFieldsDTO.setTemperature(notificationEntity.getTemperature());
				notificationFieldsDTO.setTrackerBattery(notificationEntity.getTrackerBattery());
				notificationFieldsDTO.setTrackerId(notificationEntity.getTrackerId());
				notificationFieldsDTO.setTrackerStatus(notificationEntity.getTrackerStatus());
				notificationFieldsDTOList.add(notificationFieldsDTO);
			}
			events.setEventsList(notificationFieldsDTOList);
			events.setTotalCount(eventNotificationEntityList.size());
		}
		
		
		if(!alertNotificationEntityList.isEmpty()) {
			List<NotificationFieldsDTO> notificationFieldsDTOList = new ArrayList<>();
			for (NotificationEntity notificationEntity : alertNotificationEntityList) {
				NotificationFieldsDTO notificationFieldsDTO = new NotificationFieldsDTO();
				notificationFieldsDTO.setEquipLocation(notificationEntity.getEquipmentLocation());
				notificationFieldsDTO.setEquipType(notificationEntity.getEquipmentType());
				notificationFieldsDTO.setEquipUtilization(notificationEntity.getEquipmentUtilization());
				notificationFieldsDTO.setEventTime(notificationEntity.getEventDateAndTime());
				notificationFieldsDTO.setLocation(notificationEntity.getWarehouseLoc());
				notificationFieldsDTO.setRackerDetail(notificationEntity.getRackerDetails());
				notificationFieldsDTO.setReason(notificationEntity.getReason());
				notificationFieldsDTO.setTemperature(notificationEntity.getTemperature());
				notificationFieldsDTO.setTrackerBattery(notificationEntity.getTrackerBattery());
				notificationFieldsDTO.setTrackerId(notificationEntity.getTrackerId());
				notificationFieldsDTO.setTrackerStatus(notificationEntity.getTrackerStatus());
				notificationFieldsDTOList.add(notificationFieldsDTO);
			}
			
			alerts.setAlertsList(notificationFieldsDTOList);
			alerts.setTotalCount(alertNotificationEntityList.size());
			
		}
		
		
		if(!incidentNotificationEntityList.isEmpty()) {
			List<NotificationFieldsDTO> notificationFieldsDTOList = new ArrayList<>();
			for (NotificationEntity notificationEntity : incidentNotificationEntityList) {
				NotificationFieldsDTO notificationFieldsDTO = new NotificationFieldsDTO();
				notificationFieldsDTO.setEquipLocation(notificationEntity.getEquipmentLocation());
				notificationFieldsDTO.setEquipType(notificationEntity.getEquipmentType());
				notificationFieldsDTO.setEquipUtilization(notificationEntity.getEquipmentUtilization());
				notificationFieldsDTO.setEventTime(notificationEntity.getEventDateAndTime());
				notificationFieldsDTO.setLocation(notificationEntity.getWarehouseLoc());
				notificationFieldsDTO.setRackerDetail(notificationEntity.getRackerDetails());
				notificationFieldsDTO.setReason(notificationEntity.getReason());
				notificationFieldsDTO.setTemperature(notificationEntity.getTemperature());
				notificationFieldsDTO.setTrackerBattery(notificationEntity.getTrackerBattery());
				notificationFieldsDTO.setTrackerId(notificationEntity.getTrackerId());
				notificationFieldsDTO.setTrackerStatus(notificationEntity.getTrackerStatus());
				notificationFieldsDTOList.add(notificationFieldsDTO);
			}
			incidents.setIncidentsList(notificationFieldsDTOList);
			incidents.setTotalCount(incidentNotificationEntityList.size());
		}
		
		//notificationResponseDTO.setWarehouseId(String.valueOf(warehouseId));
		notificationResponseDTO.setWarehouseLoc(warehouseLoc);
		NotificationDTO notificationDTO = new NotificationDTO();
		notificationDTO.setEvents(events);
		notificationDTO.setAlerts(alerts);
		notificationDTO.setIncidents(incidents);
		notificationResponseDTO.setNotificationDTO(notificationDTO);
		return notificationResponseDTO;
	}



	
	
	

}
