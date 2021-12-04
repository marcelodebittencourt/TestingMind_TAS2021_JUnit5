![](https://github.com/marcelodebittencourt/TestingMind_TAS2021_JUnit5/workflows/tests/badge.svg)

# TestingMind TAS 2021 - Apresentação JUnit5
Este código foi gerado ao longo da apresentação do hands-on de JUnit 5 onde apresentei novas funcionalidades deste framework de testes unitários.

## Pré-requisitos
* [Java 11 SDK](https://www.oracle.com/java/technologies/downloads/#java11)
* [Maven](https://maven.apache.org/download.cgi) >= 3.8.3
* [Git](https://git-scm.com/) >= 2.33.0
* [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download) >= 2021.2

## O que está contido neste repositório
* Software-alvo dos testes é parte de um sistema de controle de hotel disponível nas pasta src > java.
* Testes deste software-alvo disponíveis na pasta "src" > "test" > "java" > "tests"
* Arquivo de massa de dados "clients.csv" disponível em "src" > "test" > "java" > "resources" para execução de teste parametrizado

## Como importar o projeto no IntelliJ IDEA
1. Clone este projeto em uma pasta em sua máquina local com o comando abaixo no CMD (Prompt de comando):

   git clone https://github.com/marcelodebittencourt/TestingMind_TAS2021_JUnit5.git

2. Será criada a subpasta do projeto a partir de sua pasta onde você rodou este comando. O projeto estará salvo nesta subpasta.
3. Abra a IDE IntelliJ IDEA
4. Se algum projeto abrir automaticamente, vá em "File" > "Close Project"
5. Na tela principal do IntelliJ IDEA, clique no botão "Open"
6. Navegue até a subpasta que contém o projeto que foi clonado
7. Clique no botão "OK"
8. O projeto será importado e aberto com sucesso no IntelliJ IDEA
9. Atualize as dependências localmente clicando com o botão direito no nome do projeto logo acima da lista de pastas e arquivos do projeto
10. No menu que aparece, selecione a opção "Maven" > "Reload Project". Role o menu para baixo caso necessário até aparecer a opção "Maven"
11. Aguarde por cerca de 1 minuto até que as dependências sejam baixadas localmente.

## Como rodar os testes no IntelliJ IDEA
1. Expanda o projeto, clicando no ícone ">" logo ao lado esquerdo projeto nome do projeto na guia Project
2. Expanda até que se possível visualizar a estrutura "src" > "test" > "java"
3. Para rodar todos os testes, clique com o botão direito no pacote "tests"
4. No menu de contexto que aparece, selecione a opção "Run 'Tests' in 'tests'"
5. Os resultados aparecerão na parte inferior da IDE
6. Se quiser rodar os testes para cada classe, basta repetir os passos 3 a 5, mas clicando em cada classe de teste dentro do pacote tests.

## Como rodar os testes via linha de comando
1. Abra o CMD (Prompt de comando)
2. Acesse a pasta onde encontra-se o projeto:

   cd\\{LOCAL_DA_PASTA}
3. Rode o comando:

   mvn clean test

### Como rodar os testes que tenham uma tag específica

Exemplo para rodar somente os testes que possuem a tag "Simple", ou seja, os testes marcados com '@Tag("Simple)':

mvn test -Dgroups=Simple

## Como gerar e visualizar relatórios de execução de teste via linha de comando
1. Abra o CMD (Prompt de comando)
2. Acesse a pasta onde encontra-se o projeto:

   cd\\{LOCAL_DA_PASTA}
3. Rode o comando:

   mvn surefire-report:report
4. Volte para o IntelliJ IDEA
5. Expanda o projeto até que apareça a pasta "target" > "site"
6. Clique com o botão direito no arquivo "surefire-report.html"
7. No menu de contexto que aparece selecione "Open In" > "Browser" > "Chrome".

## Contato do autor
https://marcelodebittencourt.com

## CI/CD suportados:
* [GitHub Action](https://github.com/marcelodebittencourt/TestingMind_TAS2021_JUnit5/blob/master/.github/workflows/test.yml): quando um push é realizado neste repositório do GitHub, os testes são automaticamente executados.