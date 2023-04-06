package com.smartlogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlogistics.entity.TrailerRouteEntity;

@Repository
public interface TrailerRouteRepo extends JpaRepository<TrailerRouteEntity, Long> {

}
