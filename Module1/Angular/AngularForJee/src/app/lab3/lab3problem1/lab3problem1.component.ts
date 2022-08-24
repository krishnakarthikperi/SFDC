import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
@Component({
  selector: 'app-lab3problem1',
  templateUrl: './lab3problem1.component.html',
  styleUrls: ['./lab3problem1.component.css']
})
export class Lab3problem1Component implements OnInit {

  constructor(private productService:ProductService) { }

  ngOnInit(): void {
  }
  categories=['Grocery', 'Mobile', 'Electronics','Cloths']
  onSubmit(formValue:any){
    alert("ID"+formValue.id+"\nName:"+formValue.name+"\nCost:"+formValue.cost+"\nAvailable Online:"+formValue.isOnline+"\nCategory:"+formValue.category);
    let prod = new Product(formValue.id,formValue.name,formValue.cost,formValue.isOnline,formValue.category, new Stores(formValue.bigBazar,formValue.dMart,formValue.reliance,formValue.megaStore));
    this.productService.addProductDetails(prod).subscribe(data=>{
      let msg=data?"user registered succesfully":"OOPS!! some error occured";
      console.log(data);
      alert(msg)
    },(error)=>{
      console.log(error);
      alert("OOPS!! some error occured")
    })
  }
}
export class Stores{
  constructor(
    public bigBazar:boolean,
    public dMart:boolean,
    public reliance:boolean,
    public megaStore:boolean
  ){}
}
export class Product{
  constructor(
    public id:number,
    public name:string,
    public cost:number,
    public isOnline:boolean,
    public category:string,
    public availableInStore:Stores
  ){}
}