package io.java.upgrade.controller;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.java.upgrade.constant.CampsiteConstants;
import io.java.upgrade.model.Campsite;
import io.java.upgrade.service.CampsiteService;
import io.java.upgrade.util.DateUtil;

@RestController
public class CampsiteController {
	
	@Autowired
	private CampsiteService campsiteService;

	
	@RequestMapping("/campsites")
	public List<Campsite> getAllCampsites(@RequestParam("startDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,@RequestParam("endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
		
		long duration  = endDate.getTime() - startDate.getTime();
		long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);
		
		if(diffInDays < CampsiteConstants.defaultDateRange) {
			endDate = DateUtil.addDaysToDate(startDate,CampsiteConstants.defaultDateRange);
		}
		return campsiteService.getAllCampsites(startDate,endDate);
	}
	
	@RequestMapping("/campsites/{id}")
	public Optional<Campsite> getCampsite(@PathVariable UUID id) {
		return campsiteService.getCampsite(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value="/campsites")
	public void addCampsite(@RequestBody Campsite campsite) {
		campsiteService.addCampsite(campsite);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/campsites/{id}")
	public void updateCampsite(@RequestBody Campsite campsite, @PathVariable String id) {
		campsiteService.updateCampsite(campsite,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/campsites/{id}")
	public void deleteCampsite(@RequestBody Campsite campsite, @PathVariable String id) {
		campsiteService.deleteCampsite(id);
	}

}
