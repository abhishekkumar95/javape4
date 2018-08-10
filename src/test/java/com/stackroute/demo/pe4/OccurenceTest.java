package com.stackroute.demo.pe4;

import static org.junit.Assert.*;

import org.junit.Test;

public class OccurenceTest {
	Occurence oc=new Occurence();

	@Test
	public void func() {
		assertEquals(11,oc.func("java java again java is a java", (char) 11));
		assertNotEquals(11,oc.func("java", (char) 2));
		
		
		
	}
	
	

}
