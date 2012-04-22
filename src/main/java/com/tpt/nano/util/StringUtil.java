package com.tpt.nano.util;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class StringUtil {

	public static boolean isEmpty(String value) {
		return value == null || value.length() == 0;
	}
	
	public static String lowercaseFirstLetter(String value) {
		char[] stringArray = value.toCharArray();
		stringArray[0] = Character.toLowerCase(stringArray[0]);
		return new String(stringArray);
	}
	
	public static void string2Writer(String source, Writer out) throws IOException {
		
		char[] buffer = source.toCharArray();
		for(int i = 0; i < buffer.length; i++) {
			out.append(buffer[i]);
		}
		out.flush();
	}
	
	public static String reader2String(Reader source) throws IOException {
		char[] cbuf = new char[65535];
		StringBuffer stringbuf = new StringBuffer();
		
		int count = 0;
		while ((count = source.read(cbuf, 0, 65535)) != -1) {
			stringbuf.append(cbuf, 0, count);
		}
		
		return stringbuf.toString();
	}
	
}
