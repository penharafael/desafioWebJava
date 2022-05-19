package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.ResumoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerResumoTest extends TestBase {

    LoginPage loginPage;
    MainPage mainPage;
    LoginFlows loginFlows;

    ResumoPage resumoPage;




    @Test
    public void VerificarPaginaDeResumo() {

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginFlows = new LoginFlows();
        resumoPage = new ResumoPage();


        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarVerResumo();

        Assert.assertEquals("Resumo", resumoPage.retornaTextoResumo());
    }
}
