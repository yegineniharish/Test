package com.projectName.base;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	/**
	 * Configuration of all browsers All Reusable methods Reporting utilities
	 * Property readers xml readers
	 * 
	 */

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static DesiredCapabilities cap;



	public void properties() throws IOException {

		prop = new Properties();
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\com\\projectName\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prop);

	}

	public void invoke() throws IOException {

		properties();
		invokeBrowser("Chrome");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	public void invokeBrowser(String browser) {

		if (browser.contains("Chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--incognito");
			cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(cap);

		} else if (browser.contains("Firfox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fp = new FirefoxOptions();
			String path = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
			fp.setBinary(path);
			driver = new FirefoxDriver(fp);

		} else {

		}

	}

}
