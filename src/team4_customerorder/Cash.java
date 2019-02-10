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
public class Cash extends Payment{
    
    private float cashTendered;
    
    public Cash (float tender,float theAmount)
    {
         super(theAmount);
        cashTendered = tender;
    }
    public void setctender(float Tender)
    {
        cashTendered = Tender;
    }
    public float getCtender()
    {
        return  cashTendered;
    }
    
    
}
