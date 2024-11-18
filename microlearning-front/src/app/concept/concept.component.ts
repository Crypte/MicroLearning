import { Component } from '@angular/core';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import {RouterLink} from "@angular/router";


@Component({
  selector: 'app-concept',
  standalone: true,
    imports: [CardModule, ButtonModule, RouterLink],
  templateUrl: './concept.component.html',
  styleUrl: './concept.component.scss'
})
export class ConceptComponent {

}