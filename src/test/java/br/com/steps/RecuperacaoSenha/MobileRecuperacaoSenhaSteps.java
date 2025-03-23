package br.com.steps.RecuperacaoSenha;

import br.com.interactions.RecuperacaoSenha.MobileRecuperacaoSenhaInteraction;
import br.com.robots.AppiumRobotsTool;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MobileRecuperacaoSenhaSteps {

    MobileRecuperacaoSenhaInteraction mobileRecuperacaoSenha = new MobileRecuperacaoSenhaInteraction();
    AppiumRobotsTool appDriver = mobileRecuperacaoSenha.startAutomationScenario();
    public MobileRecuperacaoSenhaSteps() throws IOException, ParseException {
    }

    /*
    Contexto do cenario de recuperação de senha
    Contendo passos comuns a todos os fluxos
    */
    @Dado("que estou na pagina inicio do APP")
    public void context_given_one() throws Exception {
    }

    @E("clico na opcao de Menu")
    public void context_and_one() throws Exception {
        mobileRecuperacaoSenha.clicarBotaoMenu(appDriver);
    }

    @E("sou direcionado a pagina de login")
    public void context_and_two() throws Exception {
        mobileRecuperacaoSenha.clicarBotaoPagLogin(appDriver);
    }

    /*
    @Mobile_App_RecuperacaoSenha_001
    Cenario: Realizar validacao de senha com CPF cadastrado
    */
    @Quando("clico na opcao esqueci minha senha")
    public void scenario_when_one() throws Exception {
        mobileRecuperacaoSenha.esqueciSenha(appDriver);
    }

    @E("informar no campo de CPF um CPF ja cadastrado")
    public void scenario_and_and() throws Exception {
        mobileRecuperacaoSenha.informarCpfCadastrado(appDriver);
    }

    @E("clicar no botao esqueci minha senha")
    public void scenario_and_two() throws Exception {
        mobileRecuperacaoSenha.submitEsqueciSenha(appDriver);
    }

    @Entao("deve abrir uma nova janela confirmando o envio de email para redefinicao de senha")
    public void scenario_then_one() throws Exception {
        mobileRecuperacaoSenha.validacaoMensagemEnviada(appDriver);
    }

    /*
    @Mobile_App_RecuperacaoSenha_002
    Cenario: Realizar validacao de senha com CPF invalido
    */
    @Quando("clicar na opcao de esqueci minha senha")
    public void scenario_when_two() throws Exception {
        mobileRecuperacaoSenha.esqueciSenha(appDriver);
    }

    @E("informar no campo de CPF um CPF invalido")
    public void scenario_and_three() throws Exception {
        mobileRecuperacaoSenha.informarCpfInvalido(appDriver);
    }

    @E("clicar no botao de esqueci minha senha")
    public void scenario_and_four() throws Exception {
        mobileRecuperacaoSenha.submitEsqueciSenha(appDriver);
    }

    @Entao("a mensagem campo invalido deve ser exibida")
    public void scenario_then_two() throws Exception {
        mobileRecuperacaoSenha.validacaoMensagemCpfInvalido(appDriver);
    }

    /*
    @Mobile_App_RecuperacaoSenha_003
    Cenario: Realizar validacao de senha com CPF nao cadastrado
    */
    @Quando("clicar em esqueci minha senha")
    public void scenario_when_three() throws Exception {
        mobileRecuperacaoSenha.esqueciSenha(appDriver);
    }

    @E("informar no campo de CPF um CPF nao cadastrado")
    public void scenario_and_five() throws Exception {
        mobileRecuperacaoSenha.informarCpfNaoCadastrado(appDriver);
    }

    @E("clicar no botao de confirmacao esqueci minha senha")
    public void scenario_and_six() throws Exception {
        mobileRecuperacaoSenha.submitEsqueciSenha(appDriver);
    }

    @Entao("a mensagem de CPF nao encontrado deve ser exibida")
    public void scenario_then_three() throws Exception {
        mobileRecuperacaoSenha.validacaoMensagemCpfNaoCadastrado(appDriver);
    }

    /*
    @Mobile_App_RecuperacaoSenha_004
    Cenario: Realizar recuperacao de senha com email cadastrado
    */
    @Quando("informar no campo de usuario um email valido")
    public void scenario_when_four() throws Exception {
        mobileRecuperacaoSenha.informarEmail(appDriver);
    }

    @E("clicar na opcao de esqueci a minha senha")
    public void scenario_and_seven() throws Exception {
        mobileRecuperacaoSenha.esqueciSenha(appDriver);
    }

    @E("preencher o CPF cadastrado na mesma conta do email informado")
    public void scenario_and_eight() throws Exception {
        mobileRecuperacaoSenha.informarCpfCadastrado(appDriver);
    }

    @E("clico no botao de confirmacao esqueci minha senha")
    public void scenario_and_nine() throws Exception {
        mobileRecuperacaoSenha.submitEsqueciSenha(appDriver);
    }

    @Entao("deve abrir uma nova janela confirmando o envio de email para redefinicao de senha por email")
    public void scenario_then_four() throws Exception {
        mobileRecuperacaoSenha.validacaoMensagemEnviada(appDriver);
    }
}