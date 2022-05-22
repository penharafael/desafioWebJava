package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CadastroDeIncidencia extends TestBase {

    LoginPage loginPage;
    MainPage mainPage;
    BugReportPage bugReportPage;
    LoginFlows loginFlows;

    VerTarefasPage verTarefasPage;

    DetalhesTarefaPage detalhesTarefaPage;

    @Test
    public void CadastrarIncidenciaPrioridadeBaixa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "baixa";
        String atribuicao = "administrator";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaPrioridadeBaixa");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        Assert.assertEquals("Operação realizada com sucesso.",bugReportPage.returnMensagemSucesso());

    }

    @Test
    public void CadastrarIncidenciaPrioridadeNormal(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "normal";
        String atribuicao = "administrator";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaPrioridadeNormal");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        Assert.assertEquals("Operação realizada com sucesso.",bugReportPage.returnMensagemSucesso());

    }

    @Test
    public void CadastrarIncidenciaPrioridadeAlta(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "alta";
        String atribuicao = "administrator";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaPrioridadeAlta");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        Assert.assertEquals("Operação realizada com sucesso.",bugReportPage.returnMensagemSucesso());

    }

    @Test
    public void CadastrarIncidenciaPrioridadeUrgente(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "urgente";
        String atribuicao = "administrator";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaPrioridadeUrgente");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        Assert.assertEquals("Operação realizada com sucesso.",bugReportPage.returnMensagemSucesso());

    }

    @Test
    public void CadastrarIncidenciaPrioridadeImediato(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaPrioridadeImediato");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        Assert.assertEquals("Operação realizada com sucesso.",bugReportPage.returnMensagemSucesso());

    }

    @Test
    public void AlterarPrioridadeTarefa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();
        verTarefasPage = new VerTarefasPage();
        detalhesTarefaPage = new DetalhesTarefaPage();



        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";
        String statusNovo = "baixa";

        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaParaAlterar");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        mainPage.clicarVerTarefas();
        verTarefasPage.clicarTarefaAlterar();
        detalhesTarefaPage.clicarAtualizar();
        detalhesTarefaPage.selecionarStatus(statusNovo);
        detalhesTarefaPage.clicarAtualizarInformacao();





       Assert.assertEquals("baixa",detalhesTarefaPage.retornarPrioridade());

    }

/*
    @Test
    public void ApagarTarefa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();
        verTarefasPage = new VerTarefasPage();
        detalhesTarefaPage = new DetalhesTarefaPage();



        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";


        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaParaAlterar");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        mainPage.clicarVerTarefas();
        verTarefasPage.clicarTarefaAlterar();
        detalhesTarefaPage.clicarApagar();
        detalhesTarefaPage.clicarApagarTarefas();

        Assert.assertEquals("0 - 0 / 0",verTarefasPage.retornaTarefas());

    }

    @Test
    public void FecharTarefa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();
        verTarefasPage = new VerTarefasPage();
        detalhesTarefaPage = new DetalhesTarefaPage();



        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";


        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaParaAlterar");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        mainPage.clicarVerTarefas();
        verTarefasPage.clicarTarefaAlterar();
        detalhesTarefaPage.clicarFechar();
        detalhesTarefaPage.clicarFecharTarefa();



        Assert.assertEquals("fechado",detalhesTarefaPage.retornaSituacaoTarefa());

    }


    @Test
    public void marcarTarefaPegajosa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();
        verTarefasPage = new VerTarefasPage();
        detalhesTarefaPage = new DetalhesTarefaPage();



        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";


        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaParaAlterar");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        mainPage.clicarVerTarefas();
        verTarefasPage.clicarTarefaAlterar();
        detalhesTarefaPage.marcarTarefaComoPegajosa();


        Assert.assertNotNull(detalhesTarefaPage.bottonDesmarcarPegajosaVisible());

    }

    @Test
    public void monitorarTarefa(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();
        loginFlows = new LoginFlows();
        verTarefasPage = new VerTarefasPage();
        detalhesTarefaPage = new DetalhesTarefaPage();



        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String categoria = "[Todos os Projetos] Teste";
        String frequencia = "sempre";
        String gravidade = "trivial" ;
        String prioridade = "imediato";
        String atribuicao = "administrator";


        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarRelatarProblema();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.selecionarFrequencia(frequencia);
        bugReportPage.selecionarGravidade(gravidade);
        bugReportPage.selecionarPrioridade(prioridade);
        bugReportPage.selecionarAtribuicao(atribuicao);
        bugReportPage.preencherResumo("tarefaParaAlterar");
        bugReportPage.preencherDescricao("teste");
        bugReportPage.clicarEmSubmitReport();

        mainPage.clicarVerTarefas();
        verTarefasPage.clicarTarefaAlterar();
        detalhesTarefaPage.monitorarTarefa();


        Assert.assertNotNull(detalhesTarefaPage.pararDeMonitorarVisible());

    }*/
}
