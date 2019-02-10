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
    private Customer cust;
    
    public Order(String date, String status)
    {
        orderDate=date;
        orderStatus=status;
    }
    
    
    public void Customer(Customer newCustomer )
    {
        this.cust=newCustomer;
    }
    
     public void setorderDate(String date)
    {
        orderDate = date;
    }
     
      public void setorderStstus(String status)
    {
        orderStatus = status;
    }
     
     public String getOrderDate()
     {
         return orderDate;
     }
     public String getOrderStatus()
     {
         return orderStatus;
     }
     
     
     public String calcSubTotal()
     {
         return "Total Order payment is 1250";
     }
     
     public String calcTax()
     {
         return "Total Order Tax 12.5";
     }
     
      public String calcTotal()
     {
         return "Total Order amount(without tax) 1200$";
     }
      
      public String calcTotalWeight()
      {
          return "Total Weight of Product 55 Kg";
      }
     
     
   
    
    
    
    
}
