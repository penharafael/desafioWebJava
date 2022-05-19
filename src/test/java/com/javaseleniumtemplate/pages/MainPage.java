package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MainPage extends PageBase {
    //Mapping
    By informacoesUsuarioText = By.xpath("//*[@id=\"breadcrumbs\"]//*[text() = 'administrator']");
    By relatarProblema = By.xpath("//*[@id=\"sidebar\"]//a[contains(@href,'bug_report_page.php')]");

    By gerenciarBotton = By.xpath("//*[@class=\"menu-icon fa fa-gears\"]");

    By verTarefasBotton = By.xpath("//*[@class=\"menu-icon fa fa-list-alt\"]");

    By verResumoBotton = By.xpath("//*[@class=\"menu-icon fa fa-bar-chart-o\"]");

    By verPlanejamentoBotton = By.xpath("//*[@class=\"menu-icon fa fa-road\"]");



    //Actions
    public String retornaInformacoesUsuario(){
        return getText(informacoesUsuarioText);
    }
    public void clicarRelatarProblema() {click(relatarProblema);}

    public void clicarGerenciar(){
        click(gerenciarBotton);
    }

    public void clicarVerTarefas(){click(verTarefasBotton);}

    public void clicarVerResumo(){click(verResumoBotton);}

    public void clicarVerPlanejamento(){click(verPlanejamentoBotton);}



}
