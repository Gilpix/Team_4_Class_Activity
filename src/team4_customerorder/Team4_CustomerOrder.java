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
public class Team4_CustomerOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Order o=new Order("2019-2-10", "Confirmed");
        o.setorderDate("2019-2-5");
        o.setorderStstus("Confirmed");
        System.out.println("Order Date :  "+o.getOrderDate());
        System.out.println("Order Ststus :  "+o.getOrderStatus());
        System.out.println(o.calcSubTotal());
        System.out.println(o.calcTax());
        System.out.println(o.calcTotal());
        System.out.println(o.calcTotalWeight());
          
         
        
        
        System.out.println("-----------------------------");
        OrderDetails od=new OrderDetails(3,"tax included");
        od.setOrderQuantity(5);
        od.setOrderTaxStatus("included");
        
        System.out.println("Product Quantity :"+od.getOrderQuantity());
        System.out.println("Order tax status :"+od.getOrderTaxStatus());
        System.out.println(od.calcSubTotal());
        System.out.println(od.calcWeight());
        System.out.println(od.calcTax());
        
        
        System.out.println("-----------------------------");
        Items it = new Items(55,"this order includes 5 products");
        
        System.out.println("Shipping Weight :"+it.getShpWeight());
        System.out.println("Item description :"+it.getShpDesc());  
        System.out.println(it.getPriceForQuantity());
        System.out.println(it.getTax());
        System.out.println(it.inStock());
        
        
        
        
        System.out.println("-----------------------------");
        Customer cus = new Customer("Kuldeep","Lassal");
        cus.setnname("Kuldeep Singh");
        cus.setnaddress("Lassal, Montreal");
        
        System.out.println("Customer Name :"+cus.getnname());
        System.out.println("Customer Address :"+cus.getnaddress());  
        
        
        System.out.println("-----------------------------");
        
        
        
        
        Payment pay = new Payment(1250);
        pay.setamount(1270);
        
         System.out.println("Amount paid:"+pay.getamount());
        
        
        System.out.println("-----------------------------");
        
        
        
        
        
        Cash cs = new Cash(12,1270);
        
        System.out.println("Amount Tendered:"+cs.getCtender());
        
        
        
        
          System.out.println("-----------------------------");
          
        Check ch = new Check("Kuldeep", "RBC1234",1270);
          
          System.out.println("Payee Name :"+ch.getpayeName());
          System.out.println("Payee Bank Id :"+ch.getpayeBankid());
          System.out.println(ch.checkAuthorized());
          
          
          
          
            System.out.println("-----------------------------");
            
            
            Credit cd = new Credit("Kuldeep", "debit","2021-2-2",1270);
            
            System.out.println("Card name:"+cd.getname());
           System.out.println("Card Type:"+cd.gettype());
            System.out.println("Card Expirey date:"+cd.getexp());
            System.out.println(cd.authorized());

    }
    
    
}
