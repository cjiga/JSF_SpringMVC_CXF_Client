package edu.upc.cine.util;



import java.io.IOException;
import java.util.Properties;

public class ParameterUtil {
	
	
	public ParameterUtil() {
		
		try {
			properties = new Properties();
			ClassLoader classLoader = getClass().getClassLoader();
			properties.load(classLoader.getResourceAsStream("cine-config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getCineRestServiceURL(){
		return get("cine-rest-services-url");
	}
	
	public static String get(String key){
		return _instance._get(key);
	}
	
	private String _get(String key){
		return _instance.properties.getProperty(key);
	}
	
	public static void reload() {
		_instance = new ParameterUtil();
	}
	
	private static ParameterUtil _instance = new ParameterUtil();
	
	private Properties properties;
	//private static PropsUtil _instance = new PropsUtil();

}
