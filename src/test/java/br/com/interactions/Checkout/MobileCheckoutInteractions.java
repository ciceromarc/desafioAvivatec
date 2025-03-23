package br.com.interactions.Checkout;
import br.com.pages.Checkout.MobileCheckoutPage;
import br.com.robots.AppiumRobotsTool;
import br.com.runner.RunnerTest;
import br.com.toolbox.Toolkit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class MobileCheckoutInteractions extends MobileCheckoutPage {

    AppiumRobotsTool appDriver = null;
    Toolkit toolkit = new Toolkit();
    String basePathJson = "src\\test\\java\\br\\com\\resources\\";

    JSONObject jsonUserInfo = Toolkit.GetJsonStatic("credentials", basePathJson);
    JSONObject jsonCapabilitiesInfo = Toolkit.GetJsonStatic("capabilities", basePathJson);
    JSONObject jsonDataInfo = Toolkit.GetJsonInfo(basePathJson
                    + "\\data\\" + "mobileCheckout\\" + "Mobile_App_Checkout.json",
            "android", RunnerTest.tag);

    String cpf = String.valueOf(jsonDataInfo.get("CPF"));

    String msgRetorno = String.valueOf(jsonDataInfo.get("mensagem"));

    public MobileCheckoutInteractions() throws IOException, ParseException {
    }

    public AppiumRobotsTool startAutomationScenario() throws IOException, ParseException, IOException, ParseException {
        AppiumRobotsTool appDriver = Toolkit.initiateAppBrowserStack(jsonCapabilitiesInfo, jsonUserInfo);
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);

        return appDriver;
    }

    public void realizarLogin(AppiumRobotsTool appDriver) throws Exception {
        toolkit.alterarAmbiente(appDriver, BtnMenu, BtnConfiguracoesAmbiente, BtnHML03, BtnSalvar);

        appDriver.click(BtnMenu);
        appDriver.click(BtnPagLogin);

        appDriver.setText(TxtEmailUsuario, String.valueOf(jsonDataInfo.get("emailLogin")));
        appDriver.setText(TxtSenhaUsuario, String.valueOf(jsonDataInfo.get("senhaLogin")));

        appDriver.click(BtnSubmit);

        appDriver.click(BtnInicio);
    }

    public void adicionarProdutoASacola(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnTerceiroStorie);

        appDriver.click(BtnProdutoPorStorie);

        appDriver.click(BtnOpcoesProduto);

        tamanhoCamisa(appDriver);

        appDriver.waitObject(BtnAdicionarProdutoSacola, 3000);

        appDriver.click(BtnAdicionarProdutoSacola);
    }

    public void acessarSacola(AppiumRobotsTool appDriver) throws Exception {
        appDriver.waitObject(BtnAcessarSacola, 3000);
        appDriver.click(BtnAcessarSacola);
    }


    public void finalizarCompra(AppiumRobotsTool appDriver) throws Exception {
        appDriver.waitObject(BtnFinalizarCompra, 3000);
        appDriver.click(BtnFinalizarCompra);
    }

    public void escolherEndereco(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnEscolherEndereco);
    }

    public void prosseguirParaPagamento(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnIrParaPagamento);
    }

    public void escolherPagamentoPix(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagarComPix);
    }

    public void confirmarPagamentoComPix(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnSairDaPagina);
        appDriver.click(BtnFinalizarPedido);
    }

    public void opcaoEntrega(AppiumRobotsTool appDriver) throws Exception {
        if (appDriver.getText(TxtModoDeEntrega1).toString().equals("Normal")) {
            appDriver.click(BtnModoDeEntrega1);
        } else if (appDriver.getText(TxtModoDeEntrega2).toString().equals("Normal")) {
            appDriver.click(BtnModoDeEntrega2);
        } else if (appDriver.getText(TxtModoDeEntrega3).toString().equals("Normal")) {
            appDriver.click(BtnModoDeEntrega3);
        }
    }

    public void tamanhoCamisa(AppiumRobotsTool appDriver) throws Exception {
        if (appDriver.isEnabled(BtnTamanhoCamisaPP)) {
            appDriver.click(BtnTamanhoCamisaPP);

        } else if (appDriver.isEnabled(BtnTamanhoCamisaP)) {
            appDriver.click(BtnTamanhoCamisaP);

        } else if (appDriver.isEnabled(BtnTamanhoCamisaM)) {
            appDriver.click(BtnTamanhoCamisaM);

        } else if (appDriver.isEnabled(BtnTamanhoCamisaG)) {
            appDriver.click(BtnTamanhoCamisaG);

        } else if (appDriver.isEnabled(BtnTamanhoCamisaGG)) {
            appDriver.click(BtnTamanhoCamisaGG);
        }
    }

    public void verificarOpcoesDePagamentoPix(AppiumRobotsTool appDriver) throws IOException, ParseException {
        int pontoDeInicioX = appDriver.getLocation(BtnUltimaOpcaoDePagamento).getX();
        int pontoDeInicioY = appDriver.getLocation(BtnUltimaOpcaoDePagamento).getY();

        int pontoFinalX = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getX();
        int pontoFinalY = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getY();

        TouchAction action = new TouchAction(appDriver.getDriver());
        action.longPress(PointOption.point(pontoDeInicioX, pontoDeInicioY))
                .moveTo(PointOption.point(pontoFinalX, pontoFinalY))
                .release().perform();
    }

    public void escolherPagamentoCartaoDebito(AppiumRobotsTool appDriver) throws Exception {
        verificarOpcoesDePagamentoCartaoDebito(appDriver);
        appDriver.click(BtnPagarComCartaoDebito);
    }

    private void verificarOpcoesDePagamentoCartaoDebito(AppiumRobotsTool appDriver) {
        int pontoDeInicioX = appDriver.getLocation(BtnUltimaOpcaoDePagamento).getX();
        int pontoDeInicioY = appDriver.getLocation(BtnUltimaOpcaoDePagamento).getY();

        int pontoFinalX = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getX();
        int pontoFinalY = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getY();

        TouchAction action = new TouchAction(appDriver.getDriver());
        action.longPress(PointOption.point(pontoDeInicioX, pontoDeInicioY))
                .moveTo(PointOption.point(pontoFinalX, pontoFinalY))
                .release().perform();
    }

    public void confirmarPagamentoComCartaoDebito(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNumeroCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.setText(TxtNomeCartao, String.valueOf(jsonDataInfo.get("nomeImpresso")));
        appDriver.setText(TxtVencimentoCartao, String.valueOf(jsonDataInfo.get("vencimento")));
        appDriver.setText(TxtNumSegurancaCartao, String.valueOf(jsonDataInfo.get("codSeg")));
        appDriver.click(TxtNumParcelaCartao);
        appDriver.click(BtnEscolhaNumParcelaCartao);
        appDriver.click(BtnPronto);
    }

    public void escolherPagamentoBoleto(AppiumRobotsTool appDriver) throws Exception {
        verificarOpcoesDePagamentoBoleto(appDriver);
        appDriver.click(BtnPagarComBoleto);
    }

    public void verificarOpcoesDePagamentoBoleto(AppiumRobotsTool appDriver) {
        int pontoDeInicioX = appDriver.getLocation(BtnUltimaOpcaoDePagamentoBoleto).getX();
        int pontoDeInicioY = appDriver.getLocation(BtnUltimaOpcaoDePagamentoBoleto).getY();

        int pontoFinalX = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getX();
        int pontoFinalY = appDriver.getLocation(BtnPrimeiraOpcaoDePagamento).getY();

        TouchAction action = new TouchAction(appDriver.getDriver());
        action.longPress(PointOption.point(pontoDeInicioX, pontoDeInicioY))
                .moveTo(PointOption.point(pontoFinalX, pontoFinalY))
                .release().perform();
    }

    public void confirmarPagamentoComBoleto(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnFinalizarPedido);
    }

    public void escolherPagamentoCartaoCredito(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagarComCartaoCredito);
    }

    public void confirmarPagamentoComCartaoCredito(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNumeroCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.setText(TxtNomeCartao, String.valueOf(jsonDataInfo.get("nomeImpresso")));
        appDriver.setText(TxtVencimentoCartao, String.valueOf(jsonDataInfo.get("vencimento")));
        appDriver.setText(TxtNumSegurancaCartao, String.valueOf(jsonDataInfo.get("codSeg")));
        appDriver.click(TxtNumParcelaCartao);
        appDriver.click(BtnEscolhaNumParcelaCartao);
        appDriver.click(BtnPronto);
    }

    public void escolherPagamentoCartao(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagarComCartao);
    }

    public void confirmarPagamentoComCartao(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNumeroCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.setText(TxtSenhaCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.click(TxtNumParcelaCartao);
        appDriver.click(BtnEscolhaNumParcelaCartao);
        appDriver.click(BtnPronto);
    }

    public void escolherPagamentoMeuCartao(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagarComMeuCartao);
    }

    public void confirmarPagamentoComMeuCartao(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNumeroCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.setText(TxtNomeCartao, String.valueOf(jsonDataInfo.get("nomeImpresso")));
        appDriver.setText(TxtVencimentoCartao, String.valueOf(jsonDataInfo.get("vencimento")));
        appDriver.setText(TxtNumSegurancaCartao, String.valueOf(jsonDataInfo.get("codSeg")));
        appDriver.click(TxtNumParcelaCartao);
        appDriver.click(BtnEscolhaNumParcelaCartao);
        appDriver.click(BtnPronto);
    }

    public void escolherPagamentoCartaoPresente(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnPagarComCartaoPresente);
    }

    public void confirmarPagamentoComCartaoPresente(AppiumRobotsTool appDriver) throws Exception {
        appDriver.setText(TxtNumeroCartao, String.valueOf(jsonDataInfo.get("numeroCartao")));
        appDriver.setText(TxtSenhaCartaoPresente, String.valueOf(jsonDataInfo.get("nomeImpresso")));

        appDriver.click(BtnValidarCartaoPresente);
    }

    public void ativarCompraComUmClick(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnClickAtivarUmClick);
    }

    public void escolherPagamentCupom(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(TxtClicarDigitarCodigo);
        appDriver.clearField(TxtCodigo);
        appDriver.setText(TxtCodigo, String.valueOf(jsonDataInfo.get("numeroCupom")));
    }

    public void confirmarPagamentoComCupom(AppiumRobotsTool appDriver) throws Exception {
        appDriver.click(BtnInserirCupom);
    }

    public void validacaoPagamentoComCupom(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoCupom);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComPix(AppiumRobotsTool appDriver) throws Exception {

        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoPIX);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComCartaoPresente(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoCartaoPresente);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComMeuCartao(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoMeuCartao);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComCartao(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoCartao);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComCartaoCredito(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoCartaoCredito);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComBoleto(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoBoleto);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }

    public void validacaoPagamentoComCartaoDebito(AppiumRobotsTool appDriver) throws Exception {
        String msg = appDriver.getText(TxtPedidoRealizadoComSucessoCartaoDebito);

        Assert.assertEquals(msg, String.valueOf(jsonDataInfo.get("mensagem")));

        toolkit.mobileScreenshot(jsonDataInfo, appDriver);

        appDriver.closeApp();
    }
}
