package io.java.upgrade.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.java.upgrade.model.Campsite;

@Repository
public interface CampsiteRepository extends JpaRepository<Campsite,String> {

	Optional<Campsite> findAllById(UUID id);
	
	List<Campsite> findAll();
	
	@Query(value = "SELECT c FROM Campsite c WHERE c.campDate BETWEEN :startDate AND :endDate ORDER BY c.campDate")
	List<Campsite> findAllCampsitesBetweeDates(@Param("startDate") Date startDate,@Param("endDate") Date endDate);

}
