/*
 * @test
 * @summary generic types tests
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */

package TMPProxyTests.StdLibTest;

import java.io.Serializable;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Serializable prxy = proxy Serializable("foo");
		System.out.println(prxy.toString());
	}

}
