package utils;

import org.aeonbits.owner.Config;

import converter.ConfigConverter;

@Config.Sources({"file:./src/test/resources/config/config.properties"})
public interface ConfigProperty extends Config {
	
	
	@ConverterClass(ConfigConverter.class)
	String url();
	String localhost();
	String appPackage();
	String appActivity();
	String iOSAppPath();
	int timeout();
	String androidAppPath();


}
