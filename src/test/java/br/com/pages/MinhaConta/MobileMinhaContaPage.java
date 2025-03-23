package br.com.pages.MinhaConta;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MobileMinhaContaPage {
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Menu, New notification\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Menu\"]")
    public MobileElement BtnMenuOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Minha conta']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Minha conta\"]")
    public MobileElement BtnMinhaConta;

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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meu cadastro']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Meu cadastro\"]")
    public MobileElement BtnMeuCadastro;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Meus Dados - \"]/XCUIElementTypeOther[2]")
    public MobileElement TxtNome;

    @AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Meus Dados - \"]/XCUIElementTypeOther[3]")
    public MobileElement TxtSobrenome;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Seus dados foram atualizados com sucesso!']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Seus dados foram atualizados com sucesso\"]")
    public MobileElement TxtMsgAlteracaoDados;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alterar senha']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Alterar senha do aplicativo\"]")
    public MobileElement TxtAlterarSenha;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"SALVAR\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SALVAR\"]")
    public MobileElement BtnSalvaAltDados;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public MobileElement BtnOkSalvaAltDados;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alterar senha do aplicativo']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Alterar senha do aplicativo\"]")
    public MobileElement BtnAltSenhaAplicativo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Senha atual\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Senha atual\"]")
    public MobileElement TxtSenhaAtual;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Nova senha\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Nova senha\"]")
    public MobileElement TxtNovaSenha;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Confirmar nova senha\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Confirmar nova senha\"]")
    public MobileElement TxtConfNovaSenha;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ALTERAR SENHA']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ALTERAR SENHA\"]")
    public MobileElement BtnAlterarSenha;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")//Verificar se é a mensagem de erro
    public MobileElement TxtMsgAlteracaoSenhaNaoRealizada;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"As senhas não são iguais. Verifique e tente de novo.\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"As senhas não são iguais. Verifique e tente de novo.\"]")
    public MobileElement TxtMsgAlteracaoSenhaNaoIguais;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Acesse sua conta.\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name\"Acesse sua conta.\"]")
    public MobileElement TxtValidacaoTelaDeLogin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Senha atualizada com sucesso.\"]")
    @iOSXCUITFindBy(xpath = "//")//Não tem mensagem dde retorno no IOS
    public MobileElement TxtValidacaoSenhaAtualizadaComSucesso;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Meus endereços\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Meus endereços\"]")
    public MobileElement BtnMeusEnderecos;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Abre o endereço\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"disclosure\"]")
    public MobileElement BtnAbrirEndereco;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Número*\"]")
    public MobileElement TxtEditarNumero;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Endereço alterado com sucesso\"]")
    @iOSXCUITFindBy(xpath = "//")//Não tem no IOS
    public MobileElement TxtValidacaoEnderecoAlteradoComSucesso;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Remove o endereço\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic close grey\"]")
    public MobileElement BtnExcluirEndereco;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Adicione agora e receba as melhores ofertas e condições de frete para sua região.\"]")
    @iOSXCUITFindBy(xpath = "")//Não tem no IOS
    public MobileElement TxtValidacaoEnderecoExcluido;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Adicionar endereço\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Adicionar\"]")
    public MobileElement BtnAdicionarEndereco;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"CEP*\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=CEP*]")
    public MobileElement TxtCEP;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Endereço*\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Endereço*\"]")
    public MobileElement TxtEndereco;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Bairro*\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Bairro*\"]")
    public MobileElement TxtBairro;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Novo endereço adicionado com sucesso\"]")
    @iOSXCUITFindBy(xpath = "//")//Não tem no IOS
    public MobileElement TxtValidacaoEnderecoAdicionado;

    @AndroidFindBy(xpath = "//android.view.View[5]/android.view.View/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//")//Não consegui mapear
    public MobileElement TxtApagarTelefone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Please fill out this field.\"]")
    @iOSXCUITFindBy(xpath = "//")//Não tem no IOS
    public MobileElement TxtTelefoneObrigatorio;
}