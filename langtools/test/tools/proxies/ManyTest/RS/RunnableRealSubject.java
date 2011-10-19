package TMPProxyTests.ManyTest.RS;

public class RunnableRealSubject implements Runnable {
	public String name;
	
	public RunnableRealSubject(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("run by " + name);
	}
}
