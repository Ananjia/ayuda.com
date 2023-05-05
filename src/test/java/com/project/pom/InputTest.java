package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InputTest {

	
private WebDriver driver;
	
 InputPage InputPageMin;   
	
	
	@Before
	public void setUp() throws Exception {
		
		
		InputPageMin = new InputPage(driver);	
		driver =  InputPageMin.chromeDriverConnection();
		
		InputPageMin.visit("https://the-internet.herokuapp.com/inputs");
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test()throws InterruptedException {
		InputPageMin.iniciarInput();
		
	}

}
