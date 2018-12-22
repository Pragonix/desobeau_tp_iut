package fr.iut.tp.maven.one;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsontoJava {

	@Test
	public void testAddress() throws JsonParseException, JsonMappingException, IOException {
		//Given
		ObjectMapper objMap = new ObjectMapper();
		Address addr = new Address();
		Address jsonToAddr;
		String jsonAddr = "{\"number\":8,\"street\":\"rue de Paris\",\"zipCode\":77970}";
		//When
		jsonToAddr = objMap.readValue(jsonAddr, Address.class);
		//Then
		assertEquals(addr, jsonToAddr);
	}
	@Test
	public void testPersonne() throws JsonParseException, JsonMappingException, IOException {
		//Given
		ObjectMapper objMap = new ObjectMapper();
		Person perso = new Person();
		String jsonPerso = "{\"name\":\"Philipe\",\"age\":25,\"residenceAddress\":{\"number\":8,\"street\":\"rue de Paris\",\"zipCode\":77970}}";;
		Person jsonToPerso;
		//When
		jsonToPerso = objMap.readValue(jsonPerso, Person.class);
		//Then
		assertEquals(perso, jsonToPerso);
	}

}
