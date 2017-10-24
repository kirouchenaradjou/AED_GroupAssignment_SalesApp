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
public class Business {

    private SalesDirectory salesDirectory;
    private CustomerDirectory customerDirectory;
private MarketList marketList;
    private SupplierCatalog supplierCatalog;
    private String name;

    public Business(String n) {
        salesDirectory = new SalesDirectory();
        customerDirectory = new CustomerDirectory();
        supplierCatalog = new SupplierCatalog();
        marketList = new MarketList();
        name = n;
    }

    public MarketList getMarketList() {
        return marketList;
    }

    public void setMarketList(MarketList marketList) {
        this.marketList = marketList;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public SupplierCatalog getSupplierCatalog() {
        return supplierCatalog;
    }

    public void setSupplierCatalog(SupplierCatalog supplierCatalog) {
        this.supplierCatalog = supplierCatalog;
    }

    public SalesDirectory getSalesDirectory() {
        return salesDirectory;
    }

    public void setSalesDirectory(SalesDirectory salesDirectory) {
        this.salesDirectory = salesDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
