import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { CardComponent } from '../card/card.component';
import { HttpClientModule } from '@angular/common/http';

interface Course {
  id: number;
  name: string;
  content: string;
  field_id: number;
  // Ajoute d'autres propriétés si nécessaire, selon la structure complète de Course
}

interface Card {
  id: number;
  title: string;
  content: string;
  img: string;
  createdAt: string;
  course: Course;
}

@Component({
  selector: 'app-theme-page',
  templateUrl: './theme-page.component.html',
  styleUrls: ['./theme-page.component.scss'],
  standalone: true,
  imports: [CommonModule, CardComponent, HttpClientModule],
})
export class ThemePageComponent implements OnInit {
  themeName: string = '';
  courses: Course[] = []; // Changement ici, courses est maintenant un tableau d'objets Course
  selectedCourse: number = 0;
  cards: Card[] = []; // Modification pour gérer la structure complète de Card
  selectedIndex = 0;

  constructor(private route: ActivatedRoute, private http: HttpClient) {}

  ngOnInit(): void {
    this.themeName = this.route.snapshot.paramMap.get('name') || '';
    this.loadCourses(this.themeName);
  }

  loadCourses(fieldId: string): void {
    this.http
      .get<Course[]>(`http://localhost:8080/fields/${fieldId}/courses`)
      .subscribe({
        next: (courses) => {
          this.courses = courses; // Assigner directement l'objet complet retourné par l'API
        },
        error: (err) => console.error('Error fetching courses', err),
      });
  }

  selectCourse(courseId: number): void {
    this.selectedCourse = courseId;
    this.http
      .get<Card[]>(`http://localhost:8080/courses/${courseId}/cards`)
      .subscribe({
        next: (cards) => {
          console.log('CAAARDS', cards);
          this.cards = cards; // Assigner les cartes récupérées de l'API
          this.selectedIndex = 0; // Réinitialiser à la première carte
        },
        error: (err) => console.error('Error fetching cards', err),
      });
  }

  get translateX() {
    return -this.selectedIndex * 50; // Décalage de 100% pour chaque carte
  }

  next() {
    if (this.selectedIndex < this.cards.length - 1) {
      this.selectedIndex++;
    } else {
      this.selectedIndex = 0; // Retourner au début si on est à la dernière carte
    }
  }

  previous() {
    if (this.selectedIndex > 0) {
      this.selectedIndex--;
    } else {
      this.selectedIndex = this.cards.length - 1; // Aller à la dernière carte si on est au début
    }
  }
}
