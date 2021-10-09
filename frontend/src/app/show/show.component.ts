import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

  bookings: Booking[] = [];
  constructor(private bookingService: BookingService, 
    private router: Router) { }

  ngOnInit(): void {
    this.getBookings(); 
  }

    private getBookings(){
    this.bookingService.getBookingList().subscribe(data => {
    this.bookings = data;
    });
  } 

  updateBooking(bookingid: number)
  {
    this.router.navigate(['updatebooking', bookingid]);
  }

  deleteBooking(bookingid: number)
  {
    this.bookingService.deleteBooking(bookingid).subscribe( data => 
      {
        console.log(data);
        this.getBookings();
      });
  }
}
