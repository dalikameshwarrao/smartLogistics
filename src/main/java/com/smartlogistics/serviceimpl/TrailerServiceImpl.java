package com.smartlogistics.serviceimpl;

import java.sql.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlogistics.entity.StoreEntity;
import com.smartlogistics.entity.TrailerRouteEntity;
import com.smartlogistics.entity.TrailersEntity;
import com.smartlogistics.entity.TrailersPalletEntity;
import com.smartlogistics.entity.WarehouseEntity;
import com.smartlogistics.repository.StoreEntityRepository;
import com.smartlogistics.repository.TrailerRouteRepo;
import com.smartlogistics.repository.TrailersEntityRepository;
import com.smartlogistics.repository.WarehouseRepository;
import com.smartlogistics.service.TrailerService;

@Service
public class TrailerServiceImpl implements TrailerService {

	@Autowired
	private TrailersEntityRepository repository;

	@Autowired
	private WarehouseRepository warehouseRepository;
	@Autowired
	private TrailerRouteRepo trailerRouteRepo;
	@Autowired
	private StoreEntityRepository storeEntityRepository;

	@Override
	public TrailersEntity saveDetails(TrailersEntity entity) {
		TrailersEntity trailer = repository.save(entity);
		List<String> stores = trailer.getPalletInfo().stream().map(a -> a.getStoreName()).collect(Collectors.toList());
		Set<String> storeNames = new LinkedHashSet<>(stores);

		TrailerRouteEntity trailerRouteEntity = new TrailerRouteEntity();
		trailerRouteEntity.setTrailerId(trailer.getTrailerId());

		WarehouseEntity wareHouse = warehouseRepository.getById(trailer.getWarehouseId());
		trailerRouteEntity.setPlace(wareHouse.getWarehouseName());
		trailerRouteEntity.setLocation(wareHouse.getLocation());
		trailerRouteEntity.setCurrentLocation(trailer.getCurrentLocation());
		trailerRouteEntity.setDate(new Date(new java.util.Date().getTime()));
		trailerRouteRepo.save(trailerRouteEntity);

		Iterator<String> itr = storeNames.iterator();
		while (itr.hasNext()) {
			String storeName = itr.next();
			System.out.println(storeName + "storeName");
			StoreEntity store = storeEntityRepository.getById(storeName);
			TrailerRouteEntity trailerRoute = new TrailerRouteEntity();
			trailerRoute.setTrailerId(trailer.getTrailerId());
			trailerRoute.setPlace(storeName);
			trailerRoute.setLocation(store.getStoreLocation());
			trailerRouteRepo.save(trailerRoute);
		}

		return trailer;
	}

	@Override
	public List<TrailersEntity> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
