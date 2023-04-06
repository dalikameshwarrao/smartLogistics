package com.smartlogistics.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlogistics.entity.CreateManifestEntity;
import com.smartlogistics.repository.ManifestRepository;
import com.smartlogistics.service.ManifestService;

@Service
public class ManifestServiceImpl implements ManifestService{

	
	@Autowired
	private ManifestRepository manifestRepo;
	
	
	@Override
	public CreateManifestEntity registerManifest(CreateManifestEntity entity) {
		// TODO Auto-generated method stub
		return manifestRepo.save(entity);
	}

}
