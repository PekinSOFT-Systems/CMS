/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.model;

import java.io.Serializable;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 0L;
    
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private String name;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Department () {
        this.id = System.currentTimeMillis();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the department's unique ID number.
     * 
     * @return department's unique ID number
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the department's unique ID number.
     * 
     * @param id the department's unique ID number
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the name of the department.
     * 
     * @return department name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the department.
     * 
     * @param name the department name
     */
    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>

}
