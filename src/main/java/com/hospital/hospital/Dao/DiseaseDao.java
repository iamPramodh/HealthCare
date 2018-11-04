package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Long>{

}
