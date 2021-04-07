import {ICustomerType} from './iCustomerType';

export interface ICustomer {
  id: number;
  idCustomer: string;
  customerType: ICustomerType;
  nameCustomer: string;
  dateOfBirth: string;
  idCard: string;
  phoneCustomer: string;
  emailCustomer: string;
  addressCustomer: string;
}
