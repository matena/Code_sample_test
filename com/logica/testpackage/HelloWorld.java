package com.logica.testpackage;

import java.util.Locale;
import java.util.ResourceBundle;

class HelloWorld {  
	public static void main(String args[]) {
	
	String language;
	String country;

	if (args.length != 2) {
	    language = new String("en");
	    country = new String("US");
	} else {
	    language = new String(args[0]);
	    country = new String(args[1]);
	}

	Locale currentLocale;
	ResourceBundle messages;

	currentLocale = new Locale(language, country);

		
		ResourceBundle messages = ResourceBundle.getBundle(
			"com.logica.testpackage.languages.Messages", currentLocale);

		System.out.println(messages.getString("helloWorld"));
	}
}