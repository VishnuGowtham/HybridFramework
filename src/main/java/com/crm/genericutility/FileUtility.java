package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Vishnu
 *
 */

public class FileUtility {
    
	/**
	 * its used to read the data from commonData.properties File based on 
	 * Key which you pass as an argument
	 * @param Key
	 * @return
	 * @throws Exception 
	 * @throws Throwable
	 */
	public String getDataPropertyKeyValue(String Key) throws Exception  {
	FileInputStream fileInputStream = new FileInputStream(IPathConstants.PROPERTYFILE_PATH);
	Properties propObj = new Properties();
	propObj.load(fileInputStream);
	String value = propObj.getProperty(Key);
	return value;
  }
}