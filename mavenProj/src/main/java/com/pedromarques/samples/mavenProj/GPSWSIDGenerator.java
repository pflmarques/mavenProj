package com.pedromarques.samples.mavenProj;

public class GPSWSIDGenerator {
	
	static long WSId;

	public static long getWSID() {
		
		String tmpStr = (new Long(System.currentTimeMillis()/1000)).toString() + WSId++;
		
		return (new Long(tmpStr));
	}
	
}
