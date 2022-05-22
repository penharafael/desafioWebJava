package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.dbsteps.UsuariosDBSteps;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.utils.DriverFactory;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MainPage mainPage;

    //Tests
    @Test
    public void efetuarLoginComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";

        //Test

        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();


        Assert.assertEquals(usuario, mainPage.retornaInformacoesUsuario());

    }

    @Test
    public void efetuarLoginUsuarioInvalido() {
        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "teste001";
        String senha = "Opr@15928";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                "nome de usuário e a senha que você digitou não estão corretos.", loginPage.returnMessageDeErro());

}

    @Test
    public void efetuarLoginComSenhaInvalida() {
        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "senhaincorreta";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();

        Assert.assertEquals("Sua conta pode estar desativada ou bloqueada ou o " +
                "nome de usuário e a senha que você digitou não estão corretos.", loginPage.returnMessageDeErro());
    }
//teste

    @Test
    public void efetuarLoginComSucesso1(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";

        //Test

        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();


        Assert.assertEquals(usuario, mainPage.retornaInformacoesUsuario());

    }

    @Test
    public void efetuarLoginComSucesso2(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";

        //Test

        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();


        Assert.assertEquals(usuario, mainPage.retornaInformacoesUsuario());

    }

    @Test
    public void efetuarLoginComSucesso3(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";

        //Test

        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEntrar();


        Assert.assertEquals(usuario, mainPage.retornaInformacoesUsuario());

    }
}