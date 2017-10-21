/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;


import BusinessPackage.Business;
import BusinessPackage.Product;
import BusinessPackage.Sales;
import BusinessPackage.Supplier;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ragha
 */
public class ConfigureABusiness {

    public static Business Initialize(String name) {
        Business b = new Business(name);
       
      
        String csvFile = "logindetails.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] userDetails = line.split(cvsSplitBy);
        Sales sd = b.getSalesDirectory().addUser();
                String username = userDetails[0];
                
                String password = userDetails[1];
               
                sd.setUserName(username);
                sd.setPassword(password);
                
            }
            Supplier supplier= b.getSupplierCatalog().addSupplier();
        Product p = supplier.getProductCatalog().addProduct();
        p.setpName("Hamam");
        p.setPrice(20);
        
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return b;
    }
}
