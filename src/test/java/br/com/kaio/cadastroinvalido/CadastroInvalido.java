package br.com.kaio.cadastroinvalido;

import br.com.kaio.pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class CadastroInvalido {

	CadastroPage page;
	
	@Dado("que eu esteja na página de login para preencher o email")
	public void que_eu_esteja_na_página_de_login_para_preencher_o_email() {
		page = new CadastroPage();
	}
	@Quando("preencho o campo email já cadastrado e clico em criar uma nova conta")
	public void preencho_o_campo_email_já_cadastrado_e_clico_em_criar_uma_nova_conta() {
	    this.page.preencherCampoPorId("email_create", "TestandoFormatoInvalidoDeEmail");
	    this.page.clicarElementoPeloId("SubmitCreate");
	}
	@Então("eh esperado uma mensagem de erro")
	public void eh_esperado_uma_mensagem_de_erro() throws InterruptedException {
//		this.page.esperaExplicitaAteElementoSejaVisivelPeloXpath(
//				"\"//*[@id=\\\"create_account_error\\\"]/ol/li", "Invalid email address.");
//	    
		Thread.sleep(5000);
		String mensagemErro = 
	    		this.page.procurarElementoPeloXPath(
	    				"//*[@id=\"create_account_error\"]/ol/li").getText();
	    Assert.assertEquals(CadastroPage.MENSAGEM_ERRO, mensagemErro);
	    
	}

	@After
	public void after() {
		this.page.fecharJanela();
	}

}
