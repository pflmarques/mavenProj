package com.pedromarques.samples.mavenProj;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class GPSWSDateTime {
	
	public static String getGPSWSDate() {
		
//		Date date = new Date();
//		
//		// month/day/year (1/3/14)
//		StringTokenizer stDate = new StringTokenizer( (DateFormat.getDateInstance(DateFormat.SHORT)).format(date), "/" );
//		String month = stDate.nextToken();
//		if( month.length() < 2 )
//			month = "0" + month;
//		String day = stDate.nextToken();
//		if( day.length() < 2 )
//			day = "0" + day;		
//		String year = "20" + stDate.nextToken();
		
		return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
	}

	public static String getGPSWSTime() {
		
//		Date date = new Date();
//		
//		// hour/minute/second AM/PM (12:2:19 PM  ... it's noon)
//		StringTokenizer stTime = new StringTokenizer( (DateFormat.getTimeInstance(DateFormat.MEDIUM)).format(date), ":" );
//		String hour = stTime.nextToken();
//		if( hour.length() < 2 )
//			hour = "0" + hour;
//		String minute = stTime.nextToken();
//		if( minute.length() < 2 )
//			minute = "0" + minute;
//		StringTokenizer stSecAmPm = new StringTokenizer(stTime.nextToken());
//		String second = stSecAmPm.nextToken();
//		if( second.length() < 2 )
//			second = "0" + second;
//		if ( stSecAmPm.nextToken().equals("PM") ) {
//			int h = new Integer(hour);
//			if ( h < 12 ) {
//				h += 12;
//				hour = (new Integer(h)).toString();
//			}
//		}
		
		return new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
	}
	
}
