/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_connection;

/**
 *
 * @author ashitosh
 */
public class Customer {
    
    private int customerid;
    private String customername;
    private String customeradd;
    private String customphone;
    private String customergen;
    
  public Customer(int customerid,String customername,String customeradd,String customphone,String customergen)
  {
      this.customerid=customerid;
      this.customername=customername;
      this.customeradd=customeradd;
      this.customphone=customphone;
      this.customergen=customergen;
  }
  
  public int getId()
  {
      return customerid;
      
  }
  
  public String getName()
  {
      return customername;
  }
  
  public String getAdd()
  {
      return customeradd;
      
  }
  public String getPhone()
  {
      return customphone;
  }
    
  public String getGen()
  {
      return customergen;
  }
}
