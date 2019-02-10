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
public class Credit extends Payment{
    private String name;
    private String type;
    private String expDate;
    private Payment amt;
    
    public Credit(String theName,String theType,String theExpdate,float theAmount)
    {
        super(theAmount);
        name=theName;
        type=theType;
        expDate=theExpdate;
    }
    public void Payment(Payment newAmt )
    {
        this.amt=newAmt;
    }
   
    
}
