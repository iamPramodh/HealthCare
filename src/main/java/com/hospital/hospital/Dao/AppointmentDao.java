package com.hospital.hospital.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {

}
