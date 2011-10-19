/*
 * @test
 * @summary chained proxies
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */

package TMPProxyTests.MultiTest;

import java.io.Serializable;

public class Main {
	public static void main(String[] args) {
		Serializable prxy = proxy Serializable(proxy Serializable(""));
		System.out.println(prxy.hashCode());
	}

}
