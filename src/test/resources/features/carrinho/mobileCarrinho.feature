#language: pt

@appCarrinhodoApp
Funcionalidade: Validar Testes da Carrinho do App
  # Como analista de testes,
  # Desejo validar as opcoes de teste da funcionalidade "Carrinho" no aplicativo

  Contexto:
    Dado que estou na pagina inical

  @Mobile_App_Carrinho_001
  Cenario: Ainda nao atingiu frete gratis, apenas produtos p1 na Carrinho
    Quando adiciono um produto p1 na carrinho
    E abro o carrinho
    Entao verifico a mensagem do valor que esta faltando para o frete gratis

  @Mobile_App_Carrinho_002
  Cenario: Ainda nao atingiu frete grátis, apenas produtos p3 na Carrinho
    Quando adiciono um produto p3 no carrinho
    E me direciono no carrinho
    Entao nao e retornada a mensagem do valor que esta faltando para o frete gratis

  @Mobile_App_Carrinho_003
  Cenario: Ainda nao atingiu frete grátis, produtos p1 e p3 na Carrinho
    Quando adiciono um produto p1 no carrinho
    E adiciono um p3 no carrinho
    E abro a opcao carrinho
    Entao visualizo a mensagem do valor que esta faltando para o frete gratis

  @Mobile_App_Carrinho_004
  Cenario: Atualizaçao de valores na Carrinho sem atingir frete grátis
    Quando adiciono um p1 no carrinho
    Quando aumento a quantidade do produto
    Entao verifico a mensagem do valor que falta para o frete gratis

  @Mobile_App_Carrinho_005
  Cenario: Valor para frete grátis atingido antes de abrir Carrinho
    Quando adiciono um produto p1 no carrinho
    E clico no carrinho
    Entao eu vejo mensagem de frete gratis atingido com sucesso

  @Mobile_App_Carrinho_006
  Cenario: Atualizaçao de valores no carrinho atingindo frete grátis
    Quando aumento quantidade do produto p1
    Entao visualizo a mensagem do valor que falta para o frete gratis

  @Mobile_App_Carrinho_007
  Cenario: Adicionar um produto no carrinho pelo App
    Dado que tenha buscado por um produto valido no App
    Quando acessar a PDP do primeiro produto listado
    E selecionar uma cor e tamanho validos
    E adicionar o produto no carrinho
    E clico no botao carrinho
    Entao devo visualizar o produto no carrinho no App

  @Mobile_App_Carrinho_008
  Cenario: Aumentar a quantidade de um produto na Carrinho pelo App
    Quando estiver na tela do carrinho do App com um produto valido
    E aumento a quantidade do produto selecionado
    Entao deve aumentar a quantidade do mesmo produto no carrinho

  @Mobile_App_Carrinho_009
  Cenario: Alterar tamanho de um produto na Carrinho
    Quando adiciono um produto valido no carrinho
    E me encaminho para carrinho
    E clico no botao tamanho
    E clico no botao do tamanho desejado
    E clico no botao alterar tamanho
    Entao deve atualizar o produto

  @Mobile_App_Carrinho_010
  Cenario:Aplicar Cupom na Carrinho
    Dado que esteja no carrinho do App com um produto valido
    Quando aplicar um cupom valido existente
    Entao  deve aplicar um desconto no carrinho

  @Mobile_App_Carrinho_011
  Cenario:Excluir Produto da Carrinho do App
    Quando adicionar a Carrinho um produto valido
    E entrar no carrinho
    E acionar o botao de remover produto
    E confirmar a exclusao escolhendo a opcao Quero Excluir
    Entao o produto sera removido do carrinho

  @Mobile_App_Carrinho_012
  Cenario:Calcular frete na Carrinho
    Quando acidionar produto valido no carrinho
    E me direcionar no carrinho
    E calcular o frete para o CEP
    Entao deve exibir o prazo de entrega e prazo de retirada em loja

  @Mobile_App_Carrinho_013
  Cenario:Adicionar produtos sugeridos na pagina da Carrinho
    Quando estiver na Carrinho
    E adicionar um dos produtos sugeridos
    E selecionar o tamanho do produto
    Entao o produto deve ser adicionado no carrinho

  @Mobile_App_Carrinho_014
  Cenario:Validar subtotal de itens na Carrinho
    Dado que esteja na tela do carrinho do App com um produto p3 valido
    Quando adicionar outro produto p3 valido
    Entao o subtotal e atualizado