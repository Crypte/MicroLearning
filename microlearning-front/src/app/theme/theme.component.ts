import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

interface Field {
  id: number;
  name: string;
  description: string;
  created_at: Date;
}

@Component({
  selector: 'app-theme',
  templateUrl: './theme.component.html',
  standalone: true,
  imports: [CommonModule, HttpClientModule],
  styleUrls: ['./theme.component.scss'],
})
export class ThemeComponent implements OnInit {
  themes: Field[] = []; // Store full Field objects instead of just strings

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.fetchThemes();
  }

  fetchThemes(): void {
    this.http.get<Field[]>('http://localhost:8080/fields').subscribe({
      next: (fields) => {
        this.themes = fields; // Store the full Field objects
      },
      error: (err) => console.error('Error fetching themes', err),
    });
  }
}
