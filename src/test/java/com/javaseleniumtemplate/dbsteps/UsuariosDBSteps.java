package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class UsuariosDBSteps {

    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\InsertUsuario\\";

    public static void criarUsuarioDB() {
        String query = Utils.getFileContent(queriesPath + "UsuariosParaTeste.sql");
        DBUtils.executarUpdate(query);
    }
}
