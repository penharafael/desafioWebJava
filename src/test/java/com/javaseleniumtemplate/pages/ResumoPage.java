package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ResumoPage extends PageBase {

    //Mapping

    By resumoText = By.xpath("//*[@class=\"nav nav-tabs padding-18\"]//*[contains(@href,'/summary_page.php')]");

    //Actions

    public String retornaTextoResumo() {
        return getText(resumoText);
    }
}
