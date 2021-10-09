import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminaddfacComponent } from './adminaddfac/adminaddfac.component';
import { AdminindexComponent } from './adminindex/adminindex.component';
import { AdminshowComponent } from './adminshow/adminshow.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { FacialbookingComponent } from './facialbooking/facialbooking.component';
import { HaircuttingbookingComponent } from './haircuttingbooking/haircuttingbooking.component';
import { IndexComponent } from './index/index.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { ShowComponent } from './show/show.component';
import { UpdateBookingComponent } from './update-booking/update-booking.component';
import { UserindexComponent } from './userindex/userindex.component';

const routes: Routes = [
  {path:'employees', component: EmployeeListComponent},
  {path:'create-employee', component: CreateEmployeeComponent},
  {path:'facialbooking', component: FacialbookingComponent},
  {path:'facilities', component: HaircuttingbookingComponent},
  {path:'userindex', component: UserindexComponent},
  {path:'show', component: ShowComponent}, 
  {path:'index', component: IndexComponent},
  {path:'adminshow', component: AdminshowComponent},
  {path:'adminindex', component: AdminindexComponent},
  {path:'adminaddfac', component: AdminaddfacComponent},
  {path:'registration', component: RegistrationComponent},
  {path:'login', component: LoginComponent},
  {path:'updatebooking/:bookingid', component: UpdateBookingComponent},
  {path:'', redirectTo: 'index', pathMatch: 'full'} 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
}) 
export class AppRoutingModule { }
