#language: pt

Funcionalidade: cadastrar usuario
	Eu como usuario
	Quero realizar cadastro 
	Para que eu possa realizar uma compra
	
@CadastroComSucesso
Cenario: realizar cadastro do usuario com sucesso
	Dado que eu esteja na página de login
	Quando preencho o campo email com dado valido
	E clico em criar uma conta
	E preencho todo o formulario de cadastro
	Então o cadastro e realizado com sucesso

@CadastroComEmailJaCadastrado
Cenario: realizar cadastro do usuario com email com formato invalido
	Dado que eu esteja na página de login para preencher o email
	Quando preencho o campo email já cadastrado e clico em criar uma nova conta
	Então eh esperado uma mensagem de erro

#@CadastroComCamposObrigatoriosEmBranco
#Cenario: realizar cadastro com campos obrigatorios em branco
#	Dado que eu esteja na página de login
#	Quando preencho o campo email com dado valido
#	E clico em criar uma conta
#	E tento cadastrar usuario com alguns dados obrigatorios em branco
#	Então eh lancado uma mensagem de erro com os campos obrigatorios que nao foram preenchidos
#
#@CadastroComDigitosCamposTelefoneInferioresPadrao
#Cenario: realizar cadastro do campo telefone com numero de digitos menor que o padrao
#	Dado que eu esteja na página de login
#	Quando preencho o campo email com dado valido
#	E clico em criar uma conta
#	E tento cadastrar usuario com quantidade de digitos do campo telefone inferior que o padrao
#	Então deveria ser lancado uma mensagem de erro do campo telefone por quantidade de digitos invalido