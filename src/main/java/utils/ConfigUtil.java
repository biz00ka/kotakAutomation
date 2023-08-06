package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
private static Properties properties;
	
	public static Properties setupProperties(String path)
	{
		try {
			FileInputStream Locator = new FileInputStream(path);
			properties = new Properties();
			properties.load(Locator);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public static String getPropertyvalue(String key)
	{
		return properties.getProperty(key);
	}


}
