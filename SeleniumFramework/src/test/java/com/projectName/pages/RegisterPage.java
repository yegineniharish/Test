package com.projectName.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
WebDriver driver;

	
	By Getname = By.xpath("//*[@class='page-title']/h1");
	By registerlink = By.xpath("//*[@class='ico-register']");
	By gender = By.id("gender-male");
	By firstname = By.id("FirstName");
	By lastname = By.id("LastName");
	By emailtext = By.id("Email");
	By password = By.id("Password");
	By confirmpwd = By.id("ConfirmPassword");
	By register = By.id("register-button");

	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	
	public void clickregisterLink() {

		driver.findElement(registerlink).click();
	}

	public void clickGender() {
		driver.findElement(gender).click();

	}

	public void firstName(String fNmae) {

		driver.findElement(firstname).sendKeys(fNmae);
	}

	public void lastName(String lNmae) {

		driver.findElement(lastname).sendKeys(lNmae);
	}
	
	public void enteremail(String email) {

		driver.findElement(emailtext).sendKeys(email);
	}
	
	public void passwordEnter(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}
	
	public void confirmPassword(String cfpwd) {

		driver.findElement(confirmpwd).sendKeys(cfpwd);
	}
	
	public void clickRegisterSubmit() {

		driver.findElement(register).click();
	}

}
