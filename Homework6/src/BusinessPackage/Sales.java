/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

/**
 *
 * @author ragha
 */
public class Sales {

    private String userName;
    private String password;
    private CustomerDirectory customerDirectory;
    private double revenue;
    private static int commision;
    private double baseCompensation;

    public double getBaseCompensation() {
        return baseCompensation;
    }

    public void setBaseCompensation(double baseCompensation) {
        this.baseCompensation = baseCompensation;
    }
    

    public Sales()
    {
        customerDirectory = new CustomerDirectory();
    }
    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }
    

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

}
