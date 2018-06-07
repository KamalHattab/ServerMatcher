package utils;

public class Tuple<A,B> {
	private A one;
	private B two;
	public Tuple(A one, B two) {
		super();
		this.one = one;
		this.two = two;
	}
	public A getOne() {
		return one;
	}
	public void setOne(A one) {
		this.one = one;
	}
	public B getTwo() {
		return two;
	}
	public void setTwo(B two) {
		this.two = two;
	}
	@Override
	public String toString() {
		return "Tuple [one=" + one + ", two=" + two + "]";
	};
	

}
