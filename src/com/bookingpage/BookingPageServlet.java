package com.bookingpage;

import java.io.IOException;
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

import groovy.ui.SystemOutputInterceptor;

import org.springframework.web.servlet.DispatcherServlet;


@Controller
public class BookingPageServlet  {

	
	@RequestMapping(value = "/getDetails" , method = RequestMethod.POST)
	public String getDetails(@RequestBody String companyKey) throws JSONException{
		
		JSONObject json = new JSONObject(companyKey);
		System.out.println("the value of the company key is " + companyKey + "the json value is" + json);
		return "";
	}
	
}