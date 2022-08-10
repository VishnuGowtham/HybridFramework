package com.crm.genericutility;

import java.util.Date;
import java.util.Random;
/**
 * 
 * @author Vishnu	
 *
 */

public class JavaUtility {
	/**
	 * its used to generate random number
	 * @return int data
	 */

	
	public int getRandomNum() {
	Random random = new Random();
	int ranNum = random.nextInt(1000);
	return ranNum;
	}
	
	public String getSystemDateAndTime() {
		
	Date date = new Date();
	String dateAndTime = date.toString().replace(":", "-");
	return dateAndTime;
	}
	
	
	
	
	
	
	
}
