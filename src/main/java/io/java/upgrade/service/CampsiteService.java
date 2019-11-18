package io.java.upgrade.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.java.upgrade.model.Campsite;
import io.java.upgrade.repository.CampsiteRepository;

@Service
public class CampsiteService {
	
	@Autowired
	private CampsiteRepository campsiteRepository;
	
	public List<Campsite> getAllCampsites(){
		List<Campsite> campsites = new ArrayList<>();
		campsiteRepository.findAll().forEach(campsites::add);
		return campsites;
	}
	
	public Optional<Campsite> getCampsite(UUID id){
		return campsiteRepository.findAllById(id);
	}
	
	public void addCampsite(Campsite campsite) {
		campsiteRepository.save(campsite);
	}

	public void updateCampsite(Campsite campsite, String id) {
		campsiteRepository.save(campsite);
		
	}

	public void deleteCampsite(String id) {
		campsiteRepository.deleteById(id);
	}

	public List<Campsite> getAllCampsites(Date startDate, Date endDate) {
		return campsiteRepository.findAllCampsitesBetweeDates(startDate, endDate);
	}

}
