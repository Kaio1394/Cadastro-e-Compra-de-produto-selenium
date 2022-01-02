package br.com.kaio.pages;

import org.openqa.selenium.WebDriver;

public class CadastroPage extends PageObject{
	WebDriver driver;
	public static final String PRIMEIRO_NOME = "Fulano";
	public static final String ULTIMO_NOME = "Bartolomeu";
	public static final String EMAIL = "jasonwu223222@bedul.net";
	public static final String SENHA = "kaio1310";
	public static final String RUA = "Abington Lane";
	public static final String CIDADE = "Dearborn";
	public static final String POSTAL = "48124";
	public static final String TELEFONE = "42988652291";
	public static final String ENDERECO_ALTERNATIVO = "Appoline";
		
	public CadastroPage() {
		super(null);	
	}

	
	public void realizarCadastroDeusuario(){
		//Clicando no radio buttom
		this.clicarElementoPeloXPath("//*[@id=\"id_gender1\"]");
		
		//Preenchendo campos do formulário
		this.preencherCampoPorId("customer_firstname", PRIMEIRO_NOME);
		this.preencherCampoPorId("customer_lastname", ULTIMO_NOME);
		this.preencherCampoPorId("passwd", SENHA);
		this.preencherCampoPorId("address1", RUA);
		this.preencherCampoPorId("postcode", POSTAL);
		this.preencherCampoPorId("phone_mobile", PRIMEIRO_NOME);
		this.preencherCampoPorId("alias", ENDERECO_ALTERNATIVO);
		
		//Apagando campo do endereço alternativo
		this.limparCampoPorId("alias");
	
	}

}
