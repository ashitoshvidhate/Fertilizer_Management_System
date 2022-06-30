/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third_table_connection;

/**
 *
 * @author ashitosh
 */
public class Third {
    
    private int qty;
    private int corderid;
    private int productid;
    private double total;
    
    public Third(int qty,int corderid,int productid,double total)
    {
        this.qty=qty;
        this.corderid=corderid;
        this.productid=productid;
        this.total=total;
    }
    
    public int getQty()
    {
        return qty;
    }
    public int getCid()
    {
        return corderid;
    }
    public int getPid()
    {
        return productid;
    }
    public double getTotal()
    {
        return total;
    }
}
