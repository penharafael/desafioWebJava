package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class PlanejamentoPage extends PageBase {

    //Mapping
    By planejamentoText = By.xpath("//*[@id=\"main-container\"]//*[@class=\"lead\"]");

    public String retornaTextoPlanejamento() {
        return getText(planejamentoText);
    }
}
