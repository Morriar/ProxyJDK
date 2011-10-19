package TMPProxyTests.ManyTest;

import java.io.Serializable;
import TMPProxyTests.ManyTest.RS.RunnableRealSubject;

public class Main2 extends proxy java.lang.Runnable implements java.lang.Runnable {
	
	public static void main(String[] args) {
		
		Main2 prxy = new Main2(new RunnableRealSubject("RedefTest"));
		prxy.run();
		prxy.addedMethod();
	}

	public Main2(Runnable realSubject) {
		super(realSubject);
	}
	
	public void run() {
		super.run();
		System.out.println("-> This is a redef <-");
	}
	
	public void addedMethod() {
		System.out.println("added");
	}
	
}
