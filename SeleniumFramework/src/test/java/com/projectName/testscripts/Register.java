package com.projectName.testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectName.base.TestBase;
import com.projectName.pages.RegisterPage;

public class Register extends TestBase {
	
	RegisterPage rp;
	
	@BeforeClass
	public void lunch() throws IOException {
		
		invoke();
		
		rp = new RegisterPage(driver);
	}
	
	@Test
	public void test() {
		
		rp.clickregisterLink();
		
		String title = rp.getTitle();
		
		System.out.println(title);
		
		rp.clickGender();
		
		rp.firstName("harish");
		
		rp.lastName("Y");
		
		rp.enteremail("harishy@ctel.in");
		
		rp.passwordEnter("cteladmin");
		
		rp.confirmPassword("cteladmin");
		
		rp.clickRegisterSubmit();
		
	}
	
	
	

}
