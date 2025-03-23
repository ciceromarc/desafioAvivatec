package br.com.pages.Carrinho;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MobileCarrinhoPage {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Buscar\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic search\"]")
    public MobileElement BtnBuscaLupa;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Pesquisar\"]")
    public MobileElement TxtProduto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagem do produto\"])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Card view products\"]")
    public MobileElement BtnProduto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagem do produto\"])[3]")
    @iOSXCUITFindBy()
    public MobileElement BtnProdutoBaixoCusto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagem do produto\"])[2]")
    @iOSXCUITFindBy()
    public MobileElement BtnSegundoProduto;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement TxtDoisPodutosNaSacola;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADICIONAR À SACOLA\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADICIONAR À SACOLA\"]")
    public MobileElement BtnOpcoesProduto;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PP\"]")
    public MobileElement BtnTamanhoCamisaPP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"P\"]")
    public MobileElement BtnTamanhoCamisaP;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"M\"]")
    public MobileElement BtnTamanhoCamisaM;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"G\"]")
    public MobileElement BtnTamanhoCamisaG;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"GG\"]")
    public MobileElement BtnTamanhoCamisaGG;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy()
    public MobileElement BtnEditarTamanhoCamisaPP;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSXCUITFindBy()
    public MobileElement BtnEditarTamanhoSegundaOpcao;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[1]")
    public MobileElement BtnPrimeiroStorie;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Departamento\"])[4]")
    public MobileElement BtnQuartoStorie;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Exibe as opções de ordenação.\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ORDENAR POR\"]")
    public MobileElement BtnListaOrdenacao;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Menor Preço']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Menor Preço\"]")
    public MobileElement BtnMenorPreco;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADICIONAR À SACOLA\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADICIONAR À SACOLA\"]")
    public MobileElement BtnAdicionarProdutoSacola;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"O desconto é válido somente para produtos vendidos e entregues pela Lojas .\"]")
    public MobileElement TxtFreteGratisNegadoP3;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Seu Carrinho\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic shopping bag\"]")
    public MobileElement BtnSacola;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ótimo! Agora o frete é por nossa conta ☺️\"]")
    public MobileElement TxtmensagemFreteGratis;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagem do produto\"])[1]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement TxtProdutoUmPDP;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='1']")
    public MobileElement BtnSelecionarQdt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Aumenta a quantidade\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='+']")
    public MobileElement BtnAumentaQuantidade;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Confirmar']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirmar']")
    public MobileElement BtnConfirmarQuantidade;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ótimo! Agora o frete é por nossa conta']")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement TxtmensagemFreteGratisAtingido;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement BtnProduto3NaSacola;


    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Alterar tamanho\"]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement BtnConfirmarTamanho;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Remove o produto\"]")
    @iOSXCUITFindBy(xpath = "//	XCUIElementTypeButton[@name=\"ic close grey\"]")
    public MobileElement BtnRemoveproduto;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"QUERO EXCLUIR\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"QUERO EXCLUIR\"]")
    public MobileElement BtnQueroExcluir;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement BtnTamanhoProduto;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.Button")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement BtnAdicionarSugerido;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement BtnTamanhoSugerido;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Alameda \"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Alameda \"]")
    public MobileElement BtnStorieAlameda;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Voltar\"]")
    public MobileElement BtnVoltar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"2\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"2\"]")
    public MobileElement TxtValidacaoQuantidadeAumentada;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Seu Carrinho está vazia\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Você não tem produtos na sacola\"]")
    public MobileElement TxtValidacaoSacolaVazia;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Inserir CEP\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Inserir CEP\"]")
    public MobileElement BtnInserirCEP;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Adicionar\"]")
    public MobileElement TxtInformarCEP;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Consultar entrega\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Consultar entrega\"]")
    public MobileElement BtnConsultarEntrega;

    @AndroidFindBy(xpath = "/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Entrega a partir de 1 dia\"]")
    public MobileElement TxtPrazoDeEntrega;
}
