package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class VerTarefasPage extends PageBase {


    //Mapping
    By tarefaAlterar = By.xpath("//*[text() = '0000001']");
    By tarefas = By.xpath("//*[@id=\"bug_action\"]//*[@class='badge']");




    //Actions
    public void clicarTarefaAlterar(){click(tarefaAlterar);}

    public String retornaTarefas() {
        return getText(tarefas);
    }
}
