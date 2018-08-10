package com.stackroute.demo.pe4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceTest {
	private static Replace rp;
	
	@Before
	public static void func1() {
		rp =new Replace();
		}

	@Test
	public void test() {
		assertEquals("faity fry",rp.func("daily dry"));
		assertNotEquals("daily dry",rp.func("daily dry"));
		
	}

}
