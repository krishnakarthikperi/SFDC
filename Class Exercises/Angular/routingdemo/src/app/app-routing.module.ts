import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddLoansComponent } from './add-loans/add-loans.component';
import { LoanTypesComponent } from './loan-types/loan-types.component';
import { LoansComponent } from './loans/loans.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  {
    path:'loans',
    component:LoansComponent
  },
  {
    path:'loan-types',
    component:LoanTypesComponent
  },
  {
    path:'add-loans',
    component:AddLoansComponent,
    //named outlet
    outlet:'addLoan'
  },
  {//redirecting
    path:'',
    redirectTo:'loans',
    pathMatch:'full'
  },
  {
    path:'**',
    component:PageNotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
