package org.com.jsonDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;

public class ReadFromJSON {
	public void fetchSingleValue() throws IOException, ParseException {
		FileReader reader = new FileReader(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\JSON\\Test.json"));
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObj = (JSONObject) object;
		System.out.println("=============Single key and  Value===========");
		String empName = jsonObj.get("name").toString();
		String empDesg = jsonObj.get("desg").toString();
		String empCompany = jsonObj.get("company").toString();
		System.out.println("Employee Name--------->"+ empName+"\nEmployee Desgination-->"+empDesg
				+"\nEmployee Company------>"+empCompany);

	}

	public void fetchMultipleValue() throws IOException, ParseException {
		FileReader reader = new FileReader(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\JSON\\MultipleValue.json"));
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObj = (JSONObject)object;
		JSONArray jsonArray = (JSONArray) jsonObj.get("employee");
		System.out.println("==========Single key &Multiple Value===========");
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject eachObj = (JSONObject)jsonArray.get(i);
			String fName = eachObj.get("firstname").toString();
			String lName = eachObj.get("lastName").toString();
			System.out.println("FirstName-->" + fName+"\nLastName--->" + lName);
		}

	}

	public static void main(String[] args) throws IOException, ParseException {
		ReadFromJSON json = new ReadFromJSON();
		json.fetchSingleValue();
		json.fetchMultipleValue();

	}

}
