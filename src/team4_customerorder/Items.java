/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4_customerorder;

/**
 *
 * @author temp
 */
public class Items {
    private int shippingWeight;
    private String shippingDesc;
    
    public Items(int shipWeight, String shipDesc)
    {
        shippingWeight =shipWeight;
        shippingDesc=shipDesc;
    }
    
    public void setShpWeight(int weight)
    {
        shippingWeight=weight;
    }
    public void setShpDesc(String desc)
    {
        shippingDesc=desc;
    }
    
    public int getShpWeight()
    {
        return shippingWeight;
    }
    
    public String getShpDesc()
    {
        return shippingDesc;
    }
    
    
      public String getPriceForQuantity()
     {
         return "Quantity Price";
     }
      
      public String getTax()
      {
          return "quantity Tax is";
      } 
     
     public String inStock()
     {
         return "quantity in stock";
     }
     
    
}
