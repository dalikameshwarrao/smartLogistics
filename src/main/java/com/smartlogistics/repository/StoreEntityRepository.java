package com.smartlogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlogistics.entity.StoreEntity;

@Repository
public interface StoreEntityRepository extends JpaRepository<StoreEntity, String>{

}
