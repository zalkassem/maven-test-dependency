package com.oreilly.jenkins;

public class MessageSource {

	private String message = "Hi from the message source.";

	public String getMessage() {
		if(message == "Hello"){
			System.out.println("something");
		}
		return message;
	}

}
