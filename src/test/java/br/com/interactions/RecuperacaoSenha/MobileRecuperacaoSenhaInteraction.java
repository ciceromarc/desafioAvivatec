package br.com.interactions.RecuperacaoSenha;

import br.com.pages.RecuperacaoSenha.MobileRecuperacaoSenhaPage;
import br.com.robots.AppiumRobotsTool;

import br.com.runner.RunnerTest;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class MobileRecuperacaoSenhaInteraction extends MobileRecuperacaoSenhaPage {

    AppiumRobotsTool appDriver = null;
    Toolkit toolkit = new Toolkit();

    String basePathJson = "src\\test\\java\\br\\com\\resources\\";

    JSONObject jsonUserInfo = Toolkit.GetJsonStatic("credentials", basePathJson);
    JSONObject jsonCapabilitiesInfo = Toolkit.GetJsonStatic("capabilities", basePathJson);
    JSONObject jsonDataInfo = Toolkit.GetJsonInfo(basePathJson
            + "\\data\\" + "mobileRecuperacaoSenha\\" + "Mobile_App_RecuperacaoSenha.json",
            "android", RunnerTest.tag);

    String mensagem = String.valueOf(jsonDataInfo.get("mensagem"));

    String cpf = String.valueOf(jsonDataInfo.get("CPF"));

    public MobileRecuperacaoSenhaInteraction() throws IOException, ParseException {
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

    public void esqueciSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnEsqueciSenha);
    }

    public void informarCpfCadastrado(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtInformarCPF, cpf);
    }

    public void informarCpfInvalido(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtInformarCPF, cpf);
    }

    public void informarCpfNaoCadastrado(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtInformarCPF, cpf);
    }

    public void informarEmail(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtEmailUsuario, String.valueOf(jsonDataInfo.get("email")));
    }

    public void submitEsqueciSenha(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnSubmitEsqueciSenha);
    }

    public void validacaoMensagemCpfInvalido(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgCPFInvalido);

        Assert.assertEquals(msg, mensagem);
      //  toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoMensagemEnviada(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgEnviada);

        Assert.assertEquals(msg, mensagem);
     //   toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoMensagemCpfNaoCadastrado(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgCPFNaoCadastrado);

        Assert.assertEquals(msg, mensagem);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }
}
