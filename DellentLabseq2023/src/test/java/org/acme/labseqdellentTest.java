package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
public class labseqdellentTest {

    @Test
    public void testObterValor() {
        given()
                .when().get("/labseq/10")
                .then()
                .statusCode(200)
                .body(is("33")); // O valor esperado para n=10

        given()
                .when().get("/labseq/-5")
                .then()
                .statusCode(200)
                .body(is("O valor de 'n' não pode ser negativo. Por favor, altere o valor."));
    }
}
