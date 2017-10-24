/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import BusinessPackage.Business;
import BusinessPackage.Customer;
import BusinessPackage.Market;
import BusinessPackage.Order;
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
        BufferedReader br_supp = null;
        BufferedReader br_cust = null;
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
            br_supp = new BufferedReader(new FileReader("supplier.csv"));

            while ((line = br_supp.readLine()) != null) {

                // use comma as separator
                String[] supplier_details = line.split(cvsSplitBy);
                Supplier s = b.getSupplierCatalog().search(supplier_details[0]);
                if(s!=null)
                {
                    s.setSupplierName(supplier_details[0]);
                Product p = s.getProductCatalog().addProduct();
                p.setpName(supplier_details[1]);
                p.setPrice(Integer.parseInt(supplier_details[2]));
                int toCalc = Integer.parseInt(supplier_details[2]);
                int floor = Integer.parseInt(supplier_details[3]);
                //int newFloor = (floor-2) + (int) (Math.random() * (floor + 5));
                int ceil = toCalc + (int) (Math.random() * toCalc + 5);

                p.setFloorPrice(floor);
                p.setCeilPrice(ceil);
                }
                else
                {
                Supplier supplier = b.getSupplierCatalog().addSupplier();
                 supplier.setSupplierName(supplier_details[0]);
                Product p = supplier.getProductCatalog().addProduct();
                p.setpName(supplier_details[1]);
                p.setPrice(Integer.parseInt(supplier_details[2]));
                int toCalc = Integer.parseInt(supplier_details[2]);
                int floor = toCalc - 10 + (int) (Math.random() * toCalc - 5);
                int ceil = toCalc + (int) (Math.random() * toCalc + 5);

                p.setFloorPrice(floor);
                p.setCeilPrice(ceil);
                }

            }
            br_cust = new BufferedReader(new FileReader("customer.csv"));

            while ((line = br_cust.readLine()) != null) {

                // use comma as separator
                String[] cust_details = line.split(cvsSplitBy);
              
            Customer c1 = b.getCustomerDirectory().addUser();
           
            c1.setFirstname(cust_details[0]);
            c1.setLastname(cust_details[1]);
            c1.setContactnumber(Integer.parseInt(cust_details[2]));
            c1.setAddress(cust_details[3]);
          Market m = b.getMarketList().addMarket();
            m.setMarketName(cust_details[4]);
             c1.setMarket(m);

            }
           } catch (FileNotFoundException e) {
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
