class GenericsDemo<A>{
	A x;
	public GenericsDemo(A x) {
		this.x = x;
	}
	public A getX() {
		return x;
	}
}
public class Class {

	public static void main(String[] args) {
		GenericsDemo<Integer> g1 = new GenericsDemo<Integer>(3);
		GenericsDemo<Double> g2 = new GenericsDemo<Double>(3.5);
		System.out.println(g1.getX());
		System.out.println(g2.getX());
	}

}
