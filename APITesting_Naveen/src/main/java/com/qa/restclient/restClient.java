package com.qa.restclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class restClient {
	
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient c1=HttpClients.createDefault();
		HttpGet hget=new HttpGet(url);
		CloseableHttpResponse c2=c1.execute(hget);
		
		return c2;
		
	}
	
	public CloseableHttpResponse getheaders(String url,HashMap<String, String> m) throws ClientProtocolException, IOException
	{
		CloseableHttpClient c1=HttpClients.createDefault();
		HttpGet hget=new HttpGet(url);
		
		for(Map.Entry<String, String> entry:m.entrySet())
		{
			hget.addHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse c2=c1.execute(hget);
	
		return c2;
		
	}
	//create the post method
	
	public CloseableHttpResponse post(String url,String jsonpayload,HashMap<String, String> m) throws ClientProtocolException, IOException

	{
		CloseableHttpClient c1=HttpClients.createDefault();
		HttpPost hpost=new HttpPost(url);
		
		//to add the json payload use the below systax
		
		hpost.setEntity(new StringEntity(jsonpayload));
		
		//for headers
		
		for(Map.Entry<String, String> e:m.entrySet())
		{
			hpost.addHeader(e.getKey(), e.getValue());
		}
		
		CloseableHttpResponse c2=c1.execute(hpost);
		
		return c2;
	}
}
