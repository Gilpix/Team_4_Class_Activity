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
public class Check extends Payment{
     
  private String payeeName;
  
  private String payeeBankID;
  
  public Check (String pname,String pbankid,float theAmount)
  {  
      super(theAmount);
      payeeName = pname;
      payeeBankID =  pbankid;
      
  }
   public void setpyename(String Payename)
   {
       payeeName = Payename;
   }
    public void setpyebankid(String Payebankid)
   {
      payeeBankID  = Payebankid ;
   }
    public String getpayeName()
    {
        return payeeName;
    }
      public String getpayeBankid()
      {
          return payeeBankID;
      }
     public String checkAuthorized()
     {
         return "Check Authorized";
     }
}
