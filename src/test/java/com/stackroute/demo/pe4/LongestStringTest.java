package com.stackroute.demo.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LongestStringTest {
	private static LongestString ls;
	@Before
	public static void func1() {
	LongestString ls=new LongestString();
	}
	@Test
	public void func() {
		assertEquals("abababaaaabababa",ls.func("aabbccabababaaaabababacbabccbcbcb"));
		
		
		assertNotEquals("aabbccabababaaaabababb",ls.func("aabbccabababaaaabababacbabccbcbcb"));
		
		
	}

}
