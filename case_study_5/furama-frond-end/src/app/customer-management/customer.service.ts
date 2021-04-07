import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ICustomer} from './iCustomer';
import {ICustomerType} from './iCustomerType';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private readonly API_URL_CUSTOMER = ' http://localhost:3000/customers';
  private readonly API_URL_CUSTOMER_TYPE = ' http://localhost:3000/customerTypes';

  constructor(private http: HttpClient ) { }

  getCustomers(): Observable<ICustomer[]> {
    return this.http.get<ICustomer[]>(this.API_URL_CUSTOMER);
  }

  addNewCustomer(customer: ICustomer): Observable<any> {
    return this.http.post(this.API_URL_CUSTOMER, customer);
  }

  deleteCustomer(id): Observable<any>{
    return this.http.delete(`${this.API_URL_CUSTOMER}/${id}`);
  }

  getCustomerById(id): Observable<any>{
    return this.http.get(this.API_URL_CUSTOMER + '/' + id);
  }

  editCustomer(customer, idCustomer): Observable<any>{
    return this.http.put(this.API_URL_CUSTOMER + '/' + idCustomer, customer);
  }

  getCustomerType(): Observable<ICustomerType[]> {
    return this.http.get<ICustomerType[]>(this.API_URL_CUSTOMER_TYPE);
  }
}
