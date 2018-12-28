# Descrição da Atividade:

## Geral:
- Refazendo trabalho no Maven;
- Projeto recriado do zero;
- Criei uma pasta para colocar a parte teórica do trabalho (Parte Escrita):
  - Coloquei os arquivos em PDF;
  
## JUnit:
- Tentei fazer alguns testes unitários no projeto, consegui fazer eles funcionarem, porém não sei se estão feitos da maneira correta;
  
## Maven e Sonar:
- Dependências adicionadas ao Maven (JUnit);
- JavaDoc e SonarCoverge adicionados ao POM.xml;
- Comando "MVN COMPILE" executado com sucesso;
- Comando "MVN SITE" executado com sucesso;
- Comando "MVN SONAR:SONAR" executado com sucesso;
  - Erros apontados pelo SonarQube corrigidos;
  - Consegui atingir 62,5% de cobertura de código, mostrado pelo SonarQube;
  - **OBS: Coloquei o comando //NOSONAR ao lado de algumas linhas para o SonarQube ignorar os "System.out" e ignorar também duas palavras repetidas na classe de teste;**
  
## Jenkins:
- Builds do Jenkins (PROJECT-DEV-BUILD / PROJECT-DEV-SITE) concluídas com sucesso;
- Criei as seguintes pastas para os arquivos "config.xml" do Jenkins:
  - src/jenkins/jobs/project-dev-build
  - src/jenkins/jobs/project-dev-site
  
## Observações:
  - Inicialmente o SonarQube não estava reconhecendo a porcentagem de cobertura de código, mas após executar o comando "MVN CLEAN INSTALL SONAR:SONAR" o problema foi resolvido.
