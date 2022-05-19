package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CampoPersonalizadoPage;
import com.javaseleniumtemplate.pages.GerenciarPage;
import com.javaseleniumtemplate.pages.MainPage;
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

public class CampoPersonalizadoCSVTest extends TestBase {

    LoginFlows loginFlows;
    MainPage mainPage;
    GerenciarPage gerenciarPage;

    CampoPersonalizadoPage campoPersonalizadoPage;

    @Test(dataProvider = "dataCampoPersonalizadoCSVProvider")
    public void criarCampoPersonalizadoComSucesso(String []campoPersonalizado) {

        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        gerenciarPage = new GerenciarPage();
        campoPersonalizadoPage = new CampoPersonalizadoPage();

        //Parametros
        String usuario = "administrator";
        String senha = "Opr@15928";
        String nomeCampoPersonalizado = campoPersonalizado[0];

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        mainPage.clicarGerenciar();
        gerenciarPage.clicarGerenciarCamposPersonalizados();
        campoPersonalizadoPage.preencherCampoPersonalizado(nomeCampoPersonalizado);
        campoPersonalizadoPage.clicarNovoCampo();

        Assert.assertEquals("Operação realizada com sucesso.",campoPersonalizadoPage.returnMensagemSucesso());


    }
    @DataProvider(name="dataCampoPersonalizadoCSVProvider")
    public Iterator<Object []> dataPetProvider2(){
        return csvProvider("src/test/java/campoPersonalizadoData.csv");
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
