
[![Build Status](https://dev.azure.com/saymonoliveira/Templates%20Pipelines/_apis/build/status/Templates%20Pipelines-Maven-CI?branchName=headless)](https://dev.azure.com/saymonoliveira/Templates%20Pipelines/_build/latest?definitionId=2&branchName=headless)


## Automação

- Arquitetura Projeto
	- Linguagem	- [Java](https://www.java.com/pt-BR// "Java")
	- [Java Kit Development versão 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
	- Gestão de dependências - [Maven](https://maven.apache.org)
	- Framework de Testes automatizass web - [Selenium.WebDriver 3.141](https://www.seleniumhq.org/download/ "Selenium.WebDriver") 
	- Orquestrador de testes - [TestNG](https://testng.org/doc/ "TestNG")
	- Relatório de testes automatizados - [ExtentReports 4.0.9](http://www.extentreports.com/docs/versions/4/java/index.html "ExtentReports 4.0.9")

## Setup para executar o projeto

- Versão 1.8 do Java JDK instalada no computador (https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Versão community do IntelliJ IDEA instalada no computador (https://www.jetbrains.com/pt-br/idea/download/#section=windows)
- Última versão do Google Chrome instalada no computador (https://www.google.com/chrome/) - neste momento Google Chrome 86
- Baixar o projeto, construi-lo e acessar a pasta tests que estará o teste de exemplo.

## Arquitetura

**Premissas de uma boa arquitetura de automação de testes:**
*  Facilitar o desenvolvimento dos testes automatizados (reuso).
*  Facilitar a manutenção dos testes (refatoração).
*  Tornar o fluxo do teste o mais legível possível (fácil entendimento do que está sendo testado).

**Arquitetura padrão Base2**

Para facilitar o entendimento da arquitetura do projeto de testes automatizados, foi criado um fluxograma baseado nas features principais que envolvam a arquitetura conforme imagem abaixo:

![alt text](https://i.imgur.com/wexOWJF.png)



**Relatório de testes**

Após toda execução: sucesso ou falha, é gerado um relatório com cada passo realizado do teste. Está disponível na pasta do projeto "target/reports". Existe a possibilidade de tirar screenshots em cada passo ou somente em caso de falha. Verifique o arquivo globalParameteres.properties e coloque true ou false no parâmetro: get.screenshot.for.each.step.

Obs: a imagens possuem path dinâmico, basta zipar a pasta do relatório e enviar para o destinatário ou subir em algum bucket AWS para acessar que todos os dados estarão consistentes. 

![Reports](https://user-images.githubusercontent.com/18040044/169714414-2d2e67d0-b942-4875-b31b-a31e583ec324.png)



**1- Foi executado 50 casos de teste**

Arquivo responsável pela execução dos testes

```
testngsuite.xml
```

**2- Os casos de testes podem ser executados em 3 navegadores (Firefox, Google Chrome, Edge)utilizando o selenium grid**

![grid](https://user-images.githubusercontent.com/18040044/169714405-5be91a62-3d4f-45ff-8418-4bf02e40b166.png)


**3- Realizado o Data-Driven nas Classes 'CampoPersonalizadoCSVTest' e 'ProjetoDataDrivenCSVTest'**

**4- A classe de teste LoginTests utiliza Javascript para execução do teste**

**5- O teste foi agendado e executado no Azure Devops através do arquivo:**

```
azure-pipelines.xml
```
![Azure](https://user-images.githubusercontent.com/18040044/169714352-87f5b1db-41e3-47b0-915b-313660e6c2c3.png)![Azure2](https://user-images.githubusercontent.com/18040044/169714383-5375b4d9-7047-4132-9d2e-2289d0d0cb6e.png)

