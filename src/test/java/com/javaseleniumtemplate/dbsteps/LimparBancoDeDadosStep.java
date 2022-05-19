package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.Utils;

public class LimparBancoDeDadosStep {


    private static String queriesPath = "C:\\Users\\rafae\\Documents\\desafioBase2\\src\\test\\java\\com\\javaseleniumtemplate\\queries\\LimparBancoDados\\";

    public static void limparDados() {
        /*
        categoryTable();
        customFieldTable();
        projectTable();
        */
        userTable();
        projectTable();
        bugTable();
        categoryTable();
        bugFileTable();
        bugHistoryTable();
        bugMonitorTable();
        bugNoteTable();
        bugNoteTextTable();
        bugRelationshipTable();
        bugRevisionTable();
        bugTable();
        bugTagTable();
        bugTextTable();
        customFieldTable();
        tagTable();
        emailTable();

    }

    private static void bugFileTable() {
        String query = Utils.getFileContent(queriesPath + "bugFileTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugHistoryTable() {
        String query = Utils.getFileContent(queriesPath + "bugHistoryTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugMonitorTable() {
        String query = Utils.getFileContent(queriesPath + "bugMonitorTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugNoteTable() {
        String query = Utils.getFileContent(queriesPath + "bugNoteTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugNoteTextTable() {
        String query = Utils.getFileContent(queriesPath + "bugNoteTextTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugRelationshipTable() {
        String query = Utils.getFileContent(queriesPath + "bugRelationshipTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugRevisionTable() {
        String query = Utils.getFileContent(queriesPath + "bugRevisionTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugTable() {
        String query = Utils.getFileContent(queriesPath + "bugTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugTagTable() {
        String query = Utils.getFileContent(queriesPath + "bugTagTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void bugTextTable() {
        String query = Utils.getFileContent(queriesPath + "bugTextTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void categoryTable() {
        String query = Utils.getFileContent(queriesPath + "categoryTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void customFieldTable() {
        String query = Utils.getFileContent(queriesPath + "customFieldTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void emailTable() {
        String query = Utils.getFileContent(queriesPath + "emailTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void projectTable() {
        String query = Utils.getFileContent(queriesPath + "projectTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void tagTable() {
        String query = Utils.getFileContent(queriesPath + "tagTable.sql");
        DBUtils.executarUpdate(query);
    }

    private static void userTable() {
        String query = Utils.getFileContent(queriesPath + "userTable.sql");
        DBUtils.executarUpdate(query);
    }
}