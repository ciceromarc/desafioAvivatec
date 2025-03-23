package br.com.interactions.Carrinho;

import br.com.robots.AppiumRobotsTool;
import br.com.runner.RunnerTest;
import br.com.toolbox.Toolkit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MobileCadastroInteraction extends MobileCadastroPage {

    AppiumRobotsTool appDriver = null;
    Toolkit toolkit = new Toolkit();
    String basePathJson = "src\\test\\java\\br\\com\\resources\\";
    JSONObject jsonUserInfo = Toolkit.GetJsonStatic("credentials", basePathJson);
    JSONObject jsonCapabilitiesInfo = Toolkit.GetJsonStatic("capabilities", basePathJson);
    JSONObject jsonDataInfo = Toolkit.GetJsonInfo(basePathJson
                    + "\\data\\" + "mobileCadastro\\" + "Mobile_App_Cadastro.json",
            "android", RunnerTest.tag);

    String cpf = String.valueOf(jsonDataInfo.get("CPF"));

    String msgRetorno = String.valueOf(jsonDataInfo.get("mensagem"));

    public MobileCadastroInteraction() throws IOException, ParseException {
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

    public void clicarBotaoCadastro(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnCadastro);
    }

    public void cpfValido(AppiumRobotsTool appDriver) throws Exception {
        String cpf = toolkit.geradorCpf();

        appDriver.setText(TxtCPF, cpf);

        appDriver.click(BtnSubmitCPF);
    }

    public void cpfExistente(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtCPF, cpf);
        appDriver.click(BtnSubmitCPF);
    }

    public void cpfInvalido(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtCPF, cpf);
        appDriver.click(BtnSubmitCPF);
    }

    public void dadosCadastro(AppiumRobotsTool appDriver) throws Exception {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String msg = dateformat.format(new Date());

        appDriver.setText(TxtEmailCadastro, "teste@" + msg + ".com");
        appDriver.setText(TxtNomeCadastro, String.valueOf(jsonDataInfo.get("nome")));
        appDriver.setText(TxtSobrenomeCadastro, String.valueOf(jsonDataInfo.get("sobrenome")));

        appDriver.click(BtnPreferenciaFeminina);

        toolkit.scrollAppScreen(appDriver);

        appDriver.click(BtnSubmitCadastro);
    }

    public void dadosPessoais(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnDataDeNascimento);
        alterarData(appDriver);
        appDriver.click(BtnConfirmAno);

        appDriver.setText(TxtTelefone, String.valueOf(jsonDataInfo.get("telefone")));
        appDriver.setText(TxtDigiteSenha, String.valueOf(jsonDataInfo.get("senha")));
    }

    public void aceitarTermosDeUso(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnTermoDeUso);
    }

    public void termoDeUsoObrigatorio(AppiumRobotsTool appDriver) throws Exception {
        String campoMsg = appDriver.getText(TxtMsgTermoDeUsoObrigatorio);

        Assert.assertEquals(campoMsg, msgRetorno);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void dataDeNascimentoIncorreta(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnDataDeNascimento);
        appDriver.setText(TxtAno, String.valueOf(jsonDataInfo.get("idade")));
        appDriver.click(BtnConfirmAno);

        String msg = appDriver.getText(TxtMsgIdadeInvalida);

        Assert.assertEquals(msg, msgRetorno);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void alterarData(AppiumRobotsTool appDriver) throws Exception {
        String ano = appDriver.getText(BtnAnoAnterior);

        appDriver.click(BtnAnoAnterior);

        while (!ano.equals("2002")) {
            appDriver.click(BtnAnoAnterior);
            ano = appDriver.getText(BtnAnoAnterior);
        }
    }

    public void preenchimentoCadastroCompleto(AppiumRobotsTool appDriver) throws Exception {
        dadosCadastro(appDriver);
        dadosPessoais(appDriver);
    }

    public void confirmarCadastro(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnConcluirCadastro);
    }

    public void validacaoCPFExistente(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgCPFExisente);

        Assert.assertEquals(msg, msgRetorno);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoCPFInvalido(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtMsgCPFInvalido);

        Assert.assertEquals(msg, msgRetorno);
        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }
}
