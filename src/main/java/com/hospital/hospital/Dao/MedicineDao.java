package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Long>{

}
