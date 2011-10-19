/*
 * @test
 * @summary generic types tests
 * @author Alexandre Terrasa
 *
 * @compile Package/Main.java RealSubject/RunnableRealSubject.java Main.java
 */

package TMPProxyTests.ImportTest;

import TMPProxyTests.ImportTest.RealSubject.RunnableRealSubject;

public class Main {
	public static void main(String[] args) {
		Runnable prxy = proxy Runnable(new RunnableRealSubject("TestImport.TestImport"));
		prxy.run();
	}
}
