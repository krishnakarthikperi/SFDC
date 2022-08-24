import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Product } from './lab3problem1.component';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }
  addProductDetails(product:Product){
    return this.http.post("http://localhost:3000/products",product);
  }
}
