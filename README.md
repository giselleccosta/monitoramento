Para inicializar e executar o projeto, siga os passos abaixo:

Passo 1: Preparar o Ambiente de Desenvolvimento
Requisitos básicos:
- Java JDK
- Maven

Passo 2: Clonar o Repositório
git clone https://github.com/giselleccosta/monitoramento.git

Passo 3: Configuração do Banco de Dados
Configure as variáveis corretas, como URL do banco de dados, usuário e senha em src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=usuario
spring.datasource.password=senha

Passo 4: Compilar o Projeto
No terminal, dentro da pasta do projeto, execute:
mvn clean install
Isso vai baixar todas as dependências e compilar o projeto.

Passo 5: Execute o projeto com o comando:
mvn clean package
O arquivo .jar será gerado na pasta target/ .
Execute o arquivo .jar:
java -jar target/seu-projeto.jar
