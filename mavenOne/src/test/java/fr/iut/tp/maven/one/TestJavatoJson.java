package fr.iut.tp.maven.one;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavatoJson {

	@Test
	public void testAddress() throws JsonProcessingException {
		//Given
		ObjectMapper objMap = new ObjectMapper();
		Address addr = new Address();
		String jsonAddr = "{\"number\":8,\"street\":\"rue de Paris\",\"zipCode\":77970}";
		String conversion ;
		//When
		conversion = objMap.writeValueAsString(addr);
		//Then
		assertEquals(jsonAddr, conversion );
	}
	@Test
	public void testPersonne() throws JsonProcessingException {
		//Given
		ObjectMapper objMap = new ObjectMapper();
		Person perso = new Person();
		String jsonPerso = "{\"name\":\"Philipe\",\"age\":25,\"residenceAddress\":{\"number\":8,\"street\":\"rue de Paris\",\"zipCode\":77970}}";
		String conversion ;
		//When
		conversion = objMap.writeValueAsString(perso)  ;
		//Then
		assertEquals(jsonPerso, conversion);
	}

}
