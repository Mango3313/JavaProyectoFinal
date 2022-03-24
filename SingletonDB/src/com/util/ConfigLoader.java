package com.util;

import java.util.Properties;

public class ConfigLoader {
	private static Properties props;
	
	static {
		try  {
            props = new Properties();
            props.load(ConfigLoader.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (Exception e) {
        	System.out.println(e);
            throw new RuntimeException("Faild to load configuration");
        }
    }
    
    public static String getDBType(){
        return props.getProperty("drivername");
    }
    
    public static String getPropery(String propName){
        return props.getProperty(propName);
    }
}
