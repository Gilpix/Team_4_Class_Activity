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
public class Customer {
    private String name;
    private String address;
    
    public Customer(String thename,String theaddress)
    {
        thename= name;
        theaddress= address;
    }
    public void setnname(String name1)
    {
       name=name1; 
    }
    public void setnaddress(String address2)
    {
        address=address2;
    }
    public String getnname()
    {
        return name;
    }
    public String getnaddress()
    {
        return address;
    }
}
