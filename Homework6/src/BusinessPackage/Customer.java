/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

/**
 *
 * @author yash
 */
public class Customer {
    private String firstname;
    private String lastname;
    private String address;
    private int contactnumber;
    private Market market;

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    /*public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }*/
    
    
}
