package com.tpt.nano;

import java.util.Date;

import com.tpt.nano.annotation.XmlElement;
import com.tpt.nano.annotation.XmlRootElement;

import junit.framework.TestCase;

public class DateTest extends TestCase {
	private static final String DATETIME_XML = "<?xml version=\"1.0\"?>\n" + 
                                               "<dateTime>\n" + 
			                                   "<time>2012-01-02T05:22:15.000Z</time>\n" +
                                               "</dateTime>\n";
	
	@XmlRootElement
	public static class DateTime {
		@XmlElement
		private Date time;
		
		public Date getTime() {
			return time;
		}
		
		public void setTime(Date time) {
			this.time = time;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((time == null) ? 0 : time.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DateTime other = (DateTime) obj;
			if (time == null) {
				if (other.time != null)
					return false;
			} else if (!time.equals(other.time))
				return false;
			return true;
		}
	}
	
	public void testRead() throws Exception {
		IReader xmlReader = NanoFactory.getXMLReader();
		DateTime dateTime = xmlReader.read(DateTime.class, DATETIME_XML);
		assertEquals("2 Jan 2012 05:22:15 GMT", dateTime.getTime().toGMTString());
	}
	
	public void testWrite() throws Exception {
		DateTime dateTime = new DateTime();
		dateTime.setTime(new Date(Date.UTC(112, 2, 3, 11, 20, 59)));
		String xmlStr = NanoFactory.getXMLWriter().write(dateTime);
		assertTrue(xmlStr.indexOf("<time>2012-03-03T11:20:59.000Z</time>") > 0);
	}
	
	public void testReadWrite() throws Exception {
		DateTime dateTime = new DateTime();
		dateTime.setTime(new Date(Date.UTC(111, 10, 10, 2, 3, 25)));
		String xmlStr = NanoFactory.getXMLWriter().write(dateTime);
		DateTime dateTimeNew = NanoFactory.getXMLReader().read(DateTime.class, xmlStr);
		assertEquals(dateTimeNew, dateTime);
	}
}