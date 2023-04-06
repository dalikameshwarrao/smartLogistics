package com.smartlogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlogistics.entity.TrailersPalletEntity;

@Repository
public interface TrailersPalletRepo  extends JpaRepository<TrailersPalletEntity, Long>{

}
