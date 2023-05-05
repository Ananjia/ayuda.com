package com.project.pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownListaPage extends Base {
	
	By selectDropdown = By.xpath("//select[@id='dropdown']");
	
	
	
	
	
	public DropdownListaPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public String SelectDropdownlist() {
		
		
		WebElement dropdown = findElement(selectDropdown);
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		
		for (int i = 0; i < options.size(); i++) {
			if(getText(options.get(i)).equals("Option 2")) {
				click(options.get(i));
				
				
			}
		
			
		}
	
	String selectedOption = "";
		 
	for (int i = 0; i < options.size(); i++) {
	
		if(options.get(i).isSelected()) {
		
			selectedOption = getText(options.get(i));
	
	}
		
	}
	return selectedOption;
	
	


}
}