package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Medication;
@Repository
public interface MedicationDao extends JpaRepository<Medication, Long>{

}
