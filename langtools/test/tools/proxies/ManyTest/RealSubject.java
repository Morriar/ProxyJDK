package TMPProxyTests.ManyTest;


public class RealSubject implements Subject {

	@Override
	public void doHello() {
		System.out.println("Hello");
	}

	@Override
	public void doHelloArgs(String n1, String n2) {
		System.out.println("Hello " + n1 + " and " + n2);	
	}

	@Override
	public String doHelloRet() {
		return "Hello";
	}

	@Override
	public String doHelloRetArgs(String n1, String n2) {
		return "Hello " + n1 + " and " + n2;
	}
	
}
