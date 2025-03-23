package br.com.pages.Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MobileLoginPage {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Menu, New notification\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Menu\"]")
    public MobileElement BtnMenuOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Faça login ou cadastre-se\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Faça login ou cadastre-se\"]")
    public MobileElement BtnPagLogin;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Insira o seu CPF ou e-mail\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Insira seu CPF ou e-mail\"]")
    public MobileElement TxtEmailUsuario;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Digite sua senha\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Digite sua senha\"]")
    public MobileElement TxtSenhaUsuario;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Abre o canal da  no Facebook\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic facebook\"]")
    public MobileElement BtnFacebook;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic apple login\"]")
    public MobileElement BtnAppleLogin;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Abre o canal da  no Google\"]")
    public MobileElement BtnGoogle;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Entrar\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Entrar\"]")
    public MobileElement BtnSubmit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Olá, BatmanBatman\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Olá, Batman\"]")
    public MobileElement TxtMsgLogado;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Combinação de usuário e senha inválida, tente novamente.\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Combinação de usuário e senha inválida, tente novamente.\"]")
    public MobileElement TxtCombinacaoErrada;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Campo inválido\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"CPF/E-mail inválido\"]")
    public MobileElement TxtMsgEmailVazio;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"A senha deve ter no mínimo 6 caracteres\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Senha inválida\"]")
    public MobileElement TxtMsgSenhaVazia;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log into your Facebook account to connect to Lojas \"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"facebook\"]")
    public MobileElement TxtPaginaFacebook;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sign in\"]")
    public MobileElement TxtPaginaGoogle;
}