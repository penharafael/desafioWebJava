package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CampoPersonalizadoPage extends PageBase {

    //Mapping
    By nomeCampoPersonalizadoField = By.xpath("//*[@id=\"main-container\"]//*[@class='input-sm']");
    By novoCampoPersonalizadoField = By.xpath("//*[@id=\"main-container\"]//*[@class='btn btn-primary btn-sm btn-white btn-round']");

    By mensagemCampoCadastradoComSucesso = By.xpath("//p[@class='bold bigger-110']");

    By campoPersonalizadoCadastrado = By.xpath("//a[text()='Campo personalizado teste apagar']");

    By campoPersonalizadoCadastradoAlterar = By.xpath("//a[text()='Campo personalizado teste alterar']");

    By apagarCampoPersonalizadoBotton = By.xpath("//*[@class='btn btn-primary btn-sm btn-white btn-round']");

    By apagarCampoPersonalizadoConfirmacao = By.xpath("//*[@class='btn btn-primary btn-white btn-round']");

    By mensagemSucesso = By.xpath("//p[@class='bold bigger-110']");

    By tipoBox = By.xpath("//*[@id='custom-field-type']");

    By atualizarCampoPersonalizadoBotton = By.xpath("//input[@value='Atualizar Campo Personalizado']");

    By valoresPossiveisField = By.xpath("//*[@id='custom-field-possible-values']");

    By valoresPadraoField = By.xpath("//*[@id='custom-field-default-value']");

    By expressaoRegularField = By.xpath("//*[@id='custom-field-valid-regexp']");

    By acessoDeLeituraField = By.xpath("//*[@id='custom-field-access-level-r']");

    By acessoDeEscritaField = By.xpath("//*[@id='custom-field-access-level-rw']");

    By comprimentoMinimoField = By.xpath("//*[@id='custom-field-length-min']");

    By comprimentoMaximoField = By.xpath("//*[@id='custom-field-length-max']");


    //Actions

    public void preencherCampoPersonalizado(String nomeCampo) {
        sendKeys(nomeCampoPersonalizadoField, nomeCampo);
    }

    public void clicarNovoCampo() {
        click(novoCampoPersonalizadoField);
    }

    public String returnMensagemSucesso() {
        return getText(mensagemCampoCadastradoComSucesso);
    }

    public void clicarCampoPersonalizadoCadastrado() {
        click(campoPersonalizadoCadastrado);
    }

    public void clicarCampoPersonalizadoCadastradoAlterar() {
        click(campoPersonalizadoCadastradoAlterar);
    }

    public void clicarApagarCampoPersonalizado() {
        click(apagarCampoPersonalizadoBotton);
    }

    public void confirmarApagarCampoPersonalizado() {
        click(apagarCampoPersonalizadoConfirmacao);
    }

    public String returnMessageSucesso() {
        return getText(mensagemSucesso);
    }

    public void preencherTipo(String tipo) {
        comboBoxSelectByVisibleText(tipoBox, tipo);
    }

    public void clicarAtualizarCampoPersonalizado() {
        click(atualizarCampoPersonalizadoBotton);
    }

    public void preencherValorPossivel(String valorPossivel) {
        sendKeys(valoresPossiveisField, valorPossivel);
    }

    public void preencherValorPadrao(String valorPadrao) {
        sendKeys(valoresPadraoField, valorPadrao);
    }

    public void preencherExpressaoRegular(String expressao) {
        sendKeys(expressaoRegularField, expressao);
    }

    public void preencherAcessoLeitura(String acessoLeitura) {
        comboBoxSelectByVisibleText(acessoDeLeituraField, acessoLeitura);
    }

    public void preencherAcessoEscrita(String acessoEscrita) {
        comboBoxSelectByVisibleText(acessoDeEscritaField, acessoEscrita);
    }

    public void preencherComprimentoMinimo(String comprimentoMinimo) {
        sendKeys(comprimentoMinimoField, comprimentoMinimo);
    }

    public void preencherComprimentoMaximo(String comprimentoMaximo) {
        sendKeys(comprimentoMaximoField, comprimentoMaximo);
    }

}
