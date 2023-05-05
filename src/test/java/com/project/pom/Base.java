package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	
	public Base(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}

	//Conecion con el Driver de Google chrome
	public WebDriver chromeDriverConnection(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ajimenez\\\\Downloads\\\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
	
	public WebElement findElement(By locator) {
		
		
		return driver.findElement(locator);
		
	
	}
	
	public List<WebElement>  findElements(By locator) {
		
		
		return driver.findElements(locator);
		
	
	}
	
	
	public String getWebElement(WebElement element) {
		
		
		return element.getText();
		
		
	}
	
	
	public String getText(By locator) {
		
		return driver.findElement(locator).getText();
		
	}
	
	public String getText(WebElement element) {
		
		return element.getText();
		
	}
	
	
	public void type(String inputText, By locator) {
		
		
		driver.findElement(locator).sendKeys(inputText);
	}
	
	
	public void click(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
   public void click(WebElement element) {
		element.click();
		
	}
	
	
	
	public Boolean isDisplayed(By locator) {
		
		try {
			
			return driver.findElement(locator).isDisplayed();
			
			
		} catch(org.openqa.selenium.NoSuchElementException e){
			
		return false;
			
		}
	
		
		
		
	}
	
	public void visit(String url) {
		
		driver.get(url);
		
		
	}
	
}
