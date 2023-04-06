package com.smartlogistics.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlogistics.entity.StoreEntity;
import com.smartlogistics.repository.StoreEntityRepository;
import com.smartlogistics.service.StoreService;


@Service
public class StoreServiceImpl  implements StoreService{

	@Autowired
	private StoreEntityRepository repository;
	
	@Override
	public StoreEntity saveDeatils(StoreEntity entity) {
		return repository.save(entity);
	}

	@Override
	public List<StoreEntity> getAllStores() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	




	
	

	
}
