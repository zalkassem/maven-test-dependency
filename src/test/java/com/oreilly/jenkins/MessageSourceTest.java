package com.oreilly.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageSourceTest{

	@Test
	public void test(){
		assertTrue(new MessageSource().getMessage().equals("Hi OReilly from the message source."));
		//fail("Not implemented");
	}
}