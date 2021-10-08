package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long bookingid;
  
  @Column(name = "bookingtype")
  private String bookingtype;
  
  @Column(name = "date")
  private String date;
  
  @Column(name = "time")
  private String time;
  
  public Booking()
  {
	  
  }
  
public Booking(String bookingtype, String date, String time) {
	super();
	this.bookingtype = bookingtype;
	this.date = date;
	this.time = time;
}


public long getBookingid() {
	return bookingid;
}
public void setBookingid(long bookingid) {
	this.bookingid = bookingid;
}
public String getBookingtype() {
	return bookingtype;
}
public void setBookingtype(String bookingtype) {
	this.bookingtype = bookingtype;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
  
  
  

}
