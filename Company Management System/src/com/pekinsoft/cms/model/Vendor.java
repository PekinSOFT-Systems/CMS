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
public class Vendor {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private String company;
    private String contact;
    private Address address;
    private String phone;
    private String email;
    private String website;
    private String notes;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `Vendor` object with only the unique ID number set. All
     * other data will need to be provided separately.
     */
    public Vendor () {
        this.id = System.currentTimeMillis();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the unique ID number for this vendor.
     * 
     * @return vendor's unique ID number
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID number for this vendor.
     * 
     * @param id the vendor's unique ID number
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the vendor's company name.
     * 
     * @return company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the vendor's company name.
     * 
     * @param company the company name
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the name of the contact person at this vendor.
     * 
     * @return name of contact person
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the name of the contact person at this vendor.
     * 
     * @param contact the name of contact person
     */
    public void setContact(String contact) {
        this.contact = contact;
    }


    /**
     * Gets the vendor's street address.
     * 
     * @return vendor's street address
     */
    public String getStreet() {
        return address.getStreet();
    }

    /**
     * Sets the vendor's street address.
     * 
     * @param street the vendor's street address
     */
    public void setStreet(String street) {
        this.address.setStreet(street);
    }

    /**
     * Gets the vendor's suite number, if any.
     * 
     * @return the vendor's suite number, or `null` if no suite number
     */
    public String getSuite() {
        return address.getSuiteOrApt();
    }

    /**
     * Sets the vendor's suite number, if needed.
     * 
     * @param apt the vendor's suite number
     */
    public void setSuite(String apt) {
        this.address.setSuiteOrApt(apt);
    }

    /**
     * Gets the vendor's city.
     * 
     * @return vendor's city
     */
    public String getCity() {
        return address.getCity();
    }

    /**
     * Sets the vendor's city.
     * 
     * @param city the vendor's city
     */
    public void setCity(String city) {
        this.address.setCity(city);
    }

    /**
     * Gets the vendor's state.
     * 
     * @return vendor's state
     */
    public String getState() {
        return address.getState();
    }

    /**
     * Sets the vendor's state.
     * 
     * @param state the vendor's state
     */
    public void setState(String state) {
        this.address.setState(state);
    }

    /**
     * Gets the vendor's postal code.
     * 
     * @return vendor's postal code
     */
    public String getPostalCode() {
        return address.getPostalCode();
    }

    /**
     * Sets the vendor's postal code.
     * 
     * @param postalCode the vendor's postal code
     */
    public void setPostalCode(String postalCode) {
        this.address.setPostalCode(postalCode);
    }

    /**
     * Gets the phone number for this vendor.
     * 
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number for this vendor.
     * 
     * @param phone the phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the email address for this vendor.
     * 
     * @return email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for this vendor.
     * 
     * @param email the email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the website address for this vendor.
     * 
     * @return website address
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website address for this vendor.
     * 
     * @param website the website address
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Gets any notes for this vendor.
     * 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets any notes for this vendor.
     * 
     * @param notes the notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    //</editor-fold>

}
