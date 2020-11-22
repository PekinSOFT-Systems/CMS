/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and load the template in the editor.
 */

package com.pekinsoft.cms.api;

import com.pekinsoft.cms.enums.SelectCompare;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @param <T>
 * @since 0.1.0
 */
public abstract class AbstractRecord<T> {
    //<editor-fold defaultstate="collapsed" desc="Protected Member Fields">
    protected ArrayList<T> records;
    protected int currentRecord;
    protected String folderName;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">

    /**
     * Creates a new `AbstractRecord` object.
     * 
     * @param folderName the name of the folder in which the data files reside
     */
    public AbstractRecord (String folderName) {
        records = new ArrayList<>();
        currentRecord = 0;
        this.folderName = folderName;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Abstract Method Declarations">
    /**
     * Sorts the table records by the given field.
     * 
     * @param sortBy the field to sort by.
     * @return an `ArrayList` of the data files, sorted by the given field in
     *          ascending order.
     */
    public abstract ArrayList<T> performSort(String sortBy);
    
    /**
     * Selects the records based upon the given parameters.
     * 
     * @param select the type of select (i.e., the name of the field, or "all")
     * @param from the field upon which the comparison for the selection is to
     *              be made
     * @param by the value for comparison of the selection field value
     * @param on the test for the comparison (i.e., EQUALS, LESS_THAN, etc.)
     * @return an `ArrayList` of the files with matching values.
     */
    public abstract ArrayList<T> selectRecords(String select, String from, 
            String by, SelectCompare on);
    
    /**
     * Loads all records from files for use.
    */
    protected abstract boolean load();
    
    /**
     * Saves a record to file.
     */
    public abstract boolean save();
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    /**
     * Destroys the current object, closing all load files, if any, and saving
 any unsaved data in the process.
     */
    public void destroy() {
        
    }
    
    /**
     * Moves to the first record in this table.
     * 
     * @return the first record as a `T` object.
     */
    public T first() {
        return this.records.get(0);
    }
    
    /**
     * Moves to the previous record, if any, in this table.
     * 
     * @return the previous record as a `T` object, or `null`, if no previous
     *          record exists.
     */
    public T previous() {
        if ( this.currentRecord > 0 )
            return this.records.get(--currentRecord);
        
        return null;
    }
    
    /**
     * Moves to the next record, if any, in this table.
     * 
     * @return the next record as a `T` object, or `null`, if no next record
     *          exists.
     */
    public T next() {
        if ( this.currentRecord < getRecordCount() )
            return this.records.get(++currentRecord);
        
        return null;
    }
    
    /**
     * Moves to the last record in this table.
     * 
     * @return the last record as a `T` object.
     */
    public T last() {
        this.currentRecord = getRecordCount();
        return this.records.get(currentRecord - 1);
    }
    
    /**
     * Adds a new record to this table.
     * 
     * @param data the record to add as a `T` object
     */
    public void addNew(T data) {
        this.records.add(data);
    }
    
    /**
     * Updates the data in an existing record in this table.
     * 
     * @param data the new data for the record as a `T` object
     */
    public void update(T data) {
        this.records.set(currentRecord, data);
    }
    
    /**
     * Deletes the current record data from the table.
     * 
     * <dl>
     * <dt>Important Note</dt>
     * <dd>This action cannot be undone!</dd></dl>
     */
    public void delete() {
        this.records.remove(currentRecord);
    }
    
    /**
     * Deletes a specific record from this table.
     * 
     * <dl>
     * <dt>Important Note</dt>
     * <dd>This action cannot be undone!</dd></dl>
     * 
     * @param recordToRemove the record to delete
     */
    public void delete(T recordToRemove) {
        boolean remove = this.records.remove(recordToRemove);
        
        if ( remove ) {
            JOptionPane.showInternalMessageDialog(null, "Object removed from ArrayList.");
        } else {
            JOptionPane.showInternalMessageDialog(null, "Object NOT removed from ArrayList!");
        }
    }
    
    public T get() {
        return this.records.get(currentRecord);
    }
    
    /**
     * Retrieves the number of the current record in the table.
     * 
     * @return the current record number.
     */
    public int getCurrentRecord() {
        return this.currentRecord;
    }
    
    /**
     * Retrieves the total number of records in this table.
     * 
     * @return the total count of all records in this table.
     */
    public int getRecordCount() {
        return this.records.size();
    }
    
    public Iterator getIterator() {
        return this.records.iterator();
    }
    
    /**
     * Determines if the table has at least one more record in it.
     * 
     * @return `true` if at least one more record exists, `false` otherwise.
     */
    public boolean hasNext() {
        return this.currentRecord < (getRecordCount() - 1);
    }
    //</editor-fold>

}
