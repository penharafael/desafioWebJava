package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CampoPersonalizadoPage;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CampoPersonalizadoTest extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;
    CampoPersonalizadoPage campoPersonalizadoPage;

    @Test
    public void apagarCampoPersonalizado() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastrado();
        campoPersonalizadoPage.clicarApagarCampoPersonalizado();
        campoPersonalizadoPage.confirmarApagarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoNumerico() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Numérico";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoPontoFlutuante() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Ponto-flutuante";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoEnumeracao() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Enumeração";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoEmail() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "E-Mail";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoCaixaDeMarcacao() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Caixa de Marcação";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoLista() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Lista";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoListaMultipla() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Lista de seleção múltipla";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoData() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Data";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoParaTipoBotaoDeSelecao() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String tipo = "Botão de seleção";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherTipo(tipo);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoValorPossivel() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String valor = "10";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherValorPossivel(valor);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoValorPadrao() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String valor = "10";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherValorPadrao(valor);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoExpressaoRegular() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String expressao = "10";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherExpressaoRegular(expressao);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoAcessoLeitura() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String acesso = "desenvolvedor";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherAcessoLeitura(acesso);
        campoPersonalizadoPage.preencherAcessoEscrita(acesso);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoAcessoEscrita() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String acesso = "desenvolvedor";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherAcessoLeitura(acesso);
        campoPersonalizadoPage.preencherAcessoEscrita(acesso);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }
    @Test
    public void alterarCampoPersonalizadoComprimentoMinimo() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String comprimento = "1";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherComprimentoMinimo(comprimento);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

    @Test
    public void alterarCampoPersonalizadoComprimentoMaximo() {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String comprimento = "10";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.clicarCampoPersonalizadoCadastradoAlterar();
        campoPersonalizadoPage.preencherComprimentoMaximo(comprimento);
        campoPersonalizadoPage.clicarAtualizarCampoPersonalizado();

        Assert.assertEquals("Operação realizada com sucesso.", campoPersonalizadoPage.returnMensagemSucesso());

    }

}