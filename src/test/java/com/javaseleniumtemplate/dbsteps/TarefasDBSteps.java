package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class TarefasDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\InserirTarefas\\";

    public static void criarTarefasDB() {
        String query = Utils.getFileContent(queriesPath + "TarefasParaTeste.sql");
        DBUtils.executarUpdate(query);
    }
}
