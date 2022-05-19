package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class GerenciarPage extends PageBase {

    //mapping

    By gerenciarProjetosButton = By.xpath("//*[text()='Gerenciar Projetos']");

    By gerenciarUsuario = By.xpath("//a[text()='Gerenciar Usuários']");

    By gerenciarCamposPersonalizados = By.xpath("//a[text()='Gerenciar Campos Personalizados']");

    By gerenciarMarcador = By.xpath("//a[text()='Gerenciar Marcadores']");


    //Actions

    public void clicarGerenciarProjetoButton() {click(gerenciarProjetosButton);}

    public void clicarGerenciarUsuarioButton() {click(gerenciarUsuario);}

    public void clicarGerenciarCamposPersonalizados(){click(gerenciarCamposPersonalizados);}

    public void clicarGerenciarMarcadores(){click(gerenciarMarcador);}
}
