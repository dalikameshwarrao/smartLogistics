package com.smartlogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlogistics.entity.TrailersEntity;


@Repository
public interface TrailersEntityRepository extends JpaRepository<TrailersEntity, Long> {

}
