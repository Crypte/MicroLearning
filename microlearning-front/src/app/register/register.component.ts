import { Component } from '@angular/core';
import { InputTextModule } from 'primeng/inputtext';
import { PasswordModule } from 'primeng/password';
import { ButtonModule } from 'primeng/button';
import { RouterLink, Router } from '@angular/router'; // Importer le Router
import { FormsModule } from '@angular/forms';
import { AuthService } from '../service/AuthService'; // Importer le service Auth
import { RegisterRequest } from '../interface/login-request.model'; // Importer le modèle approprié

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [InputTextModule, PasswordModule, ButtonModule, RouterLink, FormsModule],
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent {
  username: string = '';
  email: string = '';
  password: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  onSubmit() {
    console.log('Username:', this.username);
    console.log('Email:', this.email);
    console.log('Password:', this.password);

    const registerRequest: RegisterRequest = {
      username: this.username,
      email: this.email,
      password: this.password,
      subscriptionType: 'free',
      role: 'user',
    };

    this.authService.register(registerRequest).subscribe({
      next: (response: any) => {
        console.log('Registration success:', response);
        alert('Inscription réussie !');
        this.router.navigate(['/login']);
      },
      error: (error) => {
        console.error('Registration error:', error);
        alert('Erreur lors de l\'inscription. Veuillez réessayer.');
      },
    });
  }
}
