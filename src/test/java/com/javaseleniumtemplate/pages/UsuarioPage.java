package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class UsuarioPage extends PageBase {

//mapping
    By criarNovaConta = By.xpath("//a[text()='Criar nova conta']");
    By userNameField = By.xpath("//*[@id=\"user-username\"]");
    By userRealNameField = By.xpath("//*[@id=\"user-realname\"]");
    By userEmailField = By.xpath("//*[@id=\"email-field\"]");
    By userNivelAccessBox = By.xpath("//*[@id=\"user-access-level\"]");

    By adicionarUsuario = By.xpath("//*[@class=\"btn btn-primary btn-white btn-round\"]");

    By mensagemSucesso = By.xpath("//p[@class='bold bigger-110']");

    By mensagemError = By.xpath("//p[@class='bold']");

    By usuarioTesteInativarUsuario = By.xpath("//*[text()=\"testeinativarusuario\"]");

    By checkBoxHabilitado = By.xpath("//form[@id='edit-user-form']//span[@class='lbl']");

    By atualizarUsuarioBooton = By.xpath("//form[@id='edit-user-form']//*[@class='btn btn-primary btn-white btn-round']");

    By userNivelAccessBoxEdit = By.xpath("//*[@id=\"edit-access-level\"]");

    By userRealNameEditField = By.xpath("//*[@id=\"edit-realname\"]");

    By protegidoBox = By.xpath("//*[@id=\"edit-user-form\"]/div/div[2]/div[1]/div/div/table/tbody/tr[6]/td[2]/label/span");

    By apagarUsuarioBotton = By.xpath("//*[@id=\"manage-user-delete-form\"]//*[@class='btn btn-primary btn-white btn-round']");

    By confirmacaoApagarUsuarioBotton = By.xpath("//*[@class='btn btn-primary btn-white btn-round']");








    //Actions

    public void clicarCriarConta(){click(criarNovaConta);}

    public void preencherNomeUsuario(String nome){sendKeys(userNameField,nome);}


    public void preencherNomeRealUsuario(String nomeReal){sendKeys(userRealNameField,nomeReal);}

    public void editarNomeRealUsuario(String nomeRealEdit){sendKeys(userRealNameEditField,nomeRealEdit);}

    public void preencherEmailUsuario(String email){sendKeys(userEmailField,email);}

    public void preencherNivelAcesso(String nivelAcesso){
        comboBoxSelectByVisibleText(userNivelAccessBox,nivelAcesso);

    }

    public void criarUsuario(){click(adicionarUsuario);}

    public String returnMessageSucesso() {
        return getText(mensagemSucesso);
    }

    public String returnMensagemError() {
        return getText(mensagemError);
    }

    public void selecionarUsuario(String usuario) {
        click(By.xpath("//a[text()='" + usuario + "']"));
    }

    public void desabilitarUsuario(){click(checkBoxHabilitado);}

    public void habilitarUsuarioProtegido(){click(protegidoBox);}

    public void atualizarUsuario(){click(atualizarUsuarioBooton);}

    public void editarNivelAcesso(String editNivelAcesso){
        comboBoxSelectByVisibleText(userNivelAccessBoxEdit,editNivelAcesso);
    }

    public void editarEmail(String editEmail){sendKeys(userEmailField,editEmail);}

    public void apagarUsuario(){click(apagarUsuarioBotton);}

    public void confirmarApagarUsuario(){click(confirmacaoApagarUsuarioBotton);}

}
