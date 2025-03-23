package br.com.interactions.Login;

import br.com.pages.Login.MobileLoginPage;
import br.com.runner.RunnerTest;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class MobileLoginInteraction extends MobileLoginPage {

    String basePathJson = "src\\test\\java\\br\\com\\resources\\";
     JSONObject jsonCapabilitiesInfo = Toolkit.GetJsonStatic("capabilities", basePathJson);

    JSONObject jsonDataInfo = Toolkit.GetJsonInfo(basePathJson
                    + "\\data\\" + "mobileLogin\\" + "Mobile_App_Login.json",
            RunnerTest.plataforma, RunnerTest.tag);

    String mensagem = String.valueOf(jsonDataInfo.get("mensagem"));
    String email = String.valueOf(jsonDataInfo.get("email"));
    String senha = String.valueOf(jsonDataInfo.get("senha"));

    public MobileLoginInteraction() throws IOException, ParseException {
    }

    public AppiumRobotsTool startAutomationScenario() throws IOException, ParseException, IOException, ParseException {
        AppiumRobotsTool appDriver = Toolkit.initiateAppBrowserStack(jsonCapabilitiesInfo, jsonUserInfo);
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);

        return appDriver;
    }

    public void clicarBotaoMenu(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnMenuOptions);
    }

    public void clicarBotaoPagLogin(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagLogin);
    }

    public void informarEmail(AppiumRobotsTool appDriver) throws Exception {
        if(RunnerTest.plataforma == "android") {
            appDriver.setText(TxtEmailUsuario, email);
        } else if (RunnerTest.plataforma == "ios"){
            appDriver.setText(TxtEmailUsuario, email);
            appDriver.clearField(TxtEmailUsuario);
        }
    }

    public void informarSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtSenhaUsuario, senha);
    }

    public void entrar(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnSubmit);
    }

    public void btnGoogle(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnGoogle);
    }

    public void btnFacebook(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnFacebook);
    }

    public void telaDeLoginFacebookHome(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPaginaFacebook);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void telaDeLoginGoogleHome(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPaginaGoogle);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoLoginEfetuadoComSucesso(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgLogado);
        Assert.assertEquals(msg, mensagem);

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoEmailIncorreto(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtCombinacaoErrada);
        Assert.assertEquals(msg, mensagem);

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoSenhaIncorreta(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtCombinacaoErrada);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoCamposVazios(AppiumRobotsTool appDriver) throws Exception {
        String mensagem1 = String.valueOf(jsonDataInfo.get("mensagem1"));
        String mensagem2 = String.valueOf(jsonDataInfo.get("mensagem2"));

        String confirm1 = appDriver.getText(TxtMsgEmailVazio);
        Assert.assertEquals(confirm1, mensagem1);

        String confirm2 = appDriver.getText(TxtMsgSenhaVazia);
        Assert.assertEquals(confirm2, mensagem2);

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }
}
