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
public class OrderDetails {
    private int quantity;
    private String taxStatus;
    private Order ord;
    private Items item;
    
    public OrderDetails(int quant, String taxstatus)
    {
        quantity = quant;
        taxStatus = taxstatus;
    }
    
    
    public void Order(Order newOrder )
    {
        this.ord=newOrder;
    }
    
     public void Items(Items newItem )
    {
        this.item=newItem;
    }
    
    
    public void setOrderQuantity(int quant)
    {
        quantity = quant;
    }
    
    public void setOrderTaxStatus(String status)
    {
        taxStatus = status;
    }
    
    public int getOrderQuantity()
    {
        return quantity;
    }
    public String getOrderTaxStatus()
    {
        return taxStatus;
    }
    
    
      public void calcSubTotal()
     {
         System.out.println("Total Order payment");
     }
      
      public void calcWeight()
      {
          System.out.println("Total Weight of Product");
      } 
     
     public void calcTax()
     {
         System.out.println("Total Order Tax");
     }
     
     
      
     
     
    
    
    
    
}
