/**
 * 
 */
package com.jcg.antdemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Chandan Singh
 *Used to test HelloWorld
 */
public class HelloWorldTest
{

		/**
		 * Test method for {@link com.jcg.antdemo.HelloWorld#add(int, int)}.
		 */
		@Test
		public void testAdd()
		{
				HelloWorld hw = new HelloWorld();
				assertEquals(5, hw.add(3, 2));
		}

}
