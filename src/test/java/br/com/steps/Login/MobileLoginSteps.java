package br.com.steps.Login;

import br.com.interactions.Cadastro.MobileCadastroInteraction;
import br.com.interactions.Login.MobileLoginInteraction;
import br.com.robots.AppiumRobotsTool;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MobileLoginSteps {

    MobileLoginInteraction mobileLogin = new MobileLoginInteraction();
    AppiumRobotsTool appDriver = mobileLogin.startAutomationScenario();
    public MobileLoginSteps() throws IOException, ParseException {
    }

    /*
    Contexto do cenario de login
    Contendo passos comuns a todos os fluxos
    */
    @Dado("que estou na pagina de inicio do APP ")
    public void context_given_one() throws Exception{
    }

    @E("clico no icone Menu")
    public void context_and_one() throws Exception{
        mobileLogin.clicarBotaoMenu(appDriver);
    }

    @E("clico na opcao faca login")
    public void context_and_two() throws Exception{
        mobileLogin.clicarBotaoPagLogin(appDriver);
    }

    /*
    @Mobile_App_Login_001
    Cenario Login com usuario valido
    */
    @Quando("informar o usuario valido no campo de usuario")
    public void scenario_when_one() throws Exception{
        mobileLogin.informarEmail(appDriver);
    }

    @E("informar a senha valida no campo de senha")
    public void scenario_and_one() throws Exception{
        mobileLogin.informarSenha(appDriver);
    }

    @E("clico no campo entrar")
    public void scenario_and_two() throws Exception{
        mobileLogin.entrar(appDriver);
    }

    @Entao("o login deve ser efetuado com sucesso")
    public void scenario_then_one() throws Exception{
        mobileLogin.validacaoLoginEfetuadoComSucesso(appDriver);
    }

    /*
    @Mobile_App_Login_002
    Cenario: Login com senha invalida
    */
    @Quando("informar um usuario valido no campo de usuario")
    public void scenario_when_two() throws Exception{
        mobileLogin.informarEmail(appDriver);
    }

    @E("informar uma senha invalida no campo de senha")
    public void scenario_and_three() throws Exception{
        mobileLogin.informarSenha(appDriver);
    }

    @E("clico no botao entrar")
    public void scenario_and_four() throws Exception{
        mobileLogin.entrar(appDriver);
    }

    @Entao("o login nao sera realizado")
    public void scenario_then_two() throws Exception{
        mobileLogin.validacaoSenhaIncorreta(appDriver);
    }

    /*
    @Mobile_App_Login_003
    Cenario: Login com usuario invalido
    */
    @Quando("informar o usuario invalido no campo de usuario")
    public void scenario_when_three() throws Exception{
        mobileLogin.informarEmail(appDriver);
    }

    @E("informar a senha invalida no campo de senha")
    public void scenario_and_five() throws Exception{
        mobileLogin.informarSenha(appDriver);
    }

    @E("clico no no campo entrar")
    public void scenario_and_six() throws Exception{
        mobileLogin.entrar(appDriver);
    }

    @Entao("ao validar o campo user o login nao e realizado")
    public void scenario_then_three() throws Exception{
        mobileLogin.validacaoEmailIncorreto(appDriver);
    }

    /*
    @Mobile_App_Login_004
    Cenario: Login com campos vazios
    */
    @Quando("nao preencher o campo de usuario")
    public void scenario_when_four() throws Exception{
        mobileLogin.informarEmail(appDriver);
    }

    @E("nao preencher o campo de senha")
    public void scenario_and_seven() throws Exception{
        mobileLogin.informarSenha(appDriver);
    }

    @Entao("recebo a mensagem informando que os campos estao invalidos")
    public void scenario_then_four() throws Exception{
        mobileLogin.validacaoCamposVazios(appDriver);
    }

    /*
    @Mobile_App_Login_005
    Cenario: Login com a conta do Google pela Home
    */
    @Quando("seleciono o icone do aplicativo Google")
    public void scenario_when_five() throws Exception{
        mobileLogin.btnGoogle(appDriver);
    }

    @Entao("sou direcionado a pagina de login pelo Google")
    public void scenario_then_five() throws Exception{
        mobileLogin.telaDeLoginGoogleHome(appDriver);
    }

    /*
    @Mobile_App_Login_006
    Cenario: Login com a conta do Facebook pela Home
    */
    @Quando("seleciono o icone do aplicativo Facebook")
    public void scenario_when_six() throws Exception{
        mobileLogin.btnFacebook(appDriver);
    }

    @Entao("sou direcionado a pagina de login pelo Facebook")
    public void scenario_then_six() throws Exception{
        mobileLogin.telaDeLoginFacebookHome(appDriver);
    }
}
