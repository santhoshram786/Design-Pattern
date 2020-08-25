package com.qa.restTest;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.api.TestBase;
import com.qa.restclient.restClient;
import com.qa.util.TestUtil;

public class getApiTest extends TestBase {

	public getApiTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	TestBase tb;
	restClient rc;
	String uri;
	CloseableHttpResponse c2;
	@BeforeMethod
	public void test_Without_Headers() throws IOException
	{
		tb=new TestBase();
		String url=prop.getProperty("url");
		String serviceurl=prop.getProperty("serviceurl");
		uri=url+serviceurl;
		
		
	}
	
	@Test(priority=1)
	public void H1() throws ClientProtocolException, IOException
	{
		rc=new restClient();
		//return closablehttpresponse 
		c2=rc.get(uri);
		
		// to get the status code
		
		int status_code=c2.getStatusLine().getStatusCode();
		System.out.println("Status code-->"+status_code);
		
		Assert.assertEquals(status_code, 200);
		
		
		//extract the json string
		//utf-8 is the charcter format
		
		String json_string=EntityUtils.toString(c2.getEntity(), "UTF-8"); 
		//convert json string to json object
		JSONObject js=new JSONObject(json_string);
		System.out.println("json object-->"+js);
		
		//TestUtil class having a static method we are calling with class name 
		//to validate json object
		
		String total=TestUtil.getValueByJPath(js, "/total");
		
		Assert.assertEquals(Integer.parseInt(total), 12);
		
		//to validate the json array
		String lastname=TestUtil.getValueByJPath(js, "/data[0]/last_name");
		
		Assert.assertEquals(lastname, "Bluth");
		
		//to extarct the headers use hashmaps
		
		//to get the header array
		
		Header[] h=c2.getAllHeaders();
		HashMap<String, String> m=new HashMap<String, String>();
		for(Header f:h)
		{
			m.put(f.getName(), f.getValue());
		}
		
		System.out.println("Header array-->"+m);
		
		
	}
	
	
	@Test(priority=2)
	public void H2() throws ClientProtocolException, IOException
	{
		rc=new restClient();
		//return closablehttpresponse 
		
		//to call te header method we have create the headers in key value pair
		
		HashMap<String, String >m1=new HashMap<String, String>();
		m1.put("Content-Type", "application/json");
		
		
		c2=rc.getheaders(uri, m1);
		
		// to get the status code
		
		int status_code=c2.getStatusLine().getStatusCode();
		System.out.println("Status code-->"+status_code);
		
		Assert.assertEquals(status_code, 200);
		
		
		//extract the json string
		//utf-8 is the charcter format
		
		String json_string=EntityUtils.toString(c2.getEntity(), "UTF-8"); 
		//convert json string to json object
		JSONObject js=new JSONObject(json_string);
		System.out.println("json object-->"+js);
		
		//TestUtil class having a static method we are calling with class name 
		//to validate json object
		
		String total=TestUtil.getValueByJPath(js, "/total");
		
		Assert.assertEquals(Integer.parseInt(total), 12);
		
		//to validate the json array
		String lastname=TestUtil.getValueByJPath(js, "/data[0]/last_name");
		
		Assert.assertEquals(lastname, "Bluth");
		
		//to extarct the headers use hashmaps
		
		//to get the header array
		
		Header[] h=c2.getAllHeaders();
		HashMap<String, String> m=new HashMap<String, String>();
		for(Header f:h)
		{
			m.put(f.getName(), f.getValue());
		}
		
		System.out.println("Header array-->"+m);
		
		
	}

}
