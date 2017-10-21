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
public class Product {

    private static int count =0;
    private String pName;
    private int price;
    private int modelNum;
    private int availability ;
    public Product()
    {
        count++;
        modelNum = count;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }
    
    @Override
    public String toString()
    {
        return pName;
    }
}
