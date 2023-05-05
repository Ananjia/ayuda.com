package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InicioTest {
	
	private WebDriver driver;
	
	LoginPage loginPage;

	@Before
	public void setUp() throws Exception {
		
		loginPage = new LoginPage(driver);	
		driver =  loginPage.chromeDriverConnection();
		loginPage.visit("https://the-internet.herokuapp.com/login");
		
	
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		loginPage.iniciarsesion();
		System.out.println(loginPage.usuarioRegistrado());
		assertEquals("Welcome to the Secure Area. When you are done click logout below.", loginPage.usuarioRegistrado());
		
	}

}
