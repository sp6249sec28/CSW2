class Generics{
	public <A> A getX(A x) {
		return x;
	}
}
public class Methods {

	public static void main(String[] args) {
		Generics g1 = new Generics();
		Generics g2 = new Generics();
		System.out.println(g1.getX(3));
		System.out.println(g2.getX("Hello"));
	}

}
