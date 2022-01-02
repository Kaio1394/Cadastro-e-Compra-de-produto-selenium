package br.com.kaio.cadastro;


import br.com.kaio.pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroUsuario {
	CadastroPage page;

	
	@Dado("que eu esteja na página de login")
	public void que_eu_esteja_na_página_de_login(){
		page = new CadastroPage();
	}
	@Quando("preencho o campo email com dado valido")
	public void preencho_o_campo_email_com_dado_valido() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    this.page.preencherCampoPorId("email_create", "kaio@hotmail.com");
	}
	@Quando("clico em criar uma conta")
	public void clico_em_criar_uma_conta() throws InterruptedException {
		this.page.clicarElementoPeloId("SubmitCreate");
		Thread.sleep(5000);
	}
	@Quando("preencho todo o formulario de cadastro")
	public void preencho_todo_o_formulario_de_cadastro() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		this.page.realizarCadastroDeusuario();
		Thread.sleep(5000);
	}
	@Então("o cadastro e realizado com sucesso")
	public void o_cadastro_e_realizado_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@After
	public void afterEach() {
		page.fecharJanela();
	}
}
