package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Complaints;

@Repository
public interface ComplaintsDao extends JpaRepository<Complaints, Long>{

}
