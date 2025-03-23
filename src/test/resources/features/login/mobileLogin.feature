#language: pt

@appLogin
Funcionalidade: Realizar login pela home
  # Como analista de testes,
  # Desejo verificar as possibilidades de login,
  # Para realizar o acesso ao sistema corretamente;

  Contexto:
    Dado que estou na pagina de inicio do APP
    E clico no icone Menu
    E clico na opcao faca login

  @Mobile_App_Login_001
  Cenario: Fazer login com usuario valido
    Quando informar o usuario valido no campo de usuario
    E informar a senha valida no campo de senha
    E clico no campo entrar
    Entao o login deve ser efetuado com sucesso

  @Mobile_App_Login_002
  Cenario: Fazer login com senha invalida
    Quando informar um usuario valido no campo de usuario
    E informar uma senha invalida no campo de senha
    E clico no botao entrar
    Entao o login nao sera realizado

  @Mobile_App_Login_003
  Cenario: Fazer login usuario invalido
    Quando informar o usuario invalido no campo de usuario
    E informar a senha invalida no campo de senha
    E clico no no campo entrar
    Entao ao validar o campo user o login nao e realizado

  @Mobile_App_Login_004
  Cenario: Fazer login com campos vazios
    Quando nao preencher o campo de usuario
    E nao preencher o campo de senha
    Entao recebo a mensagem informando que os campos estao invalidos

  @Mobile_App_Login_005
  Cenario: Fazer login com a conta do Google pela Home
    Quando seleciono o icone do aplicativo Google
    Entao sou direcionado a pagina de login pelo Google

  @Mobile_App_Login_006
  Cenario: Fazer login com a conta do Facebook pela Home
    Quando seleciono o icone do aplicativo Facebook
    Entao sou direcionado a pagina de login pelo Facebook
  	
  