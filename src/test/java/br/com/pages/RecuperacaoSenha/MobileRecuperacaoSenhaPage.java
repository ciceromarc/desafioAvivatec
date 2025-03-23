package br.com.pages.RecuperacaoSenha;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MobileRecuperacaoSenhaPage {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Menu, New notification\"]" )
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Menu\"]")
    public MobileElement BtnMenuOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Faça login ou cadastre-se\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Faça login ou cadastre-se\"]")
    public MobileElement BtnPagLogin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Esqueci minha senha\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esqueci minha senha\"]")
    public MobileElement BtnEsqueciSenha;

    @AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Digite o CPF do cadastro\"]")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeTextField[@name=\"Digite o CPF do cadastro\"]")
    public MobileElement TxtInformarCPF;

    @AndroidFindBy(xpath ="//android.widget.Button[@text=\"Esqueci minha senha\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ESQUECI MINHA SENHA\"]")
    public MobileElement BtnSubmitEsqueciSenha;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Campo inválido\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CPF inválido\"]")
    public MobileElement TxtMsgCPFInvalido;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"CPF não encontrado.\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Este CPF não é vinculado a uma conta \"]")
    public MobileElement TxtMsgCPFNaoCadastrado;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Enviado!\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enviado!\"]")
    public MobileElement TxtMsgEnviada;

    @AndroidFindBy(xpath="//android.widget.EditText[@text=\"Insira o seu CPF ou e-mail\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Insira seu CPF ou e-mail\"]")
    public MobileElement TxtEmailUsuario;

}