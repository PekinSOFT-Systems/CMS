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
public class Product {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private String partNumber;
    private int initialQuantity;
    private String name;
    private String description;
    private long vendorID;
    private double price;
    private String unit;
    private int quantityPerUnit;
    private int minimumOrderQuantity;
    private int targetQuantity;
    private boolean discontinued;
    private boolean includeOnInventory;
    private boolean hazardous;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Product () {
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the unique identification information for this product. This will 
     * typically be a SKU or an UPC barcode value.
     * 
     * @return part number
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the unique identification information for this product. This will 
     * typically be a SKU or an UPC barcode value.
     * 
     * @param partNumber the part number
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Gets the initial quantity of this product in inventory.
     * 
     * @return initial quantity
     */
    public int getInitialQuantity() {
        return initialQuantity;
    }

    /**
     * Sets the initial quantity of this product in inventory.
     * 
     * @param initialQuantity the initial inventory quantity
     */
    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    /**
     * Gets the name of this product.
     * 
     * @return name of product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this product.
     * 
     * @param name the name of product
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the product description.
     * 
     * @return product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description.
     * 
     * @param description the product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the unique vendor ID number for this product.
     * 
     * @return unique vendor ID
     */
    public long getVendorID() {
        return vendorID;
    }

    /**
     * Sets the unique vendor ID number for this product.
     * 
     * @param vendorID the unique vendor ID
     */
    public void setVendorID(long vendorID) {
        this.vendorID = vendorID;
    }

    /**
     * Gets the price per unit for this product. This amount may not be the same
     * as the price each of the product, as the product may be sold or shipped 
     * in larger units than each, such as pair, case, pack, etc. To verify, the
     * unit for the product should be checked.
     * 
     * @return price per unit
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price per unit for this product. This amount may not be the same
     * as the price each of the product, as the product may be sold or shipped
     * in larger units than each, such as pair, case, pack, etc.
     * 
     * @param price price per unit
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the selling or shipping unit for this product. This value should be
     * each, pair, pack, case, etc.
     * 
     * @return selling or shipping unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the selling or shipping unit for this product. This value should be
     * each, pair, pack, case, etc.
     * 
     * @param unit selling or shipping unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Gets the quantity of the product in each unit the product is sold or
     * shipped in.
     * 
     * @return quantity per each unit
     */
    public int getQuantityPerUnit() {
        return quantityPerUnit;
    }

    /**
     * Sets the quantity of the product in each unit the product is sold or
     * shipped in.
     * 
     * @param quantityPerUnit the quantity per each unit
     */
    public void setQuantityPerUnit(int quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    /**
     * Gets the minimum ordering quantity. This is the minimum number of the 
     * product unit that should be ordered each time an order is placed.
     * 
     * @return minimum ordering quantity
     */
    public int getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the minimum ordering quantity. This is the minimum number of the
     * product unit that should be ordered each time an order is placed.
     * 
     * @param minimumOrderQuantity the minimum ordering quantity
     */
    public void setMinimumOrderQuantity(int minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    /**
     * Gets the target quantity of the product that should always be in the
     * inventory. This is also known as the "minimum on-hand" quantity.
     * 
     * @return target quantity
     */
    public int getTargetQuantity() {
        return targetQuantity;
    }

    /**
     * Sets the target quantity of the product that should always be in the
     * inventory. This is also known as the "minimum on-hand" quantity.
     * 
     * @param targetQuantity the target quantity
     */
    public void setTargetQuantity(int targetQuantity) {
        this.targetQuantity = targetQuantity;
    }

    /**
     * Determines whether or not this product has been discontinued.
     * 
     * @return `true` if no longer carried, `false` otherwise.
     */
    public boolean isDiscontinued() {
        return discontinued;
    }

    /**
     * Sets whether or not this product has been discontinued.
     * 
     * @param discontinued `true` if no longer carried, `false` otherwise.
     */
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    /**
     * Determines whether or not this product should be counted on the inventory
     * report. This is useful if the company carries not only goods for sale, 
     * but also maintains their internal office supplies in the same database.
     * 
     * @return `true` if to be included on the report, `false` otherwise.
     */
    public boolean isIncludeOnInventory() {
        return includeOnInventory;
    }

    /**
     * Sets whether or not this product should be counted on the inventory
     * report. This is useful if the company carries not only goods for sale, 
     * but also maintains their internal office supplies in the same database.
     * 
     * @param includeOnInventory `true` if to be included on the report, `false`
     *                  otherwise.
     */
    public void setIncludeOnInventory(boolean includeOnInventory) {
        this.includeOnInventory = includeOnInventory;
    }

    /**
     * Determines whether or not the product is a hazardous material. This is an
     * important piece of information, as if the product is hazardous, an MSDS
     * must be maintained for the product.
     * 
     * @return `true` if hazardous, `false` otherwise.
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * Sets whether or not this product is a hazardous material. This is an 
     * important piece of information, as if the product is hazardous, an MSDS
     * must be maintained for the product.
     * 
     * @param hazardous `true` if hazardous, `false` otherwise.
     */
    public void setHazardous(boolean hazardous) {
        this.hazardous = hazardous;
    }
    //</editor-fold>

}
