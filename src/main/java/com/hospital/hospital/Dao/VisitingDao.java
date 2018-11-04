package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Visiting;
@Repository
public interface VisitingDao extends JpaRepository<Visiting, Long>{

}
