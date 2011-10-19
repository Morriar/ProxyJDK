/*
 * @test
 * @summary inner classes
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */

package TMPProxyTests.InnerTest;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Runnable prxy = proxy Runnable(new RealRunnable("main"));
		prxy.run();
		
		
		Runnable prxy2 = new RedefRunnable(new RealRunnable("with redef"));
		prxy2.run();
		
		RedefRunnable prxy3 = (RedefRunnable)prxy2;
		prxy3.run();
		prxy3.added();
	}
	
	public class RealRunnable implements Runnable {
		public String name;
		
		public RealRunnable(String name) {
			this.name = name;
		}
		
		public void run() {
			System.out.println("run by " + name);
		}
	}
	
	public class RedefRunnable extends proxy Runnable {

		public RedefRunnable(RealRunnable rs) {
			super(rs);
		}
		
		public void run() {
			super.run();
			System.out.println("modified run");
		}
		
		public void added() {
			System.out.println("added");
		}
	}
}
