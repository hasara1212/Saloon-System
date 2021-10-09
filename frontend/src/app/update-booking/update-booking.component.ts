import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';

@Component({
  selector: 'app-update-booking',
  templateUrl: './update-booking.component.html',
  styleUrls: ['./update-booking.component.css']
})
export class UpdateBookingComponent implements OnInit {

  bookingid!: number;
  booking: Booking = new Booking();
  constructor(private bookingService: BookingService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.bookingid = this.route.snapshot.params['bookingid'];
    this.bookingService.getBookingById(this.bookingid).subscribe(data =>
      {
        this.booking = data;}, error => console.log(error));
  }

  onSubmit()
  {
    this.bookingService.updateBooking(this.bookingid, this.booking).subscribe(data =>
      {
        this.goToBookingList();
      },
      error => console.log(error));
  }

  goToBookingList(){
    this.router.navigate(['/show']);
  }

}
