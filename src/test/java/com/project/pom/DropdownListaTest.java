package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DropdownListaTest {

	
	private WebDriver driver;
	
	DropdownListaPage ddlp;
	
	@Before
	public void setUp() throws Exception {
		

		ddlp = new DropdownListaPage(driver);	
		driver =  ddlp.chromeDriverConnection();
		
		driver.manage().window().maximize();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ddlp.visit("https://the-internet.herokuapp.com/dropdown");
		ddlp.SelectDropdownlist();
		assertEquals(ddlp.SelectDropdownlist(), "Option 2" );
		
	}

}
