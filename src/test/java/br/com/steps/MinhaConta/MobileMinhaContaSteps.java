package br.com.steps.MinhaConta;

import br.com.interactions.MinhaConta.MobileMinhaContaInteraction;
import br.com.robots.AppiumRobotsTool;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MobileMinhaContaSteps {

    MobileMinhaContaInteraction mobileMinhaConta = new MobileMinhaContaInteraction();
    AppiumRobotsTool appDriver = mobileMinhaConta.startAutomationScenario();
    public MobileMinhaContaSteps() throws IOException, ParseException {
    }

    /*
    Contexto do cenario de minha conta
    Contendo passos comuns a todos os fluxos
    */
    @Dado("que estou logado no app ")
    public void context_given_one() throws Exception {
        mobileMinhaConta.realizarLogin(appDriver);
    }

    @E("clico na opcao minha conta")
    public void context_and_two() throws Exception {
        mobileMinhaConta.minhaConta(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_001
    Cenario: Realizar alteracao de nome e sobrenome de usuario
    */
    @Quando("clicar na opcao meu cadastro")
    public void scenario_when_one() throws Exception {
        mobileMinhaConta.meuCadastro(appDriver);
    }

    @E("no campo nome realizar uma alteracao")
    public void scenario_and_one() throws Exception {
        mobileMinhaConta.alterarNome(appDriver);
    }

    @E("no campo sobrenome realizar uma alteracao")
    public void scenario_and_two() throws Exception {
        mobileMinhaConta.alterarSobrenome(appDriver);
    }

    @E("clicar no botao salvar")
    public void scenario_and_three() throws Exception {
        mobileMinhaConta.salvarDados(appDriver);
    }

    @Entao("a mensagem de alterado com sucesso deve ser exibida")
    public void scenario_then_one() throws Exception {
        mobileMinhaConta.validacaoMensagemDadosAlterados(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_002
    Cenario: Realizar alteracao de senha atual invalida
    */
    @Quando("clicar na opcao alterar senha do aplicativo")
    public void scenario_when_two() throws Exception {
        mobileMinhaConta.alterarSenhaAplicativo(appDriver);
    }

    @E("informar no campo senha atual uma senha invalida")
    public void scenario_and_fou() throws Exception {
        mobileMinhaConta.senhaAtual(appDriver);
    }

    @E("informar no campo nova senha uma nova senha valida")
    public void scenario_and_five() throws Exception {
        mobileMinhaConta.novaSenha(appDriver);
    }

    @E("informar no campo confirmar nova senha a mesma senha informada no campo nova senha")
    public void scenario_and_six() throws Exception {
        mobileMinhaConta.confirmacaoNovaSenha(appDriver);
    }

    @E("clicar no botao alterar senha")
    public void scenario_and_seven() throws Exception {
        mobileMinhaConta.confirmarAlteracaoSenha(appDriver);
    }

    @Entao("a mensagem de senha atual errada deve ser exibida")
    public void scenario_then_two() throws Exception {
        mobileMinhaConta.validacaoMensagemSenhaNaoAlterada(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_003
    Cenario: Realizar alteracao de senha com nova senha e confirmacao diferentes
    */
    @Quando("clicar no botao alterar senha do aplicativo")
    public void scenario_when_three() throws Exception {
        mobileMinhaConta.alterarSenhaAplicativo(appDriver);
    }

    @E("informar no campo senha atual a senha atual")
    public void scenario_and_eight() throws Exception {
        mobileMinhaConta.senhaAtual(appDriver);
    }

    @E("informar no campo nova senha uma nova senha")
    public void scenario_and_nine() throws Exception {
        mobileMinhaConta.novaSenha(appDriver);
    }

    @E("informar no campo confirmar nova senha uma senha diferente da informada no campo nova senha")
    public void scenario_and_ten() throws Exception {
        mobileMinhaConta.confirmacaoNovaSenha(appDriver);
    }

    @E("clicar em alterar senha")
    public void scenario_and_eleven() throws Exception {
        mobileMinhaConta.confirmarAlteracaoSenha(appDriver);
    }

    @Entao("a mensagem de senhas divergentes deve ser exibida")
    public void scenario_then_three() throws Exception {
        mobileMinhaConta.validacaoMensagemSenhaNaoNaoIguais(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_004
    Cenario: Alterar senha com sucesso
    */
    @Quando("estiver na pagina Alterar senha do Aplicativo")
    public void estiver_na_pagina_alterar_senha_do_aplicativo() throws Exception {
        mobileMinhaConta.alterarSenhaAplicativo(appDriver);
    }

    @E("informar no campo senha atual a senha atual valida")
    public void informar_no_campo_senha_atual_a_senha_atual_valida() throws Exception {
        mobileMinhaConta.senhaAtual(appDriver);
    }

    @E("informar no campo de nova senha uma nova senha")
    public void informar_no_campo_de_nova_senha_uma_nova_senha() throws Exception {
        mobileMinhaConta.novaSenha(appDriver);
    }

    @E("informar no campo de confirmar nova senha a mesma senha informada no campo nova senha")
    public void informar_no_campo_de_confirmar_nova_senha_a_mesma_senha_informada_no_campo_nova_senha() throws Exception {
        mobileMinhaConta.confirmacaoNovaSenha(appDriver);
    }

    @E("clicar na opcao alterar senha")
    public void clicar_na_opcao_alterar_senha() throws Exception {
        mobileMinhaConta.confirmarAlteracaoSenha(appDriver);
    }

    @Entao("a mensagem de senha atualizada com sucesso deve ser exibida")
    public void a_mensagem_de_senha_atualizada_com_sucesso_deve_ser_exibida() throws Exception {
        mobileMinhaConta.validacaoSenhaAtualizadaComSucesso(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_005
    Cenario: Editar endereço a partir de Minha Conta
    */
    @Quando("acessar meus enderecos")
    public void acessar_meus_enderecos() throws Exception {
        mobileMinhaConta.meusEnderecos(appDriver);
    }

    @E("acessar o primeiro endereco listado")
    public void acessar_o_primeiro_endereco_listado() throws Exception {
        mobileMinhaConta.acessarEndereco(appDriver);
    }

    @E("editar o numero do endereco para um diferente do cadastrado")
    public void editar_o_numero_do_endereco_para_um_diferente_do_cadastrado() throws Exception {
        mobileMinhaConta.editarNumeroDoEndereco(appDriver);
    }

    @E("clicar no botao para salvar")
    public void clicar_no_botao_para_salvar() throws Exception {
        mobileMinhaConta.salvarAletracao(appDriver);
    }

    @Entao("a mensagem de endereco atualizado com sucesso deve ser exibida")
    public void a_mensagem_de_endereco_atualizado_com_sucesso_deve_ser_exibida() throws Exception {
        mobileMinhaConta.validacaoEnderecoAlteradoComSucesso(appDriver);
    }

    /*
    @Mobile_App_MinhaConta_007
    Cenario: Excluir endereco
    */
    @Quando("acessar a pagina de meus enderecos")
    public void acessar_a_pagina_de_meus_enderecos() throws Exception {
        mobileMinhaConta.meusEnderecos(appDriver);
    }

    @E("excluir o endereco cadastrado")
    public void excluir_o_endereco_cadastrado() throws Exception {
        mobileMinhaConta.excluirEndereco(appDriver);
    }

    @Entao("recebo a mensagem informando que nao tenho endereco cadastrado")
    public void recebo_a_mensagem_informando_que_nao_tenho_endereco_cadastrado() throws Exception {
        mobileMinhaConta.validacaoEnderecoExcluido(appDriver);
    }

    /*
    @Mobile_App_MinhaConta_008
    Cenario: Cadastrar novo endereco
    */
    @Quando("clicar no botao adicionar endereco")
    public void clicar_no_botao_adicionar_endereco() throws Exception {
        mobileMinhaConta.adicionarEndereco(appDriver);
    }

    @E("preencher o formulado de endereco")
    public void preencher_o_formulado_de_endereco() throws Exception {
        mobileMinhaConta.preencherFormularioNovoEndereco(appDriver);
    }

    @E("clicar em salvar")
    public void clicar_em_salvar() throws Exception {
        mobileMinhaConta.salvarAletracao(appDriver);
    }

    @Entao("recebo a mensagem endereco adicionado com sucesso")
    public void recebo_a_mensagem_endereco_adicionado_com_sucesso() throws Exception {
        mobileMinhaConta.validacaoEnderecoAdicionado(appDriver);
    }

    /*
    @Mobile_App_Minha_Conta_006
    Cenario: Valdiar campo obrigatorio
    */
    @Quando("clicar em meu cadastro")
    public void clicar_em_meu_cadastro() throws Exception {
        mobileMinhaConta.meuCadastro(appDriver);
    }

    @E("deixar o campo telefone sem ser preenchido")
    public void deixar_o_campo_telefone_sem_ser_preenchido() throws Exception {
        mobileMinhaConta.apagarTelefone(appDriver);
    }

    @E("clicar no botao para salvar a alteracao")
    public void clicar_no_botao_para_salvar_a_alteracao() throws Exception {
        mobileMinhaConta.salvarAletracao(appDriver);
    }

    @Entao("nao e possivel realizar a alteracao")
    public void nao_e_possivel_realizar_a_alteracao() throws Exception {

    }

    /*
    @Mobile_App_MinhaConta_009
    Cenario: Validar que opcao Minha Conta direciona a pagina de login
    */
    @Dado("que eu esteja na pagina inicial do app ")
    public void que_eu_esteja_na_pagina_inicial_do_app() throws Exception {

    }
    @Quando("clicar no menu")
    public void clicar_no_menu() throws Exception {
        mobileMinhaConta.clicarMenu(appDriver);
    }
    @E("eu clicar em Minha Conta")
    public void eu_clicar_em_Minha_Conta() throws Exception {
        mobileMinhaConta.minhaConta(appDriver);
    }

    @Entao("devo ser direcionado para a pagina de login")
    public void  Entao_devo_ser_direcionado_para_a_pagina_de_login() throws Exception {
        mobileMinhaConta.validacaoTelaDeLogin(appDriver);
    }
}
