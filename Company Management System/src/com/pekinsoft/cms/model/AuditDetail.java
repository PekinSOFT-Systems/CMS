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
public class AuditDetail {
    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    private long id;
    private long auditID;
    private String partNumber;
    private int quantityOnHand;
    private int shrinkage;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    /**
     * Creates a default `AuditDetail` object with only the unique ID value set.
     */
    public AuditDetail () {
        this.id = System.currentTimeMillis();
    }
    
    /**
     * Creates a new `AuditDetail` object with the unique ID number of the audit
     * to which it belongs provided. All other data will need to be provided
     * separately.
     * 
     * @param auditID the unique ID of the audit to which this detail belongs
     */
    public AuditDetail ( long auditID ) {
        this();
        this.auditID = auditID;
    }
    
    /**
     * Creates a new `AuditDetail` object with the unique ID number of the audit
     * to which this detail belongs and the part number being audited. All other
     * data will need to be provided separately.
     * 
     * @param auditID the unique ID of the audit to which this detail belongs
     * @param partNumber the part number being audited
     */
    public AuditDetail ( long auditID, String partNumber ) {
        this(auditID);
        this.partNumber = partNumber;
    }
    
    /**
     * Creates a new `AuditDetail` object with the unique ID number of the audit
     * to which this detail belongs, the part number being audited, and the 
     * current quantity of that part number on hand. The remaining data will 
     * need to be provided separately.
     * 
     * @param auditID the unique ID of the audit to which this detail belongs
     * @param partNumber the part number being audited
     * @param qtyOnHand the current quantity on hand
     */
    public AuditDetail ( long auditID, String partNumber, int qtyOnHand ) {
        this(auditID, partNumber);
        this.quantityOnHand = qtyOnHand;
    }
    
    /**
     * Creates a new `AuditDetail` object with all data for this detail provided.
     * 
     * @param auditID the unique ID of the audit to which this detail belongs
     * @param partNumber the part number being audited
     * @param qtyOnHand the current quantity on hand
     * @param shrinkage the quantity of this part number that was not sold, but
     *                  is not on hand either
     */
    public AuditDetail( long auditID, String partNumber, int qtyOnHand, 
            int shrinkage ) {
        this(auditID, partNumber, qtyOnHand);
        this.shrinkage = shrinkage;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Gets the unique ID number for this audit detail.
     * 
     * @return unique ID number
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique ID number for this audit detail.
     * 
     * @param id the unique ID number
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the unique ID number of the audit to which this detail belongs.
     * 
     * @return unique audit ID number
     */
    public long getAuditID() {
        return auditID;
    }

    /**
     * Sets the unique ID number of the audit to which this detail belongs.
     * 
     * @param auditID the unique audit ID number
     */
    public void setAuditID(long auditID) {
        this.auditID = auditID;
    }

    /**
     * Gets the part number of the product this detail is auditing.
     * 
     * @return unique part number of this detail
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the part number of the product this detail is auditing.
     * 
     * @param partNumber the part number of this detail
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Gets the quantity of the product on hand during this audit detail.
     * 
     * @return quantity on hand of the product
     */
    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the quantity on hand of the product during this audit detail.
     * 
     * @param quantityOnHand the quantity on hand of the product
     */
    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    /**
     * Gets how many of the product is missing, but has not been sold.
     * 
     * @return the number of units missing
     */
    public int getShrinkage() {
        return shrinkage;
    }

    /**
     * Sets how many of the product is missing, but has not been sold.
     * 
     * @param shrinkage the number of missing units
     */
    public void setShrinkage(int shrinkage) {
        this.shrinkage = shrinkage;
    }
    //</editor-fold>

}
