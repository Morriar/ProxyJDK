/*
 * @test
 * @summary many proxies in same file
 * @author Alexandre Terrasa
 *
 * @compile RS/RunnableRealSubject.java RealSubject.java Subject.java Main2.java Main.java
 */

package TMPProxyTests.ManyTest;

import java.io.Serializable;

import TMPProxyTests.ManyTest.RealSubject;
import TMPProxyTests.ManyTest.Subject;
import TMPProxyTests.ManyTest.RS.RunnableRealSubject;
import TMPProxyTests.ManyTest.Main2;

public class Main {
	public static void main(String[] args) {
		Runnable p1 = proxy Runnable(new RunnableRealSubject("main"));
		p1.run();
		
		Runnable p2 = proxy Runnable(p1);
		p2.run();
		
		Serializable p3 = proxy Serializable("");
		System.out.println(p3.toString());
		System.out.println(p3.getClass());
		
		Subject p4 = proxy Subject(new RealSubject());
		System.out.println(p4.doHelloRetArgs("t", "t"));
		
		p2 = new Main2(p1);
		p2.run();
		
	}

}
