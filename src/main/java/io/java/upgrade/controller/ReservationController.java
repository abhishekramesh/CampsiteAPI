//package io.java.upgrade.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.java.upgrade.model.Reservation;
//import io.java.upgrade.service.ReservationService;
//
//@RestController
//public class ReservationController {
//	
//	@Autowired
//	private ReservationService ReservationService;
//	
//	@RequestMapping("/Reservations")
//	public List<Reservation> getAllReservations() {
//		return ReservationService.getAllReservations();
//	}
//	
//	@RequestMapping("/Reservations/{id}")
//	public Optional<Reservation> getReservation(@PathVariable String id) {
//		return ReservationService.getReservation(id);
//	}
//	
//	
//	@RequestMapping(method = RequestMethod.POST, value="/Reservations")
//	public void addReservation(@RequestBody Reservation Reservation) {
//		ReservationService.addReservation(Reservation);
//	}
//	
//	@RequestMapping(method = RequestMethod.PUT, value="/Reservations/{id}")
//	public void updateReservation(@RequestBody Reservation Reservation, @PathVariable String id) {
//		ReservationService.updateReservation(Reservation,id);
//	}
//	
//	@RequestMapping(method = RequestMethod.DELETE, value="/Reservations/{id}")
//	public void deleteReservation(@RequestBody Reservation Reservation, @PathVariable String id) {
//		ReservationService.deleteReservation(id);
//	}
//
//}
