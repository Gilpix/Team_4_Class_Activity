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
public class Payment {
    private float amount;
    private Order ord;
    
    public Payment(float theAmount)
    {
        amount=theAmount;
    }
    public void Order(Order newOrder )
    {
        this.ord=newOrder;
    }
    
    public void setamount(float Amount)
    {
        amount=Amount;
    }
    public float getamount()
    {
        return amount;
    }
    public void display()
    {
        System.out.println("Payment Amount : "+amount);
    }
    
}
