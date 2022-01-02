package br.com.kaio.cadastro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroUsuario {
	@Dado("que eu esteja na página de login")
	public void que_eu_esteja_na_página_de_login() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
	}
	@Quando("preencho o campo email com dado valido")
	public void preencho_o_campo_email_com_dado_valido() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Quando("clico em criar uma conta")
	public void clico_em_criar_uma_conta() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Quando("preencho todo o formulario de cadastro")
	public void preencho_todo_o_formulario_de_cadastro() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Então("o cadastro e realizado com sucesso")
	public void o_cadastro_e_realizado_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
