package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class CategoriaDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\InserirCategorias\\";

    public static void criarCategoriasDB() {
        String query = Utils.getFileContent(queriesPath + "inserirCategoria.sql");
        DBUtils.executarUpdate(query);
    }
}
