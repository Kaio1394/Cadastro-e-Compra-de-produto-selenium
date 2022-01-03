package br.com.kaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
	protected WebDriver driver;
	private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	public PageObject(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "/home/kaio/Documentos/drivers/chromedriver/chromedriver");

		if (driver == null) {
			this.driver = new ChromeDriver();
			this.navegarURl(URL);
		} else {
			this.driver = driver;
		}
	}

	public void preencherCampoPorId(String id, String texto) {
		// TODO Auto-generated method stub
		this.driver.findElement(By.id(id)).sendKeys(texto);
	}

	public void preencherCampoPorXPath(String xpath, String texto) {
		// TODO Auto-generated method stub
		this.driver.findElement(By.xpath(xpath)).sendKeys(texto);
	}

	public void fecharJanela() {
		// TODO Auto-generated method stub
		this.driver.quit();
	}

	public void navegarURl(String url) {
		this.driver.navigate().to(url);
	}

	public WebElement procurarElementoPeloId(String id) {
		return this.driver.findElement(By.id(id));
	}

	public WebElement procurarElementoPeloXPath(String xpath) {
		return this.driver.findElement(By.xpath(xpath));
	}

	public void limparCampoPorId(String id) {
		this.driver.findElement(By.id(id)).clear();
	}

	public void clicarElementoPeloId(String id) {
		// TODO Auto-generated method stub
		this.procurarElementoPeloId(id).click();
	}

	public void clicarElementoPeloXPath(String xpath) {
		// TODO Auto-generated method stub
		this.procurarElementoPeloXPath(xpath).click();
	}

}
