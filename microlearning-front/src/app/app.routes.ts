import { NgModule } from "@angular/core"
import { RouterModule, Routes } from "@angular/router"
import { HomeComponent } from "./home/home.component"
import {LoginComponent} from "./login/login.component";
import {ConceptComponent} from "./concept/concept.component";
import {PrixComponent} from "./prix/prix.component";
import {RegisterComponent} from "./register/register.component";
import {ThemeComponent} from "./theme/theme.component";
import { ThemePageComponent } from './theme-page/theme-page.component';
import { FeedComponent } from "./feed/feed.component";
import { HeaderComponent } from './header/header.component';

export const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "login", component: LoginComponent },

  { path: "register", component: RegisterComponent },
  { path: "concept", component: ConceptComponent },
  { path: "prix", component: PrixComponent },
  { path: 'theme/:name', component: ThemePageComponent },
  { path: 'feed', component: FeedComponent },
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {

}
