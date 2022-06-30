/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_connection;

/**
 *
 * @author ashitosh
 */
public class Employee {
    
    private int employeeid;
    private String employeenm;
    private double employeesal;
    private int employeeage;
    private String employeegen;
    
    public Employee(int employeeid,String employeenm,double employeesal,int employeeage,String employeegen)
    {
        this.employeeid=employeeid;
        this.employeenm=employeenm;
        this.employeesal=employeesal;
        this.employeeage=employeeage;
        this.employeegen=employeegen;
    }
    
    public int getId()
    {
        return employeeid;
    }
    
    public String getName()
    {
        return employeenm;
    }
    
    public double getSal()
    {
        return employeesal;
        
    }
    
    public int getAge()
    {
        return employeeage;
    }
    
    public String getGen()
    {
        return employeegen;
    }
}
