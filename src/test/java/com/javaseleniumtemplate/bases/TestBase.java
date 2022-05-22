package com.javaseleniumtemplate.bases;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.dbsteps.*;
import com.javaseleniumtemplate.utils.DriverFactory;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {
    @BeforeSuite
    public void beforeSuite(){
        new GlobalParameters();
        ExtentReportUtils.createReport();
    }

    @BeforeMethod
    public void beforeTest(Method method){
        ExtentReportUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
        DriverFactory.createInstance();
        DriverFactory.INSTANCE.manage().window().maximize();
        DriverFactory.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
       /* LimparBancoDeDadosStep.limparDados();
        UsuariosDBSteps.criarUsuarioDB();
        ProjetoDBSteps.criarProjetoDB();
        CategoriaDBSteps.criarCategoriasDB();
        CampoPersonalizadoDBSteps.criarCamposPersonalizadosDB();
        MarcadorDBSteps.criarMarcadorDB();*/
        //TarefasDBSteps.criarTarefasDB();
    }

    @AfterMethod
    public void afterTest(ITestResult result){
        ExtentReportUtils.addTestResult(result);
        DriverFactory.quitInstace();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentReportUtils.generateReport();
    }
}
