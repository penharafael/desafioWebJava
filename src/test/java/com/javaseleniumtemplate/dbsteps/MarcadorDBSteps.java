package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class MarcadorDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\InsertMarcador\\";

    public static void criarMarcadorDB() {
        String query = Utils.getFileContent(queriesPath + "insertMarcador.sql");
        DBUtils.executarUpdate(query);
    }
}