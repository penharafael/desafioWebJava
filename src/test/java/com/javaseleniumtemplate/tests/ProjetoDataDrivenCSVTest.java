package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
import com.javaseleniumtemplate.pages.ProjetoPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjetoDataDrivenCSVTest extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;

    ProjetoPage projetoPage;

    @Test(dataProvider = "dataProjetoCSVProvider")
    public void criarProjetoComSucesso(String[] projeto) {
        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        projetoPage = new ProjetoPage();

        //Parameteres
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nomeProjeto = projeto[0];
        String descricaoProjeto = projeto[1];

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarProjetoButton();
        projetoPage.clicarNovoProjetoButton();
        projetoPage.preencherNomeProjeto(nomeProjeto);
        projetoPage.preencherDescricaoProjeto(descricaoProjeto);
        projetoPage.clicarAdicionarProjetoButton();

        Assert.assertEquals("Operação realizada com sucesso.",projetoPage.returnMensagemSucesso());

    }

    @DataProvider(name="dataProjetoCSVProvider")
    public Iterator<Object []> dataPetProvider2(){
        return csvProvider("src/test/java/projetoData.csv");
    }

    //Método para leitura do arquivo .csv
    public Iterator<Object []> csvProvider(String csvNamePath) {
        String line = "";
        String cvsSplitBy = ";";
        List<Object[]> testCases = new ArrayList<>();
        String[] data = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csvNamePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            data = line.split(cvsSplitBy);
            testCases.add(data);
        }
        return testCases.iterator();
    }
}
