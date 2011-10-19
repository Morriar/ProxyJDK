package TMPProxyTests.VisibilityTest;

public class Main {
	
	public static void main(String args[]) {
		Subject prxy = proxy Subject(new RealSubject(10));
		prxy.add();
		prxy.add();
		prxy.add();
		prxy.show();
		
		prxy = new Redef();
	}
}
