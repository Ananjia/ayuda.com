package com.project.pom;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class hoverTest {

    private WebDriver driver;
	
    hoverPage hoverPageMin;   
	
	
	@Before
	public void setUp() throws Exception {
		
		hoverPageMin = new hoverPage(driver);	
		driver =  hoverPageMin.chromeDriverConnection();
		
		hoverPageMin.visit("https://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		

		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		hoverPageMin.SelectHover();
	}

}
