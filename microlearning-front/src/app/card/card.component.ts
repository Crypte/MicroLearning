import { Component, Input } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  standalone: true,
  imports: [MatCardModule, MatButtonModule, CommonModule],
})
export class CardComponent {
  @Input() title: string = '';
  @Input() content: string = '';
  @Input() subtitle: string = ''; // Nouveau champ pour le sous-titre, optionnel
  @Input() imageUrl?: string; // Champ pour l'image de la carte, optionnel
}
