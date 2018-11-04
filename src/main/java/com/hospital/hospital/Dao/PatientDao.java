package com.hospital.hospital.Dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.pojo.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {
	@Query("select p.name,d.name,di.name from Medication m join m.medicine me "
			+ "join m.complaints c "
			+ "join c.visiting v "
			+ "join v.appointment a "
			+ "join a.patient p "
			+ "join v.doctor d "
			+ "join c.disease di "
			+ "where me.name=?1")
	
	public List<Object[]> getPatientByMedicineName(String medicineName);
	
	@Query("select p.name,d.name,de.name from Complaints c join c.visiting v"
			+ " join c.medication m"
			+ " join c.disease de"
			+ " join m.medicine me"
			+ " join v.appointment a"
			+ " join v.doctor d"
			+ " join a.patient p"
			+ " where c.id=?1")
	public List<Object[]> getDoctorByComplaints(Long id);
	
	@Query("select p.name from Complaints c"
			+ " join c.disease di"
			+ " join c.visiting v"
			+ " join v.appointment a"
			+ " join a.patient p"
			+ " where di.name=?1")
	public List<String> getPatientByDisease(String name);
	
	@Query("select p.name from Visiting v"
			+ " join v.doctor d"
			+ " join v.appointment a"
			+ " join a.patient p"
			+ " where d.name=?1")
	public List<String> getPatientByDoctor(String name);
	
	@Query("select d.name from Visiting v"
			+ " join v.doctor d"
			+ " join v.appointment a"
			+ " join a.patient p"
			+ " where p.name=?1")
	public List<String> getDoctorByPatient(String name);
	
	@Query("select p.name,a.id from Appointment a"
			+ " join a.patient p"
			+ " where a.dateTime=?1")
	public List<Object[]> getAppointmentsAndPatientsByDate(Date date);
	
	@Query("select p.name, v.id from Visiting v"
			+ " join v.appointment a"
			+ " join a.patient p"
			+ " where v.dateTime between ?1 and ?2")
	public List<Object[]> getPatientAndVisitByDate(Date date1,Date date2);
}
