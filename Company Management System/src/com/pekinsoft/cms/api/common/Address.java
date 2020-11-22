/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.api.common;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Address {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private String street;
    private String suiteOrApt;
    private String city;
    private String state;
    private String postalCode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Address () {
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the street address: house number, direction, and street name and 
     * type.
     * 
     * @return street address
     */
    public String getStreet() {
        return street;
    }
    
    /**
     * Sets the street address: house number, direction, and street name and
     * type.
     * 
     * @param street the street address
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the suite or apartment number for the address.
     * 
     * @return suite or apartment number
     */
    public String getSuiteOrApt() {
        return suiteOrApt;
    }

    /**
     * Sets the suite or apartment number for the address.
     * 
     * @param suiteOrApt the suite or apartment number
     */
    public void setSuiteOrApt(String suiteOrApt) {
        this.suiteOrApt = suiteOrApt;
    }

    /**
     * Gets the city in which the address is situated.
     * 
     * @return city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city in which the address is situated.
     * 
     * @param city the city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state in which the address is situated.
     * 
     * @return state name
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state in which the address is situated.
     * 
     * @param state the state name
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the postal code for the address.
     * 
     * @return postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code for the address.
     * 
     * @param postalCode the postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    //</editor-fold>

}
