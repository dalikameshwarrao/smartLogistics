package com.smartlogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartlogistics.entity.CreateManifestEntity;

@Repository
public interface ManifestRepository extends JpaRepository<CreateManifestEntity, String>{

}
