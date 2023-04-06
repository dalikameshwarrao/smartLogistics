package com.smartlogistics.service;

import java.util.List;

import com.smartlogistics.entity.TrailersEntity;

public interface TrailerService {
	
	
	public TrailersEntity saveDetails(TrailersEntity entity);
	
	public List<TrailersEntity>  getAll();

}
