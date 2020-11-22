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
public class Audit {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private Date date;
    private long employeeID;
    private String notes;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Audit () {
        this.id = System.currentTimeMillis();
        this.date = new Date();
    }
    
    public Audit ( long employeeID ) {
        this();
        
        this.employeeID = employeeID;
    }
    
    public Audit ( long employeeID, String notes ) {
        this(employeeID);
        
        this.notes = notes;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Retrieves the unique ID of this record.
     * 
     * @return the unique ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID number for this record.
     * 
     * @param id the unique ID number
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * Gets the date this audit was performed.
     * 
     * @return date of the audit
     */
    public Date getDate() {
        return date;
    }
    
    /**
     * Sets the date this audit is performed.
     * 
     * @param date date of the audit
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the unique ID number of the employee who performed this audit.
     * 
     * @return the unique ID for the employee
     */
    public long getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the unique ID number of the employee who is performing this audit.
     * 
     * @param employeeID the unique ID for the employee
     */
    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the notes of this audit.
     * 
     * @return audit notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the notes of this audit.
     * 
     * @param notes audit notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    //</editor-fold>

}
