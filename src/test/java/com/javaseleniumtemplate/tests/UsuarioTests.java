package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.UsuarioPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsuarioTests extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;
    UsuarioPage usuarioPage;


    @Test
    public void criarUsuarioComSucesso() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "UsuarioTest";
        String nomeReal = "UsuarioRealTest";
        String email = "automacao@teste.com";
        String nivel = "gerente";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.clicarCriarConta();
        usuarioPage.preencherNomeUsuario(nome);
        usuarioPage.preencherNomeRealUsuario(nomeReal);
        usuarioPage.preencherEmailUsuario(email);
        usuarioPage.preencherNivelAcesso(nivel);
        usuarioPage.criarUsuario();
        Assert.assertEquals("Usuário " + nome + " criado com um nível de acesso de " + nivel, usuarioPage.returnMessageSucesso());
    }

    @Test
    public void cadastrarUsuarioEmailFalso() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "UsuarioSemEmailTest";
        String nomeReal = "UsuarioRealSemEmailTest";
        String email = "emailFalso";
        String nivel = "gerente";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.clicarCriarConta();
        usuarioPage.preencherNomeUsuario(nome);
        usuarioPage.preencherNomeRealUsuario(nomeReal);
        usuarioPage.preencherEmailUsuario(email);
        usuarioPage.preencherNivelAcesso(nivel);
        usuarioPage.criarUsuario();
        Assert.assertEquals("APPLICATION ERROR #1200", usuarioPage.returnMensagemError());
    }

    @Test
    public void cadastrarUsuarioEmailRepetido() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "UsuarioSemEmailRepetido";
        String nomeReal = "UsuarioRealEmailRepetido";
        String email = "root@localhost";
        String nivel = "gerente";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.clicarCriarConta();
        usuarioPage.preencherNomeUsuario(nome);
        usuarioPage.preencherNomeRealUsuario(nomeReal);
        usuarioPage.preencherEmailUsuario(email);
        usuarioPage.preencherNivelAcesso(nivel);
        usuarioPage.criarUsuario();
        Assert.assertEquals("APPLICATION ERROR #813", usuarioPage.returnMensagemError());
    }

    @Test
    public void criarUsuarioComNomeRepetido() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "administrator";
        String nomeReal = "UsuarioRepetidoTest";
        String email = "UsuarioRepetidoTest@teste.com";
        String nivel = "gerente";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.clicarCriarConta();
        usuarioPage.preencherNomeUsuario(nome);
        usuarioPage.preencherNomeRealUsuario(nomeReal);
        usuarioPage.preencherEmailUsuario(email);
        usuarioPage.preencherNivelAcesso(nivel);
        usuarioPage.criarUsuario();
        Assert.assertEquals("APPLICATION ERROR #800", usuarioPage.returnMensagemError());
    }


    @Test
    public void inativarUsuario() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testeinativarusuario";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.desabilitarUsuario();
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }

    @Test
    public void alterarNivelUsuario() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testemodificarnivelusuario";
        String nivel = "desenvolvedor";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.editarNivelAcesso(nivel);
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }


    @Test
    public void alterarNomeVerdadeiroUsuario() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testemodificarnomeverdadeirousuario";
        String novoNome = "testeNomeNovo";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.editarNomeRealUsuario(novoNome);
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }

    @Test
    public void alterarEmailUsuarioComSucesso() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testemudaremailusuario";
        String novoEmail = "novoemail@teste.com";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.editarEmail(novoEmail);
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }

    @Test
    public void alterarEmailInvalidoUsuario() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testemudaremailerradousuario";
        String novoEmail = "emailinvalid.com";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.editarEmail(novoEmail);
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("APPLICATION ERROR #1200", usuarioPage.returnMensagemError());

    }


    @Test
    public void alterarUsuarioProtegido() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testealterarusuarioprotegido";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.habilitarUsuarioProtegido();
        usuarioPage.atualizarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }

    @Test
    public void deletarUsuario() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        usuarioPage = new UsuarioPage();
        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nome = "testedeletarusuario";


        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarUsuarioButton();
        usuarioPage.selecionarUsuario(nome);
        usuarioPage.apagarUsuario();
        usuarioPage.confirmarApagarUsuario();

        Assert.assertEquals("Operação realizada com sucesso.", usuarioPage.returnMessageSucesso());

    }


}

