import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginRequest, RegisterRequest } from '../interface/login-request.model';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private loginUrl = 'http://localhost:8080/login';
  private registerUrl = 'http://localhost:8080/register';

  constructor(private http: HttpClient) {}

  login(loginRequest: LoginRequest): Observable<any> {
    return this.http.post(this.loginUrl, loginRequest);
  }
  register(registerRequest: RegisterRequest): Observable<any> {
    return this.http.post(this.registerUrl, registerRequest);
  }


}
