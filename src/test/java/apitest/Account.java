// 1 -  Pacote
package apitest;

import com.google.gson.Gson;
import entities.AccountEntity;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

// 2 - Bibliotecas
// 3 - Classe
public class Account {
    // 3.1 - Atributos
    String userId;
    // 3.1.2 = instanciar classes Externas
    Gson gson = new Gson(); // Instancia o objeto de conversao classe para json

    // 3.2 - Metodos e Funcoes

    // Metodo 1 - Criar Usuario
    @Test
    public void testCreateUser(){
        // Arrange - Configura
        AccountEntity account = new AccountEntity(); // Instancia a entidade usuario
        account.userName = "charlie18997"; // entrada e saida (resultado esperado)
        account.password = "P@ss0rd1";  // entrada

        String jsonBody = gson.toJson(account);  // Converte a entidade usuario no formato json

        // Act - Executa

        // Dado - Quando - Entao
        // Given - When - Then
        Response resposta = (Response) given() // dado
                .contentType("application/json")   // tipo do conteudo
                .log().all()                       // registre tudo na ida
                .body(jsonBody)                    // corpo da mensagem que sera enviada
        .when() // quando
                .post("https://bookstore.toolsqa.com/Account/v1/User")

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

    public void testGenerateToken(){
        // configura

        // executa

        // valida

    } // fim do metodo de geracao de token de identificacao do usuario


}
