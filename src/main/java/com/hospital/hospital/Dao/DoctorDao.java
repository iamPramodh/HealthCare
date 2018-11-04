package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long>{

}
