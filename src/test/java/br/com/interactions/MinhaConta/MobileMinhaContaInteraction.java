package br.com.interactions.MinhaConta;

import br.com.pages.MinhaConta.MobileMinhaContaPage;
import br.com.robots.AppiumRobotsTool;
import br.com.runner.RunnerTest;
import br.com.toolbox.Toolkit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MobileMinhaContaInteraction extends MobileMinhaContaPage {

    AppiumRobotsTool appDriver = null;
    Toolkit toolkit = new Toolkit();

    String basePathJson = "src\\test\\java\\br\\com\\resources\\";

    JSONObject jsonUserInfo = Toolkit.GetJsonStatic("credentials", basePathJson);
    JSONObject jsonCapabilitiesInfo = Toolkit.GetJsonStatic("capabilities", basePathJson);
    JSONObject jsonDataInfo = Toolkit.GetJsonInfo(basePathJson
                    + "\\data\\" + "mobileMinhaConta\\" + "Mobile_App_MinhaConta.json",
            RunnerTest.plataforma, RunnerTest.tag);
    String mensagem = String.valueOf(jsonDataInfo.get("mensagem"));

    public MobileMinhaContaInteraction() throws IOException, ParseException {
    }

    public AppiumRobotsTool startAutomationScenario() throws IOException, ParseException, IOException, ParseException {
        AppiumRobotsTool appDriver = Toolkit.initiateAppBrowserStack(jsonCapabilitiesInfo, jsonUserInfo);
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);

        return appDriver;
    }

    public void clicarMenu(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMenuOptions);
    }

    public void realizarLogin(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMenuOptions);
        appDriver.click(BtnPagLogin);

        appDriver.setText(TxtEmailUsuario, String.valueOf(jsonDataInfo.get("emailLogin")));
        appDriver.setText(TxtSenhaUsuario, String.valueOf(jsonDataInfo.get("senhaLogin")));

        appDriver.click(BtnSubmit);
    }

    public void minhaConta(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMinhaConta);
    }

    public void meuCadastro(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMeuCadastro);
    }

    public void alterarNome(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNome, String.valueOf(jsonDataInfo.get("nome")));
    }

    public void alterarSobrenome(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtSobrenome, String.valueOf(jsonDataInfo.get("sobrenome")));
    }

    public void salvarDados(AppiumRobotsTool appDriver) throws Exception {
        quantidadeDeScrool(appDriver, 3);
        appDriver.click(BtnSalvaAltDados);
    }

    public void apagarTelefone(AppiumRobotsTool appDriver) throws Exception {
        quantidadeDeScrool(appDriver, 2);
        appDriver.clearField(TxtApagarTelefone);
    }

    public void meusEnderecos(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMeusEnderecos);
    }

    public void acessarEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnAbrirEndereco);
    }

    public void editarNumeroDoEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtEditarNumero, String.valueOf(jsonDataInfo.get("numero")));
    }

    public void salvarAletracao(AppiumRobotsTool appDriver) throws Exception {
        quantidadeDeScrool(appDriver, 2);
        appDriver.click(BtnSalvaAltDados);
    }

    public void quantidadeDeScrool(AppiumRobotsTool appDriver, int repeticao) {
        int a = 1;
        while (a <= repeticao) {
            toolkit.scrollAppScreen(appDriver);
            a++;
        }
    }

    public void adicionarEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnAdicionarEndereco);
    }

    public void preencherFormularioNovoEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtCEP, String.valueOf(jsonDataInfo.get("CEP")));
        appDriver.setText(TxtEndereco, String.valueOf(jsonDataInfo.get("endereco")));

        appDriver.setText(TxtEditarNumero, String.valueOf(jsonDataInfo.get("numero")));
        appDriver.setText(TxtBairro, String.valueOf(jsonDataInfo.get("bairro")));
    }

    public void excluirEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnExcluirEndereco);
    }

    public void alterarSenhaAplicativo(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnAltSenhaAplicativo);
    }

    public void senhaAtual(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtSenhaAtual, String.valueOf(jsonDataInfo.get("senha")));
    }

    public void novaSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNovaSenha, String.valueOf(jsonDataInfo.get("novaSenha")));
    }

    public void confirmacaoNovaSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtConfNovaSenha, String.valueOf(jsonDataInfo.get("confirmacaoSenha")));
    }

    public void confirmarAlteracaoSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnAlterarSenha);
    }

    public void validacaoMensagemSenhaNaoAlterada(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgAlteracaoSenhaNaoRealizada);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoMensagemSenhaNaoNaoIguais(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgAlteracaoSenhaNaoIguais);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoTelaDeLogin(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtValidacaoTelaDeLogin);

        Assert.assertEquals(msg, mensagem);

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);
    }

    public void validacaoSenhaAtualizadaComSucesso(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtValidacaoSenhaAtualizadaComSucesso);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoEnderecoAlteradoComSucesso(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtValidacaoEnderecoAlteradoComSucesso);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoEnderecoExcluido(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtValidacaoEnderecoExcluido);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        //appDriver.click(BtnOkSalvaAltDados);
        appDriver.closeApp();
    }

    public void validacaoMensagemDadosAlterados(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgAlteracaoDados);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.click(BtnOkSalvaAltDados);
        appDriver.closeApp();
    }

    public void validacaoEnderecoAdicionado(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtValidacaoEnderecoAdicionado);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }
}

