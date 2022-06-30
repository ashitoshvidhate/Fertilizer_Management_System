/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerOrder_connection;

import java.sql.Date;


/**
 *
 * @author ashitosh
 */
public class CustomerData {
    
    private int corderid;
    private Date corderdt;
   
    private int customerid;
    private int employeeid;
   
    
    public CustomerData(int corderid,Date corderdt,int customerid,int employeeid)
    {
        this.corderid=corderid;
        this.corderdt=corderdt;
        this.customerid=customerid;
        this.employeeid=employeeid;
       
    }
    public int getCId()
    {
        return corderid;
    }
    
    public Date getDt()
    {
        return corderdt;
    }
    
    
    
    public int getCustmerId()
    {
        return customerid;
    }
    
    public int getEmpId()
    {
        return employeeid;
    }
    
   
}
