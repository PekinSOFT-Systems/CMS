/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.model;

import com.pekinsoft.cms.api.common.Address;
import java.util.Date;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Employee {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private String lastName;
    private String firstName;
    private long deptID;
    private String homePhone;
    private String mobilePhone;
    private String officePhone;
    private String email;
    private Address address;
    private Date birthDate;
    private String notes;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `Employee` object, with only the unique employee ID set.
     */
    public Employee () {
        this.id = System.currentTimeMillis();
    }
    
    /**
     * Creates a new `Employee`  object and starts the data collection with the
     * employee's unique ID number, first and last names. All other information
     * will need to be provided separately.
     * 
     * @param lastName  the employee's last name
     * @param firstName the employee's first name
     */
    public Employee(String lastName, String firstName) {
        this();
        this.lastName = lastName;
        this.firstName = firstName;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
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
     * Gets the unique ID of the department to which the employee is assigned.
     * 
     * @return the unique department ID for this employee
     */
    public long getDeptID() {
        return deptID;
    }

    /**
     * Sets the unique ID of the department to which the employee is assigned.
     * 
     * @param deptID the unique department ID
     */
    public void setDeptID(long deptID) {
        this.deptID = deptID;
    }

    /**
     * Gets the employee's home phone number.
     * 
     * @return employee's home phone number
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the employee's home phone number.
     * 
     * @param homePhone the employee's home phone number
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Gets the employee's cell phone number. 
     * 
     * @return employee's cell phone number
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the employee's cell phone number.
     * 
     * @param mobilePhone the employee's cell phone number
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Gets the employee's office phone number.
     * 
     * @return employee's office phone number
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the employee's office phone number.
     * 
     * @param officePhone the employee's office phone number
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * Gets the employee's email address. May be a personal or business email
     * address.
     * 
     * @return employee's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the employee's email address. May be a personal or business email
     * address.
     * 
     * @param email the employee's email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the employee's street address.
     * 
     * @return employee's street address
     */
    public String getStreet() {
        return address.getStreet();
    }

    /**
     * Sets the employee's street address.
     * 
     * @param street the employee's street address
     */
    public void setStreet(String street) {
        this.address.setStreet(street);
    }

    /**
     * Gets the employee's apartment number, if any.
     * 
     * @return the employee's apartment number, or `null` if no apartment number
     */
    public String getApt() {
        return address.getSuiteOrApt();
    }

    /**
     * Sets the employee's apartment number, if needed.
     * 
     * @param apt the employee's apartment number
     */
    public void setApt(String apt) {
        this.address.setSuiteOrApt(apt);
    }

    /**
     * Gets the employee's city of residence.
     * 
     * @return employee's city of residence
     */
    public String getCity() {
        return address.getCity();
    }

    /**
     * Sets the employee's city of residence.
     * 
     * @param city the employee's city of residence
     */
    public void setCity(String city) {
        this.address.setCity(city);
    }

    /**
     * Gets the employee's state of residence.
     * 
     * @return employee's state of residence
     */
    public String getState() {
        return address.getState();
    }

    /**
     * Sets the employee's state of residence.
     * 
     * @param state the employee's state of residence
     */
    public void setState(String state) {
        this.address.setState(state);
    }

    /**
     * Gets the employee's home postal code.
     * 
     * @return employee's home postal code
     */
    public String getPostalCode() {
        return address.getPostalCode();
    }

    /**
     * Sets the employee's home postal code.
     * 
     * @param postalCode the employee's home postal code
     */
    public void setPostalCode(String postalCode) {
        this.address.setPostalCode(postalCode);
    }

    /**
     * Gets the employee's birth date.
     * 
     * @return employee's birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the employee's birth date.
     * 
     * @param birthDate the employee's birth date
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets any notes on this employee.
     * 
     * @return any notes on the employee
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets any notes on this employee. This could include such things as:
     * <ul>
     * <li>Date of hire</li>
     * <li>Date of termination</li>
     * <li>Disciplinary issues and dates</li>
     * <li>Promotion dates and reasons</li>
     * <li>Etc.</li>
     * </ul>
     * 
     * @param notes any notes on this employee
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    //</editor-fold>

}
