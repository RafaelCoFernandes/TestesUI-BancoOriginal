package steps;

import elementosWeb.Elementos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;

public class EnviarFormularioCadastroTeste {

	Browser browser = new Browser();
	Elementos ele = new Elementos();
	
	
	@Given("que acesso o site {string}")
	public void que_acesso_o_site(String site) {
	    
		browser.abrirNavegador(site);
		
	}

	@And("acessar o formulario de abertura de conta")
	public void acessar_o_formulario_de_abertura_de_conta() {
	    
		browser.clicar(ele.getAbrirConta());
		browser.clicar(ele.getAbrirNConta());
		
	}

	@And("preencher o campo nome {string}")
	public void preencher_o_campo_nome(String texto) {
	    
		browser.escrever(ele.getNome(), texto);
		
	}

	@And("preencher o campo celular {string}")
	public void preencher_o_campo_celular(String texto) {
	    
		browser.escrever(ele.getTelefone(), texto);
		
	}

	@And("preencher o campo email {string}")
	public void preencher_o_campo_email(String texto) {
	   
		browser.escrever(ele.getEmail(), texto);
	}

	@And("preencher o campo CPF {string}")
	public void preencher_o_campo_CPF(String texto) {
	    browser.escrever(ele.getCpf(), texto);
		
	}

	@When("clicar no botao avancar")
	public void clicar_no_botao_avancar() {
	   
		browser.clicar(ele.getEnviar());
		
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
		
		
	}

	
	
	
}
