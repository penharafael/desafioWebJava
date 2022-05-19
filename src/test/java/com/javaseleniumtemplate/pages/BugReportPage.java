package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugReportPage extends PageBase {
    //Mapping
    By categoryComboBox = By.name("category_id");

    By frequenciaBox = By.name("reproducibility");

    By gravidadeBox = By.name("severity");

    By prioridadeBox = By.name("priority");

    By handlerBox = By.name("handler_id");

    By resumoField = By.name("summary");
    By descriptionField = By.name("description");

    By submitButton = By.xpath("//input[@type='submit']");

    By uploadFileField = By.id("ufile[]");

    By mensagemSucesso = By.xpath("//p[@class='bold bigger-110']");








    //Actions
    public void selecionarCategoria(String categoria){
        comboBoxSelectByVisibleText(categoryComboBox, categoria);
    }

    public void selecionarFrequencia(String frequencia){comboBoxSelectByVisibleText(frequenciaBox,frequencia);}

    public void selecionarGravidade(String gravidade){comboBoxSelectByVisibleText(gravidadeBox,gravidade);}

    public void selecionarPrioridade(String prioridade){comboBoxSelectByVisibleText(prioridadeBox,prioridade);}

    public void selecionarAtribuicao(String atribuicao){comboBoxSelectByVisibleText(handlerBox,atribuicao);}


    public void preencherResumo(String resumo){
        sendKeys(resumoField, resumo);
    }

    public void preencherDescricao(String descricao){
        sendKeys(descriptionField, descricao);
    }

    public void clicarEmSubmitReport(){
        click(submitButton);
    }

    public void inserirAnexo(String caminhoArquivo){
        sendKeysWithoutWaitVisible(uploadFileField, caminhoArquivo);
    }

    public String returnMensagemSucesso() {
        return getText(mensagemSucesso);
    }


}
