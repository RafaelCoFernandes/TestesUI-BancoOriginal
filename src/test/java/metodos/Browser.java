package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	WebDriver driver;

	public void abrirNavegador(String site) {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.err.println("--------------- Erro ao abrir o site--------------------" + e.getMessage());
			System.out.println("--------------- Causa do erro ---------------------" + e.getCause());
		}
	}

	public void clicar(By elementos) {
		
		driver.findElement(elementos).click();
		
	}
	
	public void escrever(By elementos, String texto) {
		
		driver.findElement(elementos).sendKeys(texto);
		
	}

}
