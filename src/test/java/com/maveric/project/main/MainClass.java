package com.maveric.project.main;

import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class MainClass {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://github.com/satishmahajan11");

	}
}