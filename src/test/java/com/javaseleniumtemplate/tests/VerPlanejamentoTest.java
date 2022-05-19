package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.PlanejamentoPage;
import com.javaseleniumtemplate.pages.ResumoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerPlanejamentoTest extends TestBase {
    LoginPage loginPage;
    MainPage mainPage;
    LoginFlows loginFlows;

    PlanejamentoPage planejamentoPage;


    @Test
    public void VerificarPaginaDePlanejamentoFuncionamento() {

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginFlows = new LoginFlows();
        planejamentoPage = new PlanejamentoPage();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarVerPlanejamento();

        Assert.assertEquals("Nenhum planejamento disponível. Apenas tarefas com a versão indicada aparecerão no planejamento.",planejamentoPage.retornaTextoPlanejamento() );
    }
}