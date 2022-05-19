package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class ProjetoDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\Inserirprojeto\\";

    public static void criarProjetoDB() {
        String query = Utils.getFileContent(queriesPath + "inserirProjeto.sql");
        DBUtils.executarUpdate(query);
    }
}
