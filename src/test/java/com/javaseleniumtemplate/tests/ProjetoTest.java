package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.ProjetoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjetoTest extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;
    ProjetoPage projetoPage;


    @Test
    public void alterarEstadoProjeto(){


        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        projetoPage = new ProjetoPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String status = "release";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarProjetoButton();
        projetoPage.clicarProjetoAlterar();
        projetoPage.alterarStatusProjeto(status);
        projetoPage.clicarAtualizarProjeto();

        Assert.assertEquals("release",projetoPage.returnMensagemProjetoAtualizado());
    }

    @Test
    public void alterarDescricaoProjeto(){


        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        projetoPage = new ProjetoPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String descricao = "Teste de alterar descricao projeto";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarProjetoButton();
        projetoPage.clicarProjetoAlterar();
        projetoPage.alterarDescricaoProjeto(descricao);
        projetoPage.clicarAtualizarProjeto();

        Assert.assertEquals(descricao,projetoPage.returnMensagemDescricaoProjetoAtualizado());
    }

    @Test
    public void excluirProjeto(){


        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        projetoPage = new ProjetoPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String projetos = "projeto001 desenvolvimento público descricao001\n" +
                "projeto002 desenvolvimento público descricao002\n" +
                "projeto003 desenvolvimento público descricao003\n" +
                "projeto004 desenvolvimento público descricao004\n" +
                "projeto005 desenvolvimento público descricao005";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarProjetoButton();
        projetoPage.clicarProjetoAlterar();
        projetoPage.apagarProjeto();
        projetoPage.confirmarApagarProjeto();


        Assert.assertEquals(projetos,projetoPage.retornarProjetoVazio());
    }
}
