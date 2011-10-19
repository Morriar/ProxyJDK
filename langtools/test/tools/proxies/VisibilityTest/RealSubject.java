package TMPProxyTests.VisibilityTest;

public class RealSubject implements Subject {
	
	protected Integer count;
	
	public RealSubject(Integer count) {
		this.count = count;
	}
	
	public void add() {
		count = incr(count);
	}
	
	private Integer incr(Integer current) {
		return current + 1;
	}

	public void show() {
		System.out.println(toStr());
	}
	
	protected String toStr() {
		return "count = " + count;
	}
}
