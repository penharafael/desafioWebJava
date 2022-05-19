package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MarcadorPage extends PageBase {

    //Mapping

    By criarMarcadorButton = By.xpath("//*[@class='btn btn-primary btn-white btn-round btn-sm']");

    By nomeMarcador = By.xpath("//*[@class='input-sm']");

    By descricaoMarcador = By.xpath("//*[@class='form-control']");

    By adicionarMarcadorBotton = By.xpath("//*[@class='btn btn-primary btn-sm btn-white btn-round']");

    By retornarMarcadorField = By.xpath("//a[text()='TesteMarcador']");

    By marcadorApagar = By.xpath("//a[text()='Marcador teste apagar']");

    By atualizarBotton = By.xpath("//input[@value='Atualizar Marcador']");

    By retornaMarcadorAtualizado = By.xpath("//*[text()='TesteAlterarDescricaoMarcador']");






    //Action

    public void clicarCriarMarcador(){click(criarMarcadorButton);}

    public void preencherNomeMarcador(String nome){SendKeysJavaScript(nomeMarcador,nome);}

    public void preencherDescricaoMarcador(String descricao){SendKeysJavaScript(descricaoMarcador,descricao);}

    public void adicionarMarcador(){click(adicionarMarcadorBotton);}

    public String retornaMarcador(){
        return getText(retornarMarcadorField);
    }

    public void selecionarMarcadorParaAlterar(){click(marcadorApagar);}

    public void clicarAtualizar(){click(atualizarBotton);}

    public String retornaMarcadorAtualizado(){
        return getText(retornaMarcadorAtualizado);
    }







}
