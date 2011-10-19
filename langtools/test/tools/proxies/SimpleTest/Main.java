/*
 * @test
 * @summary simple test
 * @author Alexandre Terrasa
 *
 * @compile Subject.java RealSubject.java Main.java
 */

package TMPProxyTests.SimpleTest;

public class Main {
	
	public static void main(String args[]) {
		Subject prxy = proxy Subject(new RealSubject());
		prxy.service();
	}
}
