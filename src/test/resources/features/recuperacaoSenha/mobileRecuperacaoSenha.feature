#language: pt

@appRecuperacaoSenha
Funcionalidade: Validar Recuperacao de Senha
  # Como analista de testes,
  # Desejo validar as opcoes de teste da funcionalidade "recuperar senha" no aplicativo

  Contexto:
    Dado que estou na pagina inicio do APP
    E clico na opcao de Menu
    E sou direcionado a pagina de login

  @Mobile_App_RecuperacaoSenha_001
  Cenario: Realizar validacao de senha com CPF cadastrado
    Quando clico na opcao esqueci minha senha
    E informar no campo de CPF um CPF ja cadastrado
    E clicar no botao esqueci minha senha
    Entao deve abrir uma nova janela confirmando o envio de email para redefinicao de senha

  @Mobile_App_RecuperacaoSenha_002
  Cenario: Realizar validacao de senha com CPF invalido
    Quando clicar na opcao de esqueci minha senha
    E informar no campo de CPF um CPF invalido
    E clicar no botao de esqueci minha senha
    Entao a mensagem campo invalido deve ser exibida

  @Mobile_App_RecuperacaoSenha_003
  Cenario: Realizar validacao de senha com CPF nao cadastrado
    Quando clicar em esqueci minha senha
    E informar no campo de CPF um CPF nao cadastrado
    E clicar no botao de confirmacao esqueci minha senha
    Entao a mensagem de CPF nao encontrado deve ser exibida

  @Mobile_App_RecuperacaoSenha_004
  Cenario: Realizar recuperacao de senha com email cadastrado
    Quando informar no campo de usuario um email valido
    E clicar na opcao de esqueci a minha senha
    E preencher o CPF cadastrado na mesma conta do email informado
    E clico no botao de confirmacao esqueci minha senha
    Entao deve abrir uma nova janela confirmando o envio de email para redefinicao de senha por email


