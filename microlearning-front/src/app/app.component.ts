import { Component } from '@angular/core';
import {Router, RouterOutlet} from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { CommonModule } from '@angular/common'; // Ajout du CommonModule
import { CardComponent } from './card/card.component';
import { ThemeComponent } from './theme/theme.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    FooterComponent,
    HeaderComponent,
    CardComponent,
    ThemeComponent,
    CommonModule // Ajout ici pour les directives Angular comme *ngFor, *ngIf
  ],
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'microlearning-app';
  showHeaderFooter: boolean = true;

  constructor(private router: Router) {
    this.router.events.subscribe(() => {
      this.showHeaderFooter = !(this.router.url.includes('login') || this.router.url.includes('register'));
    });
  }
}
