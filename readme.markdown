# Projeto Meios de Pagamento

O projeto meios de pagamento oferece um método de pagamento utilizando várias formas de pagamento e permite combinar essas formas para realizar o pagamento de um produto ou serviço.

### 1. Configuração:

Esse projeto utiliza o Lombok para reduzir a quantidade de código, tornando-o menos verboso.

Para configurar o Lombok no Eclipse siga os passos abaixo:

* Baixar o jar em https://projectlombok.org/downloads/lombok.jar
* Fechar o Eclipse
* Executar o jar do Lombok: java -jar lombok.jar
* Informar o local onde está o eclipse
* Seguir o wizard para instalar o Lombok no eclipse
* Abrir o Eclipse
* Rebuild do seu projeto

Mais informações podem ser obtidas nos links abaixo:

* [https://projectlombok.org/setup/eclipse](https://projectlombok.org/setup/eclipse)
* [https://projectlombok.org/features/Data](https://projectlombok.org/features/Data)

### 2. Execução:

* O projeto utiliza Spring Boot, logo, basta instalar no Eclipse, pelo Eclipse Marketplace, o "Spring Boot" e o "Spring Tolls".
* Depois vá até "Window >> Show View >> Other >> Other >> Boot Dashboard" e clique no botão para executar o projeto.

### 3. Banco de Dados:

* O projeto está utilizando o H2, que é um banco relacional embarcado e está configurado para rodar em memória apenas.
* Você pode acessar o banco pelo browser após executar a aplicação e ver as tabelas criadas, assim como seus conteúdos.
* Para isso, acesso o endereço [http://localhost:8081/h2console/](http://localhost:8081/h2console/) e forneça os seguintes dados:

```
	JDBC URL: jdbc:h2:mem:testdb
	User Name: sa
	Password: password
```

### 4. Testes:

* Os testes estão sendo executados quando a aplicação sobe e populando o banco de dados.
* O resultado pode ser visto no log do console.


### 5. Acesso:

* A aplicação está rodando na porta 8081 e pode ser acessada pelo endereço [http://localhost:8081/](http://localhost:8081/)

