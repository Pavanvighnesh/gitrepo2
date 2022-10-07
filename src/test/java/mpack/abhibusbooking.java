package mpack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class abhibusbooking extends Base {
	 WebDriver driver;
	 @Test
	 public void abhibusbooking() throws IOException, InterruptedException {
		  driver=initializedriver();
		 driver.get("https://www.abhibus.com/");
		 WebElement from = driver.findElement(By.id("source"));
		   from.sendKeys("Amalapuram");
		   Thread.sleep(2000);
		   from.sendKeys(Keys.ENTER);
		   WebElement to=driver.findElement(By.id("destination"));
		   to.sendKeys("vizag");
		   Thread.sleep(2000);
		   to.sendKeys(Keys.ENTER);
		 WebElement calender= driver.findElement(By.id("datepicker1"));
		  calender.click();
		  WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[5]/a"));
		 date.click(); 
		 WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']"));
		 search.click();
		 WebElement click=driver.findElement(By.xpath("//*[@id=\"ShowBtnHide01\"]"));
		   click.click();
		 WebElement selectbus= driver.findElement(By.id("1223531166"));
		  selectbus.click();
		 WebElement Boardingpoint=driver.findElement(By.id("pickup_id"));
		 Select select=new Select(Boardingpoint);
         select.selectByVisibleText("Amalapuram-17:00");
	     Thread.sleep(2000);
	      WebElement Droppingpoint=driver.findElement(By.id("drop_id"));
	          Select select1=new Select(Droppingpoint);
	          select1.selectByVisibleText("Old Gajuwaka-22:50");
	      Thread.sleep(2000);      
	    WebElement Generalpublic=driver.findElement(By.xpath("//option[text()='SENIOR CITIZEN']"));
	    Generalpublic.click();
	 }
}

