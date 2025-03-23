package br.com.pages.Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MobileLoginPorAppExternoPage {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Abre o canal da  no Facebook\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic facebook\"]")
    public MobileElement BtnFacebook;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Abre o canal da  no Google\"]")
    @iOSXCUITFindBy()
    public MobileElement BtnGoogle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log into your Facebook account to connect to Lojas \"]")
    public MobileElement TxtPaginaFacebook;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sign in\"]")
    @iOSXCUITFindBy()
    public MobileElement TxtPaginaGoogle;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Buscar\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name=\"“Lojas ” Wants to Use “facebook.com” to Sign In\"]")
    public MobileElement BtnBusca;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Digite o que você está procurando']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Pesquisar\"]")
    public MobileElement TxtBusca;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='camisa']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"camisa\"]")
    public MobileElement BtnBuscarCamisa;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagem do produto\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell[@name=\"Card view products\"])[1]")
    public MobileElement BtnCamisa;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADICIONAR À SACOLA\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADICIONAR À SACOLA\"]")
    public MobileElement BtnOpcoesCamisa;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PP\"]")
    public MobileElement BtnTamanhoCamisaPP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"P\"]")
    public MobileElement BtnTamanhoCamisaP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"M\"]")
    public MobileElement BtnTamanhoCamisaM;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"G\"]")
    public MobileElement BtnTamanhoCamisaG;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"GG\"]")
    public MobileElement BtnTamanhoCamisaGG;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ADICIONAR À SACOLA']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADICIONAR À SACOLA\"]")
    public MobileElement BtnAdicionarASacola;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Seu Carrinho\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic cart\"]")
    public MobileElement BtnAcessarSacola;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Finalizar compra']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Finalizar compra\"]")
    public MobileElement BtnFinalizarCompra;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Acesse sua conta.\"]")
    public MobileElement validacaoTelaDeLogin;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ENTENDI']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ENTENDI\"]")
    public MobileElement BtnMsgCEP;

}