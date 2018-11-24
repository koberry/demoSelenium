package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGBH {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://gbh.com.do");

		driver.manage().window().maximize();

		//Inicio
		driver.findElement(By.xpath("//*[@id=\"menu-item-21\"]/a")).click();
		//Servicios
		driver.findElement(By.xpath("//*[@id=\"menu-item-209\"]/a")).click();
		//Portafolio
		driver.findElement(By.xpath("//*[@id=\"menu-item-62\"]/a")).click();
		//Contactenos
		driver.findElement(By.xpath("//*[@id=\"menu-item-65\"]/a")).click();
		//Empleos
		driver.findElement(By.xpath("//*[@id=\"menu-item-126\"]/a")).click();
		//Blog
		driver.findElement(By.xpath("//*[@id=\"menu-item-20\"]/a")).click();
	}

}
