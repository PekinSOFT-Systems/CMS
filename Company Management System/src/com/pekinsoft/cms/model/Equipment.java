/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.model;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Equipment {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private String make;
    private String model;
    private String type;
    private String serialNumber;
    private String description;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Equipment () {
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the make of the equipment. This is the name of the manufacturer, 
     * such as HP, Ford, etc.
     * 
     * @return manufacturer
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the equipment. This is the name of the manufacturer,
     * such as HP, Ford, etc.
     * 
     * @param make the manufacturer
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the model of the equipment. This is the name of the product, such as
     * Pavilion, F-150, etc.
     * 
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the equipment. This is the name of the product, such as
     * Pavilion, F-150, etc.
     * 
     * @param model the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the type of the equipment. This is a descriptive term, such as 
     * computer, vehicle, etc.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the equipment. This is a descriptive term, such as
     * computer, vehicle, etc.
     * 
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the serial number of the equipment. This would include the VIN if 
     * the type of equipment is a vehicle.
     * 
     * @return serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number of the equipment. This would include the VIN if 
     * the type of equipment is a vehicle.
     * 
     * @param serialNumber the serial number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the description of the equipment. This could include such things as
     * where the equipment is located, its primary purpose, etc.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the description of the equipment. This could include such things as
     * where the equipment is located, its primary purpose, etc.
     * 
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    //</editor-fold>

}
