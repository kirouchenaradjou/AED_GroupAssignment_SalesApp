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
public class SupplierCatalog {
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierCatalog()
    {
        supplierDirectory = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
      public Supplier addSupplier()
    {
        Supplier s = new Supplier();
        supplierDirectory.add(s);
        return s;
    }
    public void removeSupplier(Supplier s)
    {
        supplierDirectory.remove(s);
    }
    public Supplier search(String keyword)
    {
        for(Supplier s : supplierDirectory)
        {
            if(keyword.equals(s.getSupplierName()))
            {
                return s;
            }
        }
        return null;
    }
}
