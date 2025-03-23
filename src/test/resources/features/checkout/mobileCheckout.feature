#language: pt
@checkout
Funcionalidade:Validar comprar por checkout

  Contexto:
    Dado que estou logado em minha conta no App
    E adiciono algum produto a sacola
    E me dirigo a sacola
    Quando clicar em finalizar compra
    E seleciono o endereco para entrega
    E seleciono o metodo de entrega
    E me direciono para o pagamento

  @Mobile_App_Checkout_001
  Cenario:Venda com forma de pagamento via Pix
    E seleciono a opcao pix
    E confirmo o pagamento com pix
    Entao visualizo a mensagem de pedido realizado com sucesso via pix

  @Mobile_App_Checkout_002
  Cenario:Venda com forma de pagamento via cartao de debito
    E seleciono a opcao cartao de debito
    E confirmo o pagamento com cartao de debito
    Entao visualizo a mensagem de pedido realizado com sucesso com cartao de debito

  @Mobile_App_Checkout_003
  Cenario:Venda com forma de pagamento via Boleto
    E seleciono a opcao boleto
    E confirmo o pagamento com boleto
    Entao visualizo a mensagem de pedido realizado com sucesso com boleto

  @Mobile_App_Checkout_004
  Cenario:Venda com forma de pagamento via Cartao de Credito
    E seleciono a opcao cartao de credito
    E confirmo o pagamento com cartao de credito
    Entao visualizo a mensagem de pedido realizado com sucesso com cartao de credito

  @Mobile_App_Checkout_005
  Cenario:Venda com forma de pagamento via Cartao
    E seleciono a opcao cartao
    E confirmo o pagamento com cartao
    Entao visualizo a mensagem de pedido realizado com sucesso com cartao

  @Mobile_App_Checkout_006
  Cenario:Venda com forma de pagamento via Meu Cartao
    E seleciono a opcao meu cartao
    E confirmo o pagamento com meu cartao
    Entao visualizo a mensagem de pedido realizado com sucesso com meu cartao

  @Mobile_App_Checkout_007
  Cenario:Venda com forma de pagamento via cartao presente
    E seleciono a opcao cartao presente
    E confirmo o pagamento com cartao presente
    Entao visualizo a mensagem de pedido realizado com sucesso com cartao presente

  @Mobile_App_Checkout_008
  Cenario:Venda com forma de pagamento via Cartao de Credito com apenas um Click
    E seleciono a opcao cartao credito
    E realizo o preenchimento da informacao do cartao de credito
    E ativo a compra com um click
    E confirmo pagamento com cartao de credito
    Entao visualizo mensagem de pedido realizado com sucesso com cartao de credito

  @Mobile_App_Checkout_009
  Cenario:Venda com forma de pagamento via Cartao  com apenas um Click
    E seleciono opcao cartao
    E realizo preenchimento das informacoes do cartao
    E ativo compra com um click
    E confirmo pagamento com cartao
    Entao visualizo mensagem de pedido realizado com sucesso com cartao

  @Mobile_App_Checkout_010
  Cenario:Venda com forma de pagamento via Meu Cartao com apenas um Click
    E seleciono opcao meu cartao
    E realizo o preenchimento das informacoes do Meu Cartao
    E ativo Compra com um Click
    E confirmo pagamento com meu cartao
    Entao visualizo mensagem de pedido realizado com sucesso com meu cartao

  @Mobile_App_Checkout_011
  Cenario:Venda com forma de pagamento via Cupom
    E seleciono a opcao cupom
    E confirmo o pagamento com cupom
    Entao visualizo a mensagem de pedido realizado com sucesso com cupom
