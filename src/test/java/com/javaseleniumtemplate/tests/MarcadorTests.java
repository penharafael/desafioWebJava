package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.MarcadorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MarcadorTests extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;

    MarcadorPage marcadorPage;

    @Test
    public void cadastrarMarcadorComSucesso(){

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        marcadorPage = new MarcadorPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nomeMarcador = "TesteMarcador";
        String descricaoMarcador = "TesteDescricaoMarcador";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarMarcadores();
        marcadorPage.clicarCriarMarcador();
        marcadorPage.preencherNomeMarcador(nomeMarcador);
        marcadorPage.preencherDescricaoMarcador(descricaoMarcador);
        marcadorPage.adicionarMarcador();

        Assert.assertEquals(nomeMarcador,marcadorPage.retornaMarcador());

    }

    @Test
    public void alterarMarcador(){

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        marcadorPage = new MarcadorPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String descricaoMarcador = "TesteAlterarDescricaoMarcador";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarMarcadores();
        marcadorPage.selecionarMarcadorParaAlterar();
        marcadorPage.clicarAtualizar();
        marcadorPage.preencherDescricaoMarcador(descricaoMarcador);
        marcadorPage.clicarAtualizar();

        Assert.assertEquals(descricaoMarcador,marcadorPage.retornaMarcadorAtualizado());


    }
}
