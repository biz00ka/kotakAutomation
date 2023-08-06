package utils;

import java.io.IOException;
import java.net.ServerSocket;

import constants.Constants;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public final class AppiumServerUtils {
	
	private static AppiumDriverLocalService service;
	private static AppiumServiceBuilder builder;
	
	public static void startAppiumService(String portNumber)
	{

		builder= new AppiumServiceBuilder();
		builder.withIPAddress(Constants.APPIUM_SERVER_ADDRESS);
		builder.usingPort(Integer.parseInt(portNumber));
		service=AppiumDriverLocalService.buildService(builder);
		service.start();
		System.out.println("Appium Service started on "+portNumber);


	}
	
	public static void stopAppiumService()
	{
		service.stop();
	}

	public static boolean ifServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

}
