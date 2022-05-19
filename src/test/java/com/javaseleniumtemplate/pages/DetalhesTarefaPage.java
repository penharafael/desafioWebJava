package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class DetalhesTarefaPage extends PageBase {

    //mapping
    By atualizarBotton = By.xpath("//*[@class=\"pull-left padding-right-8\"]//*[@class=\"btn btn-primary btn-sm btn-white btn-round\"]");

    By statusBox = By.xpath("//*[@id=\"priority\"]");

    By atualizarInformacaoBotton = By.xpath("//*[@class=\"btn btn-primary btn-white btn-round\"]");

    By prioridadeDetalheTarefa = By.xpath("//*[@class=\"bug-priority\"]");

    By apagarBotton = By.xpath("//input[@value='Apagar']");

    By apagarTarefasBotton = By.xpath("//input[@value='Apagar Tarefas']");

    By fecharBotton = By.xpath("//input[@value='Fechar']");

    By fecharTarefaBotton = By.xpath("//input[@value='Fechar Tarefa']");

    By situacaoTarefa = By.xpath("//*[text()=' fechado']");

    By tarefaPegajosaBotton = By.xpath("//input[@value='Marcar como Pegajoso']");

    By tarefaPegajosaBotton2 = By.xpath("//input[@value='Desmarcar como Pegajoso']");

    By monitorarBotton = By.xpath("//input[@value='Monitorar']");

    By pararMonitorarBotton = By.xpath("//input[@value='Parar de Monitorar']");






    //Actions

    public void clicarAtualizar(){click(atualizarBotton);}

    public void selecionarStatus(String status){comboBoxSelectByVisibleText(statusBox,status);}

    public void clicarAtualizarInformacao(){click(atualizarInformacaoBotton);}

    public String retornarPrioridade() {
        return getText(prioridadeDetalheTarefa);
    }

    public void clicarApagar(){click(apagarBotton);}

    public void clicarApagarTarefas(){click(apagarTarefasBotton);}

    public void clicarFechar(){click(fecharBotton);}

    public void clicarFecharTarefa(){click(fecharTarefaBotton);}

    public String retornaSituacaoTarefa(){return getText(situacaoTarefa);}

    public void marcarTarefaComoPegajosa(){click(tarefaPegajosaBotton);}

    public String bottonDesmarcarPegajosaVisible(){
        return getText(tarefaPegajosaBotton2);
    }

    public void monitorarTarefa(){click(monitorarBotton);}

    public String pararDeMonitorarVisible(){
        return getText(pararMonitorarBotton);
    }

}
