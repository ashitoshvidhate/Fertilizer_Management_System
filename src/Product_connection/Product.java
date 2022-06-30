/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product_connection;

/**
 *
 * @author ashitosh
 */
public class Product {
    
    private int  productid;
    private String productname;
    private double productrate;
    private double productqty;
    
    public Product(int productid,String productname,double productrate,double productqty)
    {
        this.productid=productid;
        this.productname=productname;
        this.productrate=productrate;
        this.productqty=productqty;
    }
    
    public int getId()
    {
        return productid;
    }
    
    public String getName()
    {
        return productname;
       
    }
    
    public double getRate()
    {
        return productrate;
    }
    
    public double getQty()
    {
        return productqty;
    }
}
