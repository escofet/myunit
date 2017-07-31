package com.conferor;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DummyClass {
	public List<String> bookTitles = new ArrayList<>();
	
	public DummyClass() {
		bookTitles.add("1984");
		bookTitles.add("Hamlet");
		bookTitles.add("Draacula");
	}
	
	public boolean containsTitle(String title) {
		return bookTitles.contains(title);
	}
	
	public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		StringWriter writer = new StringWriter();
		mapper.writeValue(writer, bookTitles);
		return writer.toString();
	}
}
