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
public class SaleDetail {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private long saleID;
    private String partNumber;
    private int quantity;
    private double lineTotal;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `SaleDetail` object, supplying only the sale detail ID.
     * All other data must be supplied separately.
     */
    public SaleDetail () {
        this.id = System.currentTimeMillis();
    }
    
    /**
     * Creates a new `SaleDetail` object supplying only the sale detail ID and 
     * to which sale this detail belongs. All other data must be supplied 
     * separately.
     * 
     * @param saleID unique ID of which sale this detail belongs
     */
    public SaleDetail ( long saleID ) {
        this();
        this.saleID = saleID;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the unique ID for this sale detail.
     * 
     * @return unique detail ID
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID for this sale detail.
     * 
     * @param id the unique detail ID
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the unique ID of the sale to which this detail belongs.
     * 
     * @return unique sale ID
     */
    public long getSaleID() {
        return saleID;
    }

    /**
     * Sets the unique ID of the sale to which this detail belongs.
     * 
     * @param saleID the unique sale ID
     */
    public void setSaleID(long saleID) {
        this.saleID = saleID;
    }

    /**
     * Gets the part number of the product this detail is selling.
     * 
     * @return part number
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the part number of the product this detail is selling.
     * 
     * @param partNumber the part number
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Gets how many of the product are being sold.
     * 
     * @return quantity sold
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets how many of the product is being sold.
     * 
     * @param quantity quantity sold
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the line total for this detail.
     * 
     * @return line total
     */
    public double getLineTotal() {
        return lineTotal;
    }

    /**
     * Sets the line total for this detail.
     * 
     * @param lineTotal price for the number of this product sold
     */
    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
    //</editor-fold>

}
