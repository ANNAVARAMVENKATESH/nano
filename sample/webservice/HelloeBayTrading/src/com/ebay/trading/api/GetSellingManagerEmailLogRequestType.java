// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves a log of emails sent, or scheduled to be sent, to buyers.
 * <br><br>
 * The standard Trading API
 * deprecation process is not applicable to this call.
 *     
 */
@RootElement(name = "GetSellingManagerEmailLogRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerEmailLogRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=1)
	public Long transactionID;	
	
	@Element(name = "OrderID")
	@Order(value=2)
	public String orderID;	
	
	@Element(name = "EmailDateRange")
	@Order(value=3)
	public TimeRangeType emailDateRange;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=4)
	public String orderLineItemID;	
	
    
}