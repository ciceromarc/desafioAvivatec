#language: pt

@appMinhaConta
Funcionalidade: Validar Testes da opcao Minha Conta
  # Como analista de testes,
  # Desejo validar as opcoes de teste da funcionalidade "minha conta" no aplicativo

  Contexto:
    Dado que estou logado no app
    E clico na opcao minha conta

  @Mobile_App_MinhaConta_001
  Cenario: Realizar alteracao de nome e sobrenome de usuario
    Quando clicar na opcao meu cadastro
    E no campo nome realizar uma alteracao
    E no campo sobrenome realizar uma alteracao
    E clicar no botao salvar
    Entao a mensagem de alterado com sucesso deve ser exibida

  @Mobile_App_MinhaConta_002
  Cenario: Realizar alteracao de senha atual invalida
    Quando clicar na opcao alterar senha do aplicativo
    E informar no campo senha atual uma senha invalida
    E informar no campo nova senha uma nova senha valida
    E informar no campo confirmar nova senha a mesma senha informada no campo nova senha
    E clicar no botao alterar senha
    Entao a mensagem de senha atual errada deve ser exibida

  @Mobile_App_MinhaConta_003
  Cenario: Realizar alteracao de senha com nova senha e confirmacao diferentes
  	Quando clicar no botao alterar senha do aplicativo
    E informar no campo senha atual a senha atual
    E informar no campo nova senha uma nova senha
    E informar no campo confirmar nova senha uma senha diferente da informada no campo nova senha
    E clicar em alterar senha
    Entao a mensagem de senhas divergentes deve ser exibida

  @Mobile_App_MinhaConta_004
  Cenario: Alteracao de senha com sucesso
    Quando estiver na pagina Alterar senha do Aplicativo
    E informar no campo senha atual a senha atual valida
    E informar no campo de nova senha uma nova senha
    E informar no campo de confirmar nova senha a mesma senha informada no campo nova senha
    E clicar na opcao alterar senha
    Entao a mensagem de senha atualizada com sucesso deve ser exibida

  @Mobile_App_MinhaConta_005
  Cenario: Editar endereco a partir de Minha Conta
    Quando acessar meus enderecos
    E acessar o primeiro endereco listado
    E editar o numero do endereco para um diferente do cadastrado
    E clicar no botao para salvar
    Entao a mensagem de endereco atualizado com sucesso deve ser exibida

  @Mobile_App_MinhaConta_006
  Cenario: Validar campo obrigatorio
    Quando clicar em meu cadastro
    E deixar o campo telefone sem ser preenchido
    E clicar no botao para salvar a alteracao
    Entao nao e possivel realizar a alteracao

  @Mobile_App_MinhaConta_007
  Cenario: Excluir endereco
    Quando acessar a pagina de meus enderecos
    E excluir o endereco cadastrado
    Entao recebo a mensagem informando que nao tenho endereco cadastrado

  @Mobile_App_MinhaConta_008
  Cenario: Cadastrar novo endereco
    Quando acessar a pagina de meus enderecos
    E clicar no botao adicionar endereco
    E preencher o formulado de endereco
    E clicar em salvar
    Entao recebo a mensagem endereco adicionado com sucesso
