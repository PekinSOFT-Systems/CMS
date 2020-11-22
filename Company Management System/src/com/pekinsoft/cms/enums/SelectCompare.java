/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pekinsoft.cms.enums;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 *
 * @version 0.1.0
 * @since 0.1.0
 */
public enum SelectCompare {
    /** Two values are equal.**/
    EQUAL(0),
    /** Field value is less than provided value.*/
    LESS_THAN(-1),
    /** Field value is greater than provided value.*/
    GREATER_THAN(1),
    /** Field value is less than or equal to provided value.*/
    LESS_THAN_EQUAL(-2),
    /** Field value is greater than or equal to provided value.*/
    GREATER_THAN_EQUAL(2),
    /** Field value falls between the two provided values, not including the
     * provided values.*/
    BETWEEN_EXCLUSIVE(3),
    /** Field value falls between the two provided values, including the provided
     * values.*/
    BETWEEN_INCLUSIVE(4);
    
    final int status;
    
    SelectCompare(int iStatus) {
        this.status = iStatus;
    }
}
