package br.com.pages.Checkout;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.bs.A;

public class MobileCheckoutPage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Menu\"]")
    public MobileElement BtnMenu;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Início\"]")
    public MobileElement BtnInicio;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Insira o seu CPF ou e-mail\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Insira seu CPF ou e-mail\"]")
    public MobileElement TxtEmailUsuario;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Digite sua senha']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Digite sua senha\"]")
    public MobileElement TxtSenhaUsuario;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Faça login ou cadastre-se\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Faça login ou cadastre-se\"]")
    public MobileElement BtnPagLogin;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Entrar']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Entrar\"]")
    public MobileElement BtnSubmit;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    @iOSXCUITFindBy()
    public MobileElement BtnTamanhoCamisaPP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    @iOSXCUITFindBy()
    public MobileElement BtnTamanhoCamisaP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    @iOSXCUITFindBy()
    public MobileElement BtnTamanhoCamisaM;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    @iOSXCUITFindBy()
    public MobileElement BtnTamanhoCamisaG;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    @iOSXCUITFindBy()
    public MobileElement BtnTamanhoCamisaGG;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADICIONAR À SACOLA\"]")
    @iOSXCUITFindBy()
    public MobileElement BtnOpcoesProduto;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADICIONAR À SACOLA\"]")
    public MobileElement BtnAdicionarProdutoSacola;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Seu Carrinho\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic cart\"]")
    public MobileElement BtnAcessarSacola;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Masculino\"]")
    public MobileElement BtnStorieMasculino;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[1]")
    public MobileElement BtnPrimeiroStorie;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[2]")
    public MobileElement BtnSegundoStorie;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[3]")
    public MobileElement BtnTerceiroStorie;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement BtnProdutoPorStorie;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Finalizar compra\"]")
    public MobileElement BtnFinalizarCompra;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Ícone da loja\"]")
    public MobileElement BtnEscolherEndereco;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement TxtModoDeEntrega1;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement TxtModoDeEntrega2;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement TxtModoDeEntrega3;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RadioButton")
    public MobileElement BtnModoDeEntrega1;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.view.ViewGroup/android.widget.RadioButton")
    public MobileElement BtnModoDeEntrega2;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.view.ViewGroup/android.widget.RadioButton")
    public MobileElement BtnModoDeEntrega3;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"IR PARA PAGAMENTO\"]")
    public MobileElement BtnIrParaPagamento;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[5]")
    public MobileElement BtnUltimoStorieDaPagina;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Ícone do método de pagamento\"])[1]")
    public MobileElement BtnPrimeiraOpcaoDePagamento;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Ícone do método de pagamento\"])[3]")
    public MobileElement BtnUltimaOpcaoDePagamento;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Ícone do método de pagamento\"])[4]")
    public MobileElement BtnUltimaOpcaoDePagamentoBoleto;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PIX com 3% de desconto (exceto lojas parceiras)\"]")
    public MobileElement BtnPagarComPix;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cartão virtual de débito Caixa']")
    public MobileElement BtnPagarComCartaoDebito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cartão de Crédito']")
    public MobileElement BtnPagarComCartaoCredito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cartão ']")
    public MobileElement BtnPagarComCartao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meu Cartão']")
    public MobileElement BtnPagarComMeuCartao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cartão Presente']")
    public MobileElement BtnPagarComCartaoPresente;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Boleto Bancário']")
    public MobileElement BtnPagarComBoleto;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Paguei com Pix\"]")
    public MobileElement BtnConfirmarPagamentoComPix;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Fecha a tela\"]")
    public MobileElement BtnSairDaPagina;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoPIX;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoBoleto;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoCartaoDebito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoMeuCartao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoCupom;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoCartaoPresente;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"FINALIZAR PEDIDO\"]")
    public MobileElement BtnFinalizarPedido;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"PRONTO\"]")
    public MobileElement BtnPronto;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='VALIDAR CARTÃO PRESENTE']")
    public MobileElement BtnValidarCartaoPresente;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoCartaoCredito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Pedido realizado com sucesso!\"]")
    public MobileElement TxtPedidoRealizadoComSucessoCartao;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Switch")
    public MobileElement BtnClickAtivarUmClick;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Digite o código']")
    public MobileElement TxtClicarDigitarCodigo;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtCodigo;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Inserir cupom']")
    public MobileElement BtnInserirCupom;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtNumeroCartao;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtNomeCartao;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtSenhaCartao;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtSenhaCartaoPresente;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditTex")
    public MobileElement TxtVencimentoCartao;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
    public MobileElement TxtNumSegurancaCartao;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"]")
    public MobileElement TxtNumParcelaCartao;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.TextView")
    public MobileElement BtnEscolhaNumParcelaCartao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Configurações Ambiente\"]")
    public MobileElement BtnConfiguracoesAmbiente;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text=\"HML01\"]")
    public MobileElement BtnHML01;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text=\"HML02\"]")
    public MobileElement BtnHML02;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text=\"HML03\"]")
    public MobileElement BtnHML03;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"SALVAR\"]")
    public MobileElement BtnSalvar;


}
