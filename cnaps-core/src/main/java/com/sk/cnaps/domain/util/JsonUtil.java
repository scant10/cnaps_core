package com.sk.cnaps.domain.util;

import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private JsonUtil() {
		throw new IllegalStateException("Utility class");
	}
	
	public static String removeElement(String jsonStr, String[] removeElements) {
		if(jsonStr == null || jsonStr.isEmpty()) {
			return null;
		}
		
		JSONObject object = new JSONObject(jsonStr);
		for(String key : removeElements) {
			object.remove(key);
		}
		
		return object.toString();		
	}
	
	public static <T> T fromJsonStr(String jsonStr, Class<T> clazz) {
		if(jsonStr == null || jsonStr.isEmpty()) {
			return null;
		}
		
		ObjectMapper mapper = new ObjectMapper();
		try {
		
			return mapper.readValue(jsonStr, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String toJsonStr(Object obj) {
		if(obj == null) return null;
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;	
	}
}
