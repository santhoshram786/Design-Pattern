package com.qa.restTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.api.TestBase;
import com.qa.data.Users;
import com.qa.restclient.restClient;

public class postApiTest extends TestBase{

	public postApiTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	TestBase tb;
	restClient rc;
	String uri;
	CloseableHttpResponse c2;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		tb=new TestBase();
		String url=prop.getProperty("url");
		String serviceurl=prop.getProperty("serviceurl");
		uri=url+serviceurl;
		
		
	}
	
	@Test
	public void postapiTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		rc=new restClient();
		HashMap<String, String> j=new HashMap<String, String>();
		j.put("Content-Type", "application/json");
		
		//now we have to convert pojo(java obj to json) using Jackson API.This is called Marshaling 
		
		ObjectMapper om=new ObjectMapper();
		
		
		Users u=new Users("morpheus","leader");
		
		//convert obj to json using writeValue method
		
		om.writeValue(new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\util\\users.json"), u);
		
		//convert json obj to json string
		
		String jstr=om.writeValueAsString(u);
		
		System.out.println("payload json string-->"+jstr);
		
		
		c2=rc.post(uri, jstr, j);
		
		//check the status code
		
		int status_code=c2.getStatusLine().getStatusCode();
		System.out.println("Status code-->"+status_code);
		
		Assert.assertEquals(status_code, 201);
		
		//check the json 
		
		String k=EntityUtils.toString(c2.getEntity(), "UTF-8");
		
		JSONObject jo=new JSONObject(k);
		System.out.println("json object-->"+jo);
		
		//convert json obj to obj using readvalue method.This is called Unmarshelling
		
		//this is done because we have validate the created obj with the input obj
		
		
		Users userobj=om.readValue(k,Users.class);
		
		System.out.println(userobj);
		
		Assert.assertEquals(userobj.getName(),u.getName());
		
		
		Assert.assertEquals(userobj.getJob(), u.getJob());
		

		
	}

}
