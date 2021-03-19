package br.com.software.fabrica;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PreenchendoEValidando {	
	
	@Test
	public void preenchendo() {
		
		File file = new File("/home/bruno/Área de Trabalho/DesafioConductorQA/TestesFront/chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html"); 
		
		WebElement username = driver.findElement(By.name("username")); 
		username.sendKeys("QA User"); 
		
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("QA Password"); 
		
		WebElement comment = driver.findElement(By.name("comments")); 
		driver.findElement(By.name("comments")).clear();
		comment.sendKeys("Comentario");
		
		WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[1]"));
		checkbox.click();
		
		WebElement checkbox_two = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[2]"));
		checkbox_two.click();
		
		WebElement radio = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[6]/td/input[1]"));
		radio.click();
		
		WebElement multiple_select_values_one = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[4]"));
		multiple_select_values_one.click();
		
		WebElement multiple_select_values = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[1]"));
		multiple_select_values.click();
		
		WebElement drop_drowns = driver.findElement(By.name("dropdown"));
		drop_drowns.click();
		
		WebElement drop_drowns_two = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[8]/td/select/option[1]"));
		drop_drowns_two.click();
		
		WebElement button_submit = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[9]/td/input[2]"));//CHECKBOX
		button_submit.click();
		
		
		Assert.assertEquals("QA User", driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/ul/li")).getText());
		Assert.assertEquals("QA Password", driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/ul/li")).getText());
		Assert.assertEquals("Comentario", driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/ul/li")).getText());
		Assert.assertEquals("Comentario", driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/ul/li")).getText());
		Assert.assertEquals("No Value for filename", driver.findElement(By.xpath("/html/body/div/div[3]/p/strong")).getText());
		Assert.assertEquals("Hidden Field Value", driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/ul/li")).getText());
		Assert.assertEquals("cb1", driver.findElement(By.xpath("/html/body/div/div[3]/div[5]/ul/li[1]")).getText());
		Assert.assertEquals("cb2", driver.findElement(By.xpath("/html/body/div/div[3]/div[5]/ul/li[2]")).getText());
		Assert.assertEquals("cb3", driver.findElement(By.xpath("/html/body/div/div[3]/div[5]/ul/li[3]")).getText());
		Assert.assertEquals("rd1", driver.findElement(By.xpath("/html/body/div/div[3]/div[6]/ul/li")).getText());
		Assert.assertEquals("ms1", driver.findElement(By.xpath("/html/body/div/div[3]/div[7]/ul/li")).getText());
		Assert.assertEquals("dd1", driver.findElement(By.xpath("/html/body/div/div[3]/div[8]/ul/li")).getText());
		Assert.assertEquals("submit", driver.findElement(By.xpath("/html/body/div/div[3]/div[9]/ul/li")).getText());
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html"); 
		
		WebElement radio_one = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[6]/td/input[1]"));
		radio_one.click();
		
		WebElement multiple_select_values_two = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[4]"));
		multiple_select_values_two.click();
		
		WebElement multiple_select_values_three = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[1]"));
		multiple_select_values_three.click();
		
		WebElement drop_drowns_one = driver.findElement(By.name("dropdown"));
		drop_drowns_one.click();
		
		WebElement drop_drowns_three = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[8]/td/select/option[1]"));
		drop_drowns_three.click();
		
		WebElement button_submit_one = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[9]/td/input[2]"));//CHECKBOX
		button_submit_one.click();
		
		Assert.assertEquals("No Value for username", driver.findElement(By.xpath("/html/body/div/div[3]/p[1]/strong")).getText());
		Assert.assertEquals("No Value for password", driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/strong")).getText());
		Assert.assertEquals("Comments...", driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/ul/li")).getText());
		Assert.assertEquals("No Value for filename", driver.findElement(By.xpath("/html/body/div/div[3]/p[3]/strong")).getText());
		Assert.assertEquals("Hidden Field Value", driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/ul/li")).getText());
		Assert.assertEquals("cb3", driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/ul/li")).getText());
		Assert.assertEquals("rd1", driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/ul/li")).getText());
		Assert.assertEquals("ms1", driver.findElement(By.xpath("/html/body/div/div[3]/div[5]/ul/li")).getText());
		Assert.assertEquals("dd1", driver.findElement(By.xpath("/html/body/div/div[3]/div[6]/ul/li")).getText());
		Assert.assertEquals("submit", driver.findElement(By.xpath("/html/body/div/div[3]/div[7]/ul/li")).getText());
	}
}
