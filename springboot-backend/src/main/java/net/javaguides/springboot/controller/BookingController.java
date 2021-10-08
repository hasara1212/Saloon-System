package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.repository.BookingRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class BookingController {
    
	@Autowired
	private BookingRepository bookingRepository;
	
	//get all bookings
	
	    @GetMapping("/bookings")
		public List<Booking> getAllBookings(){
			return bookingRepository.findAll();
		}
	  
	 // create booking rest api
		@PostMapping("/bookings")
		public Booking createBookings(@RequestBody Booking booking) {
			return bookingRepository.save(booking);
		}
		
    
		// update booking rest api
		
		@PutMapping("/bookings/{bookingid}")
		public ResponseEntity<Booking> updateBooking(@PathVariable Long bookingid, @RequestBody Booking bookingDetails){
			Booking booking = bookingRepository.findById(bookingid)
					.orElseThrow(() -> new ResourceNotFoundException("Booking not exist with id :" + bookingid));
			
			booking.setBookingtype(bookingDetails.getBookingtype());
			booking.setDate(bookingDetails.getDate());
			booking.setTime(bookingDetails.getTime());
			
			Booking updateBooking = bookingRepository.save(booking);
			return ResponseEntity.ok(updateBooking);
		}
		
		// delete booking rest api
		@DeleteMapping("/bookings/{bookingid}")
		public ResponseEntity<Map<String, Boolean>> deleteBooking(@PathVariable Long bookingid){
			Booking booking = bookingRepository.findById(bookingid)
					.orElseThrow(() -> new ResourceNotFoundException("Booking not exist with id :" + bookingid));
			
			bookingRepository.delete(booking);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
			
		}
		
}
