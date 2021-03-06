// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Details about a summary event schedule.
 * 
 */
public class SummaryEventScheduleType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EventType")
	@Order(value=0)
	public NotificationEventTypeCodeType eventType;	
	
	@Element(name = "SummaryPeriod")
	@Order(value=1)
	public SummaryWindowPeriodCodeType summaryPeriod;	
	
	@Element(name = "Frequency")
	@Order(value=2)
	public SummaryFrequencyCodeType frequency;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}