package TMPProxyTests.ImportTest.Package;

import TMPProxyTests.ImportTest.RealSubject.RunnableRealSubject;

public class Main {
	public static void main(String[] args) {
		Runnable prxy = proxy Runnable(new RunnableRealSubject("TestImport2"));
		prxy.run();
	}
}
