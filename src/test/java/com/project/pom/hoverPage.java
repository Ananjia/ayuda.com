package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hoverPage extends Base {
	
	
	By selectOptionHover = By.xpath("//img[@alt='User Avatar']");
	
	By opcionElegidaHover = By.xpath("//h5[text()=\"name: user2\"]");
	
	public hoverPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
public void SelectHover() throws InterruptedException {
		
	System.out.println("Funciono1");
	
	
	
	
	
	

	
	
		WebElement hovers = findElement(selectOptionHover);
		hovers.click();
		
		
		List<WebElement> optionshovers = findElements(By.tagName("h5"));
		System.out.println(optionshovers.size());
		System.out.println("Listado de elementos");
		System.out.println(optionshovers);
		
		
		
		for (int i = 0; i < optionshovers.size(); i++) {
			
			
			System.out.println(getText(optionshovers.get(i)));

			
		  if(getText(optionshovers.get(i)).equals("name: user1")) {
				click(optionshovers.get(i));
				System.out.println(getText(optionshovers.get(i)));
				System.out.println("Funciono encontro el user 1");
			}
	
		 
		   
		   
		

	
		   
		
		

}
		
		Thread.sleep(2000);
		if(isDisplayed(selectOptionHover)) {
			
			click(selectOptionHover);
			System.out.println("Encontro el elemento");
			
		}else {
			System.out.println("El elemento no fue encontrado");
			



}
}

}