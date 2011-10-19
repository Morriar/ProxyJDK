/*
 * @test
 * @summary reflect test
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */

package TMPProxyTests.ReflectTest;

import java.io.Serializable;
import java.lang.reflect.Field;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NoSuchFieldException {
		
		Serializable prxy = proxy Serializable("foo");
		
		Class pClass = prxy.getClass();
		
		System.out.println(pClass);
		
		for(Field d : pClass.getFields()) {
			System.out.println(d);
		}
	}

}
