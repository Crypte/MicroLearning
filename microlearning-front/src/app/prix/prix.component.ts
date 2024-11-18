import { Component } from '@angular/core';
import {ButtonModule} from "primeng/button";
import {RouterLink} from "@angular/router";

@Component({
  selector: 'app-prix',
  standalone: true,
  imports: [ButtonModule, RouterLink],
  templateUrl: './prix.component.html',
  styleUrl: './prix.component.scss'
})
export class PrixComponent {

}
