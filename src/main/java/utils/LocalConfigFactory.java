package utils;

import org.aeonbits.owner.*;

public final class LocalConfigFactory {
	
	public static ConfigProperty getConfigValue()
	{
		return ConfigFactory.create(ConfigProperty.class);
	}

}
