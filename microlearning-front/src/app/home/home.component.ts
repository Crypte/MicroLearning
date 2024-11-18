import { Component } from '@angular/core';
import {ThemeComponent} from "../theme/theme.component";
import {CardComponent} from "../card/card.component";
import {FeedComponent} from "../feed/feed.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    ThemeComponent,
    CardComponent,
    FeedComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

}
