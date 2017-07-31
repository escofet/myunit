package com.conferor.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.conferor.DummyClass;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TestDummy {
	DummyClass dc = new DummyClass();
	static String refArray;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		refArray = "[\"1984\",\"Hamlet\",\"Dracula\"]";
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		refArray = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContainsTitle() {
		assertTrue(dc.containsTitle("Dracula"));
	}

	@Test
	public void testToJson() throws JsonGenerationException, JsonMappingException, IOException {
		assertEquals(refArray, dc.toJson());
	}

}
