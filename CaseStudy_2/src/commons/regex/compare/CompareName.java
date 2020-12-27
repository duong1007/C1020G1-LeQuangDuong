package commons.regex.compare;

import models.Customer;

import java.util.Comparator;

public class CompareName implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer t1) {
        if (customer.getName().compareTo(t1.getName()) == 0 ) {
            return customer.getBirth().compareTo(t1.getBirth());
        }
        return customer.getName().compareTo(t1.getName());
    }
}
