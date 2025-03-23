package br.com.steps.Carrinho;

import br.com.interactions.carrinho.MobilecarrinhoInteraction;
import br.com.robots.AppiumRobotsTool;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class MobileCarrinhoSteps {
    MobilecarrinhoInteraction mobilecarrinho = new MobilecarrinhoInteraction();

    AppiumRobotsTool appDriver = mobilecarrinho.startAutomationScenario();

    public MobileCarrinhoSteps() throws IOException, ParseException {
    }

    /*
    Contexto do cenario de recuperação de senha
    Contendo passos comuns a todos os fluxos
    */
    @Dado("que estou na pagina inical")
    public void que_estou_na_pagina_inical() {

    }

    /*
    @Mobile_App_carrinho_001
    Cenario: Ainda nao atingiu frete gratis, apenas produtos p1 na carrinho
    */
    @Quando("adiciono um produto p1 na carrinho")
    public void adiciono_um_produto_p1_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @E("abro o carrinho")
    public void abro_o_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @Entao("verifico a mensagem do valor que esta faltando para o frete gratis")
    public void verifico_a_mensagem_do_valor_que_esta_faltando_para_o_frete_gratis() throws Exception {
        mobilecarrinho.validacaoFreteGratis(appDriver);
    }

    /*
    @Mobile_App_carrinho_002
    Cenario: Ainda nao atingiu frete grátis, apenas produtos p3 na carrinho
    */
    @Quando("adiciono um produto p3 no carrinho")
    public void adiciono_um_produto_p3_no_carrinho() throws Exception {
        mobilecarrinho.adicionarP3Acarrinho(appDriver);
    }

    @E("me direciono no carrinho")
    public void me_direciono_no_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @Entao("nao e retornada a mensagem do valor que esta faltando para o frete gratis")
    public void nao_e_retornada_a_mensagem_do_valor_que_esta_faltando_para_o_frete_gratis() throws Exception {
        mobilecarrinho.valicadaoFreteGratisNegadoP3(appDriver);
    }

    /*
    @Mobile_App_carrinho_003
    Cenario: Ainda nao atingiu frete grátis, produtos p1 e p3 na carrinho
    */
    @Quando("adiciono um produto p1 no carrinho")
    public void adiciono_um_produto_p1_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @E("adiciono um p3 no carrinho")
    public void adiciono_um_p3_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProduto3Acarrinho(appDriver);
    }

    @E("abro a opcao carrinho")
    public void abro_a_opcao_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @Entao("visualizo a mensagem do valor que esta faltando para o frete gratis")
    public void visualizo_a_mensagem_do_valor_que_esta_faltando_para_o_frete_gratis() throws Exception {
        mobilecarrinho.validacaoFreteGratis(appDriver);
    }

    /*
    @Mobile_App_carrinho_004
    Cenario: Atualizaçao de valores na carrinho sem atingir frete grátis
    */
    @Quando("adiciono um p1 no carrinho")
    public void adiciono_um_p1_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoBaixoCusto(appDriver);
    }

    @Quando("aumento a quantidade do produto")
    public void aumento_a_quantidade_do_produto() throws Exception {
        mobilecarrinho.aumentarQuantidadeDoProduto(appDriver);
    }

    @Entao("verifico a mensagem do valor que falta para o frete gratis")
    public void verifico_a_mensagem_do_valor_que_falta_para_o_frete_gratis() throws Exception {
        mobilecarrinho.validacaoFreteGratis(appDriver);
    }

    /*
    @Mobile_App_carrinho_005
    Cenario: Valor para frete grátis atingido antes de abrir carrinho
    */
    @Quando("adiciono um produto p1 nesta carrinho")
    public void adiciono_um_produto_p1_nesta_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @E("clico no carrinho")
    public void clico_no_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @Entao("eu vejo mensagem de frete gratis atingido com sucesso")
    public void eu_vejo_mensagem_de_frete_gratis_atingido_com_sucesso() throws Exception {
        mobilecarrinho.validacaoFreteGratis(appDriver);
    }

    //006 com bug
    /*
    @Mobile_App_carrinho_006
    Cenario: Atualizaçao de valores na carrinho atingindo frete grátis
    */
    @Quando("aumento quantidade do produto p1")
    public void aumento_quantidade_do_produto_p1() throws Exception {
        mobilecarrinho.aumentarQuantidadeDoProduto(appDriver);
    }

    @Entao("visualizo a mensagem do valor que falta para o frete gratis")
    public void visualizo_a_mensagem_do_valor_que_falta_para_o_frete_gratis() throws Exception {
        mobilecarrinho.mensagemFreteGratis(appDriver);
    }

    /*
    @Mobile_App_carrinho_007
    Cenario: Adicionar um produto no carrinho pelo App 
    */
    @Dado("que tenha buscado por um produto valido no App")
    public void que_tenha_buscado_por_um_produto_valido_no_app() throws Exception {
        mobilecarrinho.buscarProdutoValido(appDriver);
    }

    @Quando("acessar a PDP do primeiro produto listado")
    public void acessar_a_pdp_do_primeiro_produto_listado() throws Exception {
        mobilecarrinho.acessarProdutoValido(appDriver);
    }

    @E("selecionar uma cor e tamanho validos")
    public void selecionar_uma_cor_e_tamanho_validos() throws Exception {
        mobilecarrinho.selecionarTamanho(appDriver);
    }

    @E("adicionar o produto no carrinho")
    public void adicionar_o_produto_no_carrinho() throws Exception {
        mobilecarrinho.adicionarcarrinho(appDriver);
    }

    @E("clico no botao carrinho")
    public void clico_no_botao_carrinho() throws Exception {
        mobilecarrinho.acessarcarrinho(appDriver);
    }

    @Entao("devo visualizar o produto no carrinho no App")
    public void devo_visualizar_o_produto_no_carrinho_no_app() throws Exception {
        mobilecarrinho.validacaoProdutoNacarrinho(appDriver);
    }

    /*
    @Mobile_App_carrinho_008
    Cenario: Aumentar a quantidade de um produto na carrinho pelo App 
    */
    @Quando("estiver na tela do carrinho do App com um produto valido")
    public void estiver_na_tela_do_carrinho_do_app_com_um_produto_valido() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @Quando("aumento a quantidade do produto selecionado")
    public void aumento_a_quantidade_do_produto_selecionado() throws Exception {
        mobilecarrinho.aumentarQuantidadeDoProduto(appDriver);
    }

    @Entao("deve aumentar a quantidade do mesmo produto no carrinho")
    public void deve_aumentar_a_quantidade_do_mesmo_produto_no_carrinho() throws Exception {
        mobilecarrinho.validacaoQuantidadeAumentada(appDriver);
    }

    /*
    @Mobile_App_carrinho_009
    Cenario: Alterar tamanho de um produto na carrinho
    */
    @Quando("adiciono um produto valido no carrinho")
    public void adiciono_um_produto_valido_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }
    @E("me encaminho para carrinho")
    public void me_encaminho_para_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }
    @E("clico no botao tamanho")
    public void clico_no_botao_tamanho() throws Exception {
        mobilecarrinho.editarTamanhoProduto(appDriver);
    }

    @E("clico no botao do tamanho desejado")
    public void clico_no_botao_do_tamanho_desejado() throws Exception {
        mobilecarrinho.editarTamanho(appDriver);
    }

    @E("clico no botao alterar tamanho")
    public void clico_no_botao_alterar_tamanho() throws Exception {
        mobilecarrinho.confirmarTamanho(appDriver);
    }

    @Entao("deve atualizar o produto")
    public void deve_atualizar_o_produto() throws Exception {
        mobilecarrinho.validacaoProdutoNacarrinho(appDriver);
    }

    /*
    @Mobile_App_carrinho_010
    Cenario:Aplicar Cupom na carrinho
    */
    @Dado("que esteja no carrinho do App com um produto valido")
    public void que_esteja_na_carrinho_do_app_com_um_produto_valido() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @Quando("aplicar um cupom valido existente")
    public void aplicar_um_cupom_valido_existente() {
    }

    @Entao("deve aplicar um desconto no carrinho")
    public void deve_aplicar_um_desconto_no_carrinho() {
    }

    /*
    @Mobile_App_carrinho_011
    Cenario:Excluir Produto da carrinho do App 
    */
    @Quando("adicionar no carrinho um produto valido")
    public void adicionar_no_carrinho_um_produto_valido() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @E("entrar no carrinho")
    public void entrar_no_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @E("acionar o botao de remover produto")
    public void acionar_o_botao_de_remover_produto() throws Exception {
        mobilecarrinho.removeProduto(appDriver);
    }

    @E("confirmar a exclusao escolhendo a opcao Quero Excluir")
    public void confirmar_a_exclusao_escolhendo_a_opcao_quero_excluir() throws Exception {
        mobilecarrinho.confirmaRemoveProduto(appDriver);
    }

    @Entao("o produto sera removido do carrinho")
    public void o_produto_sera_removido_do_carrinho() throws Exception {
        mobilecarrinho.valicadaoProdutoExcluido(appDriver);
    }

    /*
    @Mobile_App_carrinho_012
    Cenario:Calcular frete na carrinho
    */

    @Quando("acidionar produto valido no carrinho")
    public void acidionar_produto_valido_no_carrinho() throws Exception {
        mobilecarrinho.adicionarProdutoAcarrinhoPorStorie(appDriver);
    }

    @E("me direcionar no carrinho")
    public void me_direcionar_no_carrinho() throws Exception {
        mobilecarrinho.abrircarrinho(appDriver);
    }

    @E("calcular o frete para o CEP")
    public void calcular_o_frete_para_o_cep() throws Exception {
        mobilecarrinho.calcularFrete(appDriver);
    }

    @Entao("deve exibir o prazo de entrega e prazo de retirada em loja")
    public void deve_exibir_o_prazo_de_entrega_e_prazo_de_retirada_em_loja() throws Exception {
        mobilecarrinho.validacaoPrazoDoFrete(appDriver);
    }


    /*
    @Mobile_App_carrinho_013
    Cenario:Adicionar produtos sugeridos na pagina da carrinho
    */
    @Quando("estiver no carrinho")
    public void adicionar_no_carrinho_um_produto_valido() throws Exception {
        mobilecarrinho.diretoAcarrinho(appDriver);
    }

    @E("adicionar um dos produtos sugeridos")
    public void adicionar_um_dos_produtos_sugeridos() throws Exception {
        mobilecarrinho.adicionarSugerido(appDriver);
    }

    @E("selecionar o tamanho do produto")
    public void selecionar_o_tamanho_do_produto() throws Exception {
        mobilecarrinho.tamanhoSugerido(appDriver);
    }

    @Entao("o produto deve ser adicionado no carrinho")
    public void o_produto_deve_ser_adicionado_no_carrinho() throws Exception {
        mobilecarrinho.validacaoProdutoNacarrinho(appDriver);
    }

    /*
    @Mobile_App_carrinho_014
    Cenario:Validar subtotal de itens na carrinho
    */
    @Dado("que esteja na tela do carrinho do App com um produto p3 valido")
    public void que_esteja_na_tela_do_carrinho_do_app_com_um_produto_p3_valido() throws Exception {
        mobilecarrinho.adicionarP3EIrAcarrinho(appDriver);
    }

    @Quando("adicionar outro produto p3 valido")
    public void adicionar_outro_produto_p3_valido() throws Exception {
        mobilecarrinho.adicionarMaisUmP3Acarrinho(appDriver);
    }

    @Entao("o subtotal e atualizado")
    public void o_subtotal_e_atualizado() throws Exception {
        mobilecarrinho.validacaoPrecoTotalCompraDeDoisP3(appDriver);
    }
}
