/*
 * @test
 * @summary generic types tests
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */

package TMPProxyTests.GenericTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> rs = new ArrayList<String>();
		rs.add("toto");
		rs.add("tata");
		rs.add("titi");
		
		Iterable<String> prxy = proxy Iterable<String>(rs);
		
		for(String val : prxy) {
			System.out.println(val);
		}
		
	}

}
