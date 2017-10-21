/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class SalesDirectory {
   private ArrayList<Sales> salesDir; 

    public SalesDirectory() {
        salesDir = new ArrayList<Sales>();
    }

    public ArrayList<Sales> getUserAccountDir() {
        return salesDir;
    }

    public void setUserAccountDir(ArrayList<Sales> userAccountDir) {
        this.salesDir = userAccountDir;
    }
    public Sales addUser()
    {
        Sales su = new Sales();
        salesDir.add(su);
        return su;
    }
  
    public Sales isValidUser(String userName, String password)
    {
        for(Sales ua: salesDir)
        {
            if(userName.equals(ua.getUserName()) && password.equals(ua.getPassword()))
            {
                return ua;
            }
         
        }
        return null;
    }
}
