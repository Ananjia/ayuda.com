package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage extends Base{
	
	By inputValor = By.xpath("//input[@type='number']");
	By salirdelDropdown =  By.xpath("//div[@class='large-4 large-centered columns']");

	public InputPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void iniciarInput() throws InterruptedException {
	
		
		Thread.sleep(2000);
		if(isDisplayed(inputValor)) {
			
			type("34", inputValor);
			click(salirdelDropdown);
			
		}else {
			System.out.println("Input page was not found");
			
			
		}
	}
	
     public String valorIngresado(){
		
		
		return getText(inputValor);
	}
	
	

}
