import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Problem1Component } from './lab1/problem1/problem1.component';
import { Problem2Component } from './lab1/problem2/problem2.component';

@NgModule({
  declarations: [
    AppComponent,
    Problem1Component,
    Problem2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
