import { Component, OnInit } from '@angular/core';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-adminshow',
  templateUrl: './adminshow.component.html',
  styleUrls: ['./adminshow.component.css']
})
export class AdminshowComponent implements OnInit {

  bookings: Booking[] = [];
  constructor(private bookingService: BookingService) { }

  ngOnInit(): void {
    this.getBookings(); 
  }

    private getBookings(){
    this.bookingService.getBookingList().subscribe(data => {
    this.bookings=data;
    });
  } 
}
