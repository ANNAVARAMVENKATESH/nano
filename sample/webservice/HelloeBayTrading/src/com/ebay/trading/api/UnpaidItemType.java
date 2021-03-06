// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <strong>UnpaidItem</strong> container, which consists of
 * details related to the type and status of an Unpaid Item case.
 * 
 */
public class UnpaidItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Status")
	@Order(value=0)
	public UnpaidItemCaseStatusTypeCodeType status;	
	
	@Element(name = "Type")
	@Order(value=1)
	public UnpaidItemCaseOpenTypeCodeType type;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}