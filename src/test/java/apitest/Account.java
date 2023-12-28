// 1 -  Pacote
package apitest;

import com.google.gson.Gson;
import entities.AccountEntity;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// 2 - Bibliotecas
// 3 - Classe
public class Account {
    // 3.1 - Atributos
    String userId;
    String ct = "application/json"; // contentType da API
    String jsonBody; // guardar o json que sera enviado
    String uri = "https://bookstore.toolsqa.com/Account/v1/"; // Endereco Base
    String token; // guardar o Token - autenticacao do usuario
    Response resposta; // guardar o retorno da API
    // 3.1.2 = instanciar classes Externas
    Gson gson = new Gson(); // Instancia o objeto de conversao classe para json

    // 3.2 - Metodos e Funcoes

    // Metodo 1 - Criar Usuario
    @Test(priority = 1)
    public void testCreateUser(){
        // Arrange - Configura
        AccountEntity account = new AccountEntity(); // Instancia a entidade usuario
        account.userName = "charlie1891"; // entrada e saida (resultado esperado)
        account.password = "P@ss0rd1";  // entrada

        jsonBody = gson.toJson(account);  // Converte a entidade usuario no formato json

        // Act - Executa

        // Dado - Quando - Entao
        // Given - When - Then
        resposta = (Response) given() // dado
                .contentType(ct)   // tipo do conteudo
                .log().all()                       // registre tudo na ida
                .body(jsonBody)                    // corpo da mensagem que sera enviada
        .when() // quando
                .post(uri + "User")

        // Assert - Valida
        .then() // entao
                .log().all()                    // registre tudo na volta
                .statusCode(201) // valide a comunicacao
                .body("username", is(account.userName)) // valida o usuario
                .extract()
        ; // fim da linha do REST - assured

        // extrair o userId (identificacao do usuario)

         userId = resposta.jsonPath().getString("userID");
        System.out.println("UserID extraido: " + userId);


    }   // fim do metodo de criacao de usuario

    @Test(priority = 2)
    public void testGenerateToken(){
        // Configura
        // --> Dados de Entrada sao fornecidos pela Account Entity
        // --> Resultado Esperado e que ele receba um token

        // Executa
        resposta = (Response) given()
                .contentType(ct)
                .log().all()
                .body(jsonBody)
        .when()
                .post(uri + "GenerateToken")
        .then()
                .log().all()
                .statusCode(200) // Valida a Comunicacao
                .body("status" is("Success")) // status = Sucesso
                .body("result", is ("User authorized successfully."))
        .extract()
        ;

        // Extracao do Token
        token = resposta.jsonPath().getString("token");
        System.out.println("token: " + token);

        // Valida
        Assert.assertTrue(token.length() !=0);
    } // fim do metodo de geracao de token de identificacao do usuario


}
