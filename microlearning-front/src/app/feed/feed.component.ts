import { Component, OnInit } from '@angular/core';
import { Card } from '../../models/card.model';
import { CardComponent } from '../card/card.component';
import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-feed',
  standalone: true,
  templateUrl: './feed.component.html',
  imports: [CommonModule, CardComponent, HttpClientModule],
})
export class FeedComponent implements OnInit {
  allCards: Card[] = []; // Stocke toutes les cartes disponibles
  currentCard: Card | null = null; // Carte affichée actuellement

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getAllCards(); // Initialise toutes les cartes
  }

  getAllCards(): void {
    this.http.get<Card[]>('http://localhost:8080/cards').subscribe({
      next: (cards) => {
        this.allCards = cards;
        this.showRandomCard(); // Appelle showRandomCard après avoir reçu les cartes
      },
      error: (err) => console.error('Error fetching cards', err),
    });
  }

  showRandomCard(): void {
    if (this.allCards.length > 0) {
      const randomIndex = Math.floor(Math.random() * this.allCards.length);
      this.currentCard = this.allCards[randomIndex];
    }
  }
}
