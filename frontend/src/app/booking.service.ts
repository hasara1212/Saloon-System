import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Booking } from './booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  
  private baseURL = "http://localhost:8080/api/v1/bookings";
  constructor(private httpClient: HttpClient) { }

  getBookingList(): Observable<Booking[]>{
     return this.httpClient.get<Booking[]>(`${this.baseURL}`);
  }
  
  createBooking(booking: Booking): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, booking);
  }

  getBookingById(bookingid: number): Observable<Booking>
  {
    return this.httpClient.get<Booking>(`${this.baseURL}/${bookingid}`);
  }

  updateBooking(bookingid: number, booking: Booking): Observable<Object>
  {
    return this.httpClient.put(`${this.baseURL}/${bookingid}`, booking);
  }

  deleteBooking(bookingid: number): Observable<Object>
  {
    return this.httpClient.delete(`${this.baseURL}/${bookingid}`);
  }
}
