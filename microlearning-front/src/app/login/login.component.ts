import { Component } from '@angular/core';
import { InputTextModule } from 'primeng/inputtext';
import { PasswordModule } from 'primeng/password';
import { ButtonModule } from 'primeng/button';
import { RouterLink, Router } from '@angular/router'; // Importer le Router
import { FormsModule } from '@angular/forms';
import { AuthService } from '../service/AuthService'; // Importer le service Auth
import { LoginRequest } from '../interface/login-request.model'; // Importer le modèle

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [InputTextModule, PasswordModule, ButtonModule, RouterLink, FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  onSubmit() {
    console.log('Username:', this.username);
    console.log('Password:', this.password);

    const loginRequest: LoginRequest = {
      username: this.username,
      password: this.password,
    };

    this.authService.login(loginRequest).subscribe({
      next: (response: any) => {

        if (response.jwt) {
          localStorage.setItem('jwt', response.jwt);
        }

        this.router.navigate(['/']);
      },
      error: (error) => {
        console.error('Login error', error);
      },
    });
  }
}
