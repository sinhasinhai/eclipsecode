package com.example.text;

import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Parsing JSON object & JSON array
 * ref: https://www.testingexcellence.com/how-to-parse-json-in-java/
 */
public class ParseJson {

	static String json = "{\"responseStatus\":\"SUCCESS\",\"responseDetails\":{\"limit\":1000,\"offset\":0,\"size\":2,\"total\":2},\"data\":[{\"id\":1814,\"sdl_translation__c\":[\"V1B000000001G01\"]},{\"id\":1813,\"sdl_translation__c\":[\"V1B000000001G01\"]}]}";
	
	public static void main(String[] args) {

		JSONObject obj = new JSONObject(json);
		
        if("SUCCESS".equalsIgnoreCase(obj.getString("responseStatus"))) {
        	
        	int total = obj.getJSONObject("responseDetails").getInt("total");
        	
        	JSONArray arrData = obj.getJSONArray("data");
        	
        	for(int i=0; i < total; i++) {
        		System.out.println("#"+(i+1)+"\tDoc id: "+arrData.getJSONObject(i).getInt("id"));
        	}
        	
        }
		
	}

}
