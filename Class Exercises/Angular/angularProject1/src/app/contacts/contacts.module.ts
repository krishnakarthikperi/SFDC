import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddContactsComponent } from './add-contacts/add-contacts.component';
import { ViewContactsComponent } from './view-contacts/view-contacts.component';
import { ContactsComponent } from './contacts.component';



@NgModule({
  declarations: [
    AddContactsComponent,
    ViewContactsComponent,
    ContactsComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[
    AddContactsComponent
  ]
})
export class ContactsModule { }
