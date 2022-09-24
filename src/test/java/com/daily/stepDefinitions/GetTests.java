package com.daily.stepDefinitions;

import com.daily.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetTests {

    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "https://apis.xbim-dev.net";

    }
    String accessToken = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkE4OEE5REE0MjE0MDM3RDJDODVDQzEyRTRBODhCQkM4MjBDRDAzNkQiLCJ4NXQiOiJxSXFkcENGQU45TElYTUV1U29pN3lDRE5BMjAiLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE2NjQwMTQxNjQsImV4cCI6MTY2NDAyNDk2NCwiaXNzIjoiaHR0cHM6Ly9pZC54YmltLm5ldCIsImF1ZCI6WyJhcGkiLCJjb21tcyIsIndvcmtmbG93cyJdLCJjbGllbnRfaWQiOiJyZWFkbWVpbyIsInN1YiI6IjdmZWFiZjY0LTNiM2EtNDdhYi05M2I5LTNmNmYzOWU1NjJlMCIsImF1dGhfdGltZSI6MTY2NDAxMzc3NywiaWRwIjoibG9jYWwiLCJlbWFpbCI6ImFyenVrbmV0QGdtYWlsLmNvbSIsIm5hbWUiOiJPemVyIEFyenUiLCJzY29wZSI6WyJvcGVuaWQiLCJwcm9maWxlIiwiYXBpLnJlYWQiLCJhcGkud3JpdGUiLCJjb21tcy5yZWFkIiwiY29tbXMud3JpdGUiLCJ3b3JrZmxvd3MucmVhZCIsIndvcmtmbG93cy53cml0ZSIsIndvcmtmbG93cy5leGVjdXRlIl0sImFtciI6WyJwd2QiXX0.PypJIfarbzC7ip5fIBHilCjMpVA1ZtPaqBdt2gl7F5cHwXzbTfGsNxFzHJBA974bHjCpJEADN5Sv-OlhTqy4PaMMl2CHG4KEMnGJwFvMMsPiXQb6esqogWetAMU-VfraThrz0YTjPo11SxWHNOpKPNsCCT_4yzqX3gr8GINQIbsdW-6FhdwjoPLJuebfAADpHfIGdZm3_2cxP3YIL3wmsYwnYFfWhJR4bNN0pzhM3Ll1L0HVggvXFvjmwlMl09M_kWLR5fi8aF69rhU7PocbuIipUpeS9Z5sYy8f-XqQ0gsK0AwwW04j_EkVurDOiHFgNAxVlIZ6b5P3PvlCYfDVcw";


    @DisplayName("1-Get info about yourself")
    @Test
    public void test1() {
        given().
                header("Authorization", accessToken)
                .and().accept(ContentType.JSON)
                .when()
                .get("/id/2.0/Me")
                .then()
                .statusCode(200)
                .log().all();

    }


    @DisplayName("2-Get list of your tenancies")
    @Test
    public void test2() {
        given().
                header("Authorization", accessToken)
                .and().accept(ContentType.JSON)
                .when()
                .get("/id/2.0/Tenants")
                .then()
                .statusCode(200)
                .log().all();

    }

    @DisplayName("6-Get list of Models for the Tenant")
    @Test
    public void test3() {
        given().
                header("Authorization", accessToken)
                .and().accept(ContentType.JSON)
                .when()
                .and().pathParam("region","sandbox")
                .and().pathParam("tenantId","d7b5dcfb-b98b-46f8-bdd5-bd6e80fc6716")
                .get("{region}/aim/2.0/{tenantId}/Models")
                .then()
                .statusCode(200)
                .log().all();

    }


}

