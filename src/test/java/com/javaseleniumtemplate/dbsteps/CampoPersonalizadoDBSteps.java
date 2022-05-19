package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class CampoPersonalizadoDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\InsertCampoPersonalizado\\";

    public static void criarCamposPersonalizadosDB() {
        String query = Utils.getFileContent(queriesPath + "CampoPersonalizadoParaTeste.sql");
        DBUtils.executarUpdate(query);
    }
}
