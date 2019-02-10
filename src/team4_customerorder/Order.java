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
public class Order {
    
    private String orderDate;
    private String orderStatus;
    
    public Order(String date, String status)
    {
        orderDate=date;
        orderStatus=status;
    }
    
     public void setorderDate(String date)
    {
        orderDate = date;
    }
     
     public String getOrderDate()
     {
         return orderDate;
     }
     public String getOrderStatus()
     {
         return orderStatus;
     }
     
     
     public void calcSubTotal()
     {
         System.out.println("Total Order payment");
     }
     
     public void calcTax()
     {
         System.out.println("Total Order Tax");
     }
     
      public void calcTotal()
     {
         System.out.println("Total Order amount(without tax)");
     }
     
     
   
    
    
    
    
}
