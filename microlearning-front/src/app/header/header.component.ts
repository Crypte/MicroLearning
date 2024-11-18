import {Component, OnInit} from '@angular/core';
import { ButtonModule } from 'primeng/button';
import { MenubarModule } from 'primeng/menubar';
import { Router } from '@angular/router';
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [ButtonModule, MenubarModule, NgIf],
  templateUrl: './header.component.html',
})
export class HeaderComponent implements OnInit {
  isAuthenticated: boolean = false; // Définit si l'utilisateur est connecté ou non

  constructor(private router: Router) {}

  ngOnInit(): void {
    this.updateAuthenticationStatus(); // Vérifie l'authentification au montage
  }

  updateAuthenticationStatus(): void {
    const token = localStorage.getItem('jwt'); // Récupère le token du localStorage
    this.isAuthenticated = !!token; // Met à jour l'état d'authentification
  }

  logout(): void {
    localStorage.removeItem('jwt'); // Supprime le token du localStorage
    this.isAuthenticated = false; // Met l'utilisateur hors-ligne
    this.router.navigate(['/']); // Redirige vers la page d'accueil
  }
}
