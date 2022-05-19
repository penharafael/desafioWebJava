package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By entrarButton = By.xpath("//*[@class=\"width-40 pull-right btn btn-success btn-inverse bigger-110\"]");

    By measageErroText = By.xpath("//div[@class='alert alert-danger']");


    //Actions
    public void preenhcerUsuario(String usuario){
        SendKeysJavaScript(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        SendKeysJavaScript(passwordField, senha);
    }

    public void clicarEntrar(){
        ClickJavaScript(entrarButton);
    }

    public String returnMessageDeErro(){
        return getText(measageErroText);
    }


}
