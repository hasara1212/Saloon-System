import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-facialbooking',
  templateUrl: './facialbooking.component.html',
  styleUrls: ['./facialbooking.component.css']
})
export class FacialbookingComponent implements OnInit {

  booking: Booking = new Booking();
  constructor(private bookingService: BookingService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveBooking(){
    this.bookingService.createBooking(this.booking).subscribe( data =>{
    console.log(data);
    this.goToBookingList();
    },
    error => console.log(error)); 
  }

  goToBookingList(){
    this.router.navigate(['/bookings']);
  }
  onSubmit(){
    console.log(this.booking);
    this.saveBooking();
  }

}
