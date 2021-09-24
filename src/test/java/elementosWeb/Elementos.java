package elementosWeb;

import org.openqa.selenium.By;

public class Elementos {

	private By abrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
    private By abrirNConta = By.id("bt1");
	private By nome = By.id("nome");
	private By telefone = By.id("telefone");
	private By email = By.id("email");
	private By cpf = By.id("cpf");
	private By enviar = By.id("btnEnviar");
	
	public By getAbrirConta() {
		return abrirConta;
	}

	public By getAbrirNConta() {
		return abrirNConta;
	}

	public By getNome() {
		return nome;
	}

	public By getTelefone() {
		return telefone;
	}

	public By getEmail() {
		return email;
	}

	public By getCpf() {
		return cpf;
	}

	public By getEnviar() {
		return enviar;
	}
	
	
}
