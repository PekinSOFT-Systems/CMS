/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.model;

import com.pekinsoft.cms.api.common.Address;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Customer {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private String lastName;
    private String firstName;
    private String company;
    private Address shipping;
    private Address billing;
    private String phone;
    private String email;
    private String notes;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `Customer` object, providing only the unique ID number.
     * All other data must be provided separately.
     */
    public Customer () {
        this.id = System.currentTimeMillis();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    
    //</editor-fold>

    /**
     * Gets the unique ID for this employee.
     * 
     * @return unique employee ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID for this employee.
     * 
     * @param id the unique employee ID
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the employee's last name.
     * 
     * @return employee's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the employee's last name.
     * 
     * @param lastName the employee's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the employee's first name.
     * 
     * @return employee's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the employee's first name.
     * 
     * @param firstName the employee's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the customer's company, if any.
     * 
     * @return customer's company or `null` if not set
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the customer's company, if any.
     * 
     * @param company the customer's company
     */
    public void setCompany(String company) {
        this.company = company;
    }


    /**
     * Gets the customer's street shipping street.
     * 
     * @return customer's street shipping street
     */
    public String getShippingStreet() {
        return shipping.getStreet();
    }

    /**
     * Sets the customer's street shipping street.
     * 
     * @param street the customer's street shipping street
     */
    public void setShippingStreet(String street) {
        this.shipping.setStreet(street);
    }

    /**
     * Gets the customer's suite or apartment number, if any.
     * 
     * @return the customer's suite or apartment number, or `null` if none
     */
    public String getShippingSuiteOrApt() {
        return shipping.getSuiteOrApt();
    }

    /**
     * Sets the customer's suite or apartment number, if needed.
     * 
     * @param apt the customer's suite or apartment number
     */
    public void setApt(String apt) {
        this.shipping.setSuiteOrApt(apt);
    }

    /**
     * Gets the customer's shipping city.
     * 
     * @return customer's shipping city
     */
    public String getShippingCity() {
        return shipping.getCity();
    }

    /**
     * Sets the customer's shipping city.
     * 
     * @param city the customer's shipping city
     */
    public void setShippingCity(String city) {
        this.shipping.setCity(city);
    }

    /**
     * Gets the customer's shipping state.
     * 
     * @return customer's shipping state
     */
    public String getShippingState() {
        return shipping.getState();
    }

    /**
     * Sets the customer's shipping state.
     * 
     * @param state the customer's shipping state
     */
    public void setShippingState(String state) {
        this.shipping.setState(state);
    }

    /**
     * Gets the customer's shipping postal code.
     * 
     * @return customer's shipping postal code
     */
    public String getShippingPostalCode() {
        return shipping.getPostalCode();
    }

    /**
     * Sets the customer's shipping postal code.
     * 
     * @param postalCode the customer's shipping postal code
     */
    public void setShippingPostalCode(String postalCode) {
        this.billing.setPostalCode(postalCode);
    }

    /**
     * Gets the customer's street billing street.
     * 
     * @return customer's street billing street
     */
    public String getBillingStreet() {
        return billing.getStreet();
    }

    /**
     * Sets the customer's street billing street.
     * 
     * @param street the customer's street billing street
     */
    public void setBillingStreet(String street) {
        this.billing.setStreet(street);
    }

    /**
     * Gets the customer's suite or apartment number, if any.
     * 
     * @return the customer's suite or apartment number, or `null` if none
     */
    public String getBillingSuiteOrApt() {
        return billing.getSuiteOrApt();
    }

    /**
     * Gets the customer's billing city.
     * 
     * @return customer's billing city
     */
    public String getBillingCity() {
        return billing.getCity();
    }

    /**
     * Sets the customer's billing city.
     * 
     * @param city the customer's billing city
     */
    public void setBillingCity(String city) {
        this.billing.setCity(city);
    }

    /**
     * Gets the customer's billing state.
     * 
     * @return customer's billing state
     */
    public String getBillingState() {
        return billing.getState();
    }

    /**
     * Sets the customer's billing state.
     * 
     * @param state the customer's billing state
     */
    public void setBillingState(String state) {
        this.billing.setState(state);
    }

    /**
     * Gets the customer's billing postal code.
     * 
     * @return customer's billing postal code
     */
    public String getBillingPostalCode() {
        return billing.getPostalCode();
    }

    /**
     * Sets the customer's billing postal code.
     * 
     * @param postalCode the customer's billing postal code
     */
    public void setBillingPostalCode(String postalCode) {
        this.billing.setPostalCode(postalCode);
    }

    /**
     * Gets the customer's phone number.
     * 
     * @return customer's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the customer's phone number.
     * 
     * @param phone the customer's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the customer's email address.
     * 
     * @return customer's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the customer's email address.
     * 
     * @param email the customer's email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets any notes for this customer.
     * 
     * @return notes for this customer
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets any notes for this customer.
     * 
     * @param notes the notes for this customer
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
