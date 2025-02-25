package Pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home_ViewAllCart_page {
WebDriver driver;
	
	By btn_viewAllCard = By.xpath("//*[text()='View All Cards']");
	By btn_category = By.name("cloud-filter-select");
	

	public Home_ViewAllCart_page(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public void clickViewAll() {
		driver.findElement(btn_viewAllCard).click();
	
	}
	public void clickCategory() {
	 driver.findElement(btn_category).click();
	
	}
}
