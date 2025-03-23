#language: pt

@appLoginAppExterno
Funcionalidade: Realizar login por aplicativo externo
  # Como analista de testes,
  # Desejo verificar as possibilidades de login (por um aplicativo externo),
  # Para realizar o acesso ao sistema corretamente;

  Contexto:
    Dado que esteja deslogado no sistema
    E que estou realizando uma compra
    E tento finalizar a compra
    E sou encaminhado a pagina de login

  @Mobile_App_Login_007
  Cenario: Acessar o login com Facebook a partir do Checkout
    Quando clicar no icone do Facebook
    Entao deve abrir uma nova tela com um painel para logar usando uma conta do Facebook

  @Mobile_App_Login_008
  Cenario: Acessar o login com Google a partir do Checkout
    Quando clicar no icone do Google
    Entao deve abrir uma nova tela com um painel para logar usando uma conta do Google

  