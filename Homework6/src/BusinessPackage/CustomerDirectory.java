/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author yash
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerlist;

     public CustomerDirectory()
     {
         customerlist= new ArrayList<Customer>();
     }
    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
     public Customer addUser()
    {
        Customer customer = new Customer();
        customerlist.add(customer);
        return customer;
    }
     public void addUser(Customer cus)
     {
          customerlist.add(cus);
     }
     public Customer findPersonByLastName(String lastName)
    {
        for(Customer p :customerlist)
        {
            if(lastName.equals(p.getLastname()))
            {
                return p;
            }
        }
        return null;
    }
    
}
