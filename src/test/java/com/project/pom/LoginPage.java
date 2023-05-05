package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {
	
	By usernameLocator = By.xpath("//input[@name='username']");
	
	
	By passwordLocator= By.xpath("//input[@name='password']");
	
	By botonloginLocator = By.xpath("//i[@class='fa fa-2x fa-sign-in']");

	By mensajeLoginExitoso = By.xpath("//h4[@class='subheader']");
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void iniciarsesion() throws InterruptedException {
	
		
		Thread.sleep(2000);
		if(isDisplayed(usernameLocator)) {
			
			type("tomsmith", usernameLocator);
			type("SuperSecretPassword!",passwordLocator);
			click(botonloginLocator);
		}else {
			System.out.println("Register page was not found");
			
			
		}
	}
	
	public String usuarioRegistrado(){
		
		
		return getText(mensajeLoginExitoso);
	}
	
	
}
