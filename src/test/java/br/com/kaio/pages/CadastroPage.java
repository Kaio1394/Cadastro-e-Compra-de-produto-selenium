package br.com.kaio.pages;

public class CadastroPage extends PageObject {
	public static final String PRIMEIRO_NOME = "Fulano";
	public static final String ULTIMO_NOME = "Bartolomeu";
	public static final String EMAIL = "jasonwu11ss222@bedul.net";
	public static final String SENHA = "kaio1310";
	public static final String RUA = "Abington Lane";
	public static final String CIDADE = "Dearborn";
	public static final String POSTAL = "48124";
	public static final String TELEFONE = "42988652291";
	public static final String ENDERECO_ALTERNATIVO = "Appoline";

	public CadastroPage() {
		super(null);
	}

	public void realizarCadastroDeUsuario() {
		// Clicando no radio buttom
		this.clicarElementoPeloXPath("//*[@id=\"id_gender1\"]");
		
		// Apagando campo do endereço alternativo
		this.limparCampoPorId("alias");

		// Preenchendo campos do formulário
		this.preencherCampoPorId("customer_firstname", PRIMEIRO_NOME);
		this.preencherCampoPorId("customer_lastname", ULTIMO_NOME);
		this.preencherCampoPorId("passwd", SENHA);
		this.preencherCampoPorId("address1", RUA);
		this.preencherCampoPorId("city", CIDADE);
		this.preencherCampoPorId("postcode", POSTAL);
		this.preencherCampoPorId("phone_mobile", TELEFONE);
		this.preencherCampoPorId("alias", ENDERECO_ALTERNATIVO);


		// Selencionar data de nascimento
		this.selecionarComboxDataDeAniversario();

		// Selecionar estado
		this.selecionarComboxEstado();

		// Clicar botão "Register"
		this.clicarElementoPeloId("submitAccount");

	}

	public void selecionarComboxDataDeAniversario() {
		this.selecionarCombomxPeloValor("days", "13");
		this.selecionarCombomxPeloValor("months", "10");
		this.selecionarCombomxPeloValor("years", "1994");
	}

	public void selecionarComboxEstado() {
		this.selecionarCombomxPeloValor("id_state", "22");
	}
}
