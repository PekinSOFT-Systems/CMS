/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.model;

import java.util.Date;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Sale {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private long employeeID;
    private long customerID;
    private Date date;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `Sale` object, supplying only the sale ID and date. All
     * other data must be supplied separately.
     */
    public Sale () {
        this.id = System.currentTimeMillis();
        this.date = new Date();
    }
    
    /**
     * Creates a new `Sale` object for the provided employee. The customer must
     * be supplied separately.
     * 
     * @param employeeID the employee ID for the employee making the sale
     */
    public Sale ( long employeeID ) {
        this();
        this.employeeID = employeeID;
    }
    
    /**
     * Creates a new `Sale` object with all required data supplied at creation.
     * 
     * @param employeeID the employee ID for the employee making the sale
     * @param customerID the customer ID for the customer making the purchase
     */
    public Sale ( long employeeID, long customerID ) {
        this(employeeID);
        this.customerID = customerID;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the unique ID for this sale.
     * 
     * @return the unique sale ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID for this sale.
     * 
     * @param id the unique sale ID
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the unique employee ID for the employee who made this sale.
     * 
     * @return the unique employee ID
     */
    public long getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the unique employee ID for the employee who is making this sale.
     * 
     * @param employeeID the unique employee ID
     */
    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the unique customer ID for the customer who made this purchase.
     * 
     * @return the unique customer ID
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Sets the unique customer ID for the customer who is making this purchase.
     * 
     * @param customerID the unique customer ID
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    /**
     * Gets the date this sale was made.
     * 
     * @return sales date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date this sale was made.
     * 
     * @param date sales date
     */
    public void setDate(Date date) {
        this.date = date;
    }
    //</editor-fold>

}
