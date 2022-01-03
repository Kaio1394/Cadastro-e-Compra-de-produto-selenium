package br.com.kaio.cadastro;

import br.com.kaio.pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class CadastroUsuario {
	CadastroPage page;

	@Dado("que eu esteja na página de login")
	public void que_eu_esteja_na_página_de_login() {
		page = new CadastroPage();
	}

	@Quando("preencho o campo email com dado valido")
	public void preencho_o_campo_email_com_dado_valido() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		this.page.preencherCampoPorId("email_create", CadastroPage.EMAIL);
	}

	@Quando("clico em criar uma conta")
	public void clico_em_criar_uma_conta(){
		this.page.clicarElementoPeloId("SubmitCreate");
	}

	@Quando("preencho todo o formulario de cadastro")
	public void preencho_todo_o_formulario_de_cadastro() {
		// Write code here that turns the phrase above into concrete actions
		this.page.realizarCadastroDeUsuario();
	}

	@Então("o cadastro e realizado com sucesso")
	public void o_cadastro_e_realizado_com_sucesso() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(CadastroPage.PRIMEIRO_NOME + " " + CadastroPage.ULTIMO_NOME, 
				this.page.procurarElementoPeloXPath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span").getText());
	}

	@After
	public void after() {
		page.fecharJanela();
	}
}
