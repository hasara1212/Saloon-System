import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = new User();
  msg = '';

  constructor(private _service : RegistrationService,
    private _router : Router) { }

  ngOnInit(): void {
  }
 
  loginUser()
  {
    this._service.loginUserFromRemote(this.user).subscribe(
      data => {
        console.log("responce received");
        if(User.email ="admin@gmail.com" )
        {this._router.navigate(['/adminindex'])} 

        if(User.email ="akila@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

        if(User.email ="aaa@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

        if(User.email ="bbb@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

        if(User.email ="ccc@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

        if(User.email ="ddd@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

        if(User.email ="eee@gmail.com" )
        {
          this._router.navigate(['/userindex'])
        }

      }

      
        ,
      error => {
        console.log("exception occured");
        this.msg = "Bad Credential. Please enter valid email and passowrd..";

    }
    )
  }

  goregistration()
  {
    this._router.navigate(['/registration'])
  }
}
