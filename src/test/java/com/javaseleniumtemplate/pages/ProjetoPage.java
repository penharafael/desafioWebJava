package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ProjetoPage extends PageBase {

    //mapping


    By criarNovoProjetoButton = By.xpath("//*[text()='Criar Novo Projeto']");

    By nomeProjetoField = By.xpath("//*[@id=\"project-name\"]");

    By descricaoProjetoField = By.xpath("//*[@id=\"project-description\"]");

    By adicionarProjetoButton = By.xpath("//*[@id=\"manage-project-create-form\"]//*[@class=\"btn btn-primary btn-white btn-round\"]");

    By messageProjetoCadastradoSucesso = By.xpath("//p[@class='bold bigger-110']");


    By projetoAlterar = By.xpath("//*[text()='Projeto Automação']");

    By projetoStatusBox = By.xpath("//*[@id='project-status']");

    By atualizarProjetoBotton = By.xpath("//input[@value='Atualizar Projeto']");

    By projetoAtualizadoText = By.xpath("//*[text()='release']");

    By alterarDescricaoProjetoField = By.xpath("//*[@id=\"project-description\"]");

    By descricaoProjetoAtualizadoText = By.xpath("//*[text()='Teste de alterar descricao projeto']");

    By apagarProjetoBotton = By.xpath("//*[@class=\"btn btn-primary btn-sm btn-white btn-round\"]");

    By confirmarApagarProjetoBotton = By.xpath("//*[@class=\"btn btn-primary btn-white btn-round\"]");

    By projetosField = By.xpath("//div[@id='main-container']//tbody");









    //Actions

    public void clicarNovoProjetoButton() {
        click(criarNovoProjetoButton);
    }

    public void preencherNomeProjeto(String nomeProjeto) {
        sendKeys(nomeProjetoField, nomeProjeto);
    }

    public void preencherDescricaoProjeto(String descricaoProjeto) {
        sendKeys(descricaoProjetoField, descricaoProjeto);
    }

    public void clicarAdicionarProjetoButton() {
        click(adicionarProjetoButton);
    }

    public String returnMensagemSucesso() {
        return getText(messageProjetoCadastradoSucesso);
    }

    public void clicarProjetoAlterar() {
        click(projetoAlterar);
    }


    public void alterarStatusProjeto(String status) {
        comboBoxSelectByVisibleText(projetoStatusBox, status);

    }

    public void clicarAtualizarProjeto(){click(atualizarProjetoBotton);}

    public String returnMensagemProjetoAtualizado() {
        return getText(projetoAtualizadoText);
    }

    public void alterarDescricaoProjeto(String descricao){clearAndSendKeys(alterarDescricaoProjetoField,descricao);}

    public String returnMensagemDescricaoProjetoAtualizado() {
        return getText(descricaoProjetoAtualizadoText);
    }

    public void apagarProjeto(){click(apagarProjetoBotton);}

    public void confirmarApagarProjeto(){click(confirmarApagarProjetoBotton);}

    public String retornarProjetoVazio() {
        return getText(projetosField);
    }
}
