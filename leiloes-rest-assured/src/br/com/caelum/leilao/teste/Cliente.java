package br.com.caelum.leilao.teste;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class Cliente {

	@Test
	public void get_method_with_content() {
		System.out.println(RestAssured.given().when().get("https://viacep.com.br/ws/04445140/json/").body().asString());
	}
	
}
