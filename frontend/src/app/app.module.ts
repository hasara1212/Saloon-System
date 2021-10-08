import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { FormsModule } from '@angular/forms';
import { FacialbookingComponent } from './facialbooking/facialbooking.component';
import { FooterComponent } from './footer/footer.component';
import { HaircuttingbookingComponent } from './haircuttingbooking/haircuttingbooking.component';
import { UserindexComponent } from './userindex/userindex.component';
import { IndexComponent } from './index/index.component';
import { AdminindexComponent } from './adminindex/adminindex.component';
import { ShowComponent } from './show/show.component';
import { BookingComponent } from './booking/booking.component';
import { AdminshowComponent } from './adminshow/adminshow.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { UpdateBookingComponent } from './update-booking/update-booking.component';
import { AdminaddfacComponent } from './adminaddfac/adminaddfac.component';
import { AdminprofileComponent } from './adminprofile/adminprofile.component';
import { UserprofileComponent } from './userprofile/userprofile.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    CreateEmployeeComponent,
    FacialbookingComponent,
    FooterComponent,
    HaircuttingbookingComponent,
    UserindexComponent,
    IndexComponent,
    AdminindexComponent,
    ShowComponent,
    BookingComponent,
    AdminshowComponent,
    RegistrationComponent,
    LoginComponent,
    UpdateBookingComponent,
    AdminaddfacComponent,
    AdminprofileComponent,
    UserprofileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
