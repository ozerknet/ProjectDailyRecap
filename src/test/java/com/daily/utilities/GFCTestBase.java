package com.daily.utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class GFCTestBase {

    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "https://token-account-manager.test.finspire.tech";

        String dbUrl = "jdbc:mariadb://maria.test.finspire.tech";
        String dbUsername = "finspire_user";
        String dbPassword = "beniYakmaKendini357YakHerseyiYak!!!!";

        DBUtils.createConnection(dbUrl,dbUsername,dbPassword);
    }

    @AfterAll
    public static void teardown(){

        DBUtils.destroy();
    }
}
