
public class Sum<T extends Number> {
	private T x;
	private T y;
	public Sum(T x , T y) {
		this.x = x;
		this.y = y;
	}
	public T add() {
		if (x instanceof Integer) {
			return (T)Integer.valueOf(x.intValue() + y.intValue());
		}
		else if (x instanceof Double) {
			return (T)Double.valueOf(x.doubleValue() + y.doubleValue());
		}
		else if(x instanceof Float) {
			return (T)Float.valueOf(x.floatValue() + y.floatValue());
		}
		else if(x instanceof Long) {
			return (T)Long.valueOf(x.longValue() + y.longValue());
		}
		else
			return null;
	}

	public static void main(String[] args) {
		Sum<Integer> intAdder = new Sum(2,3);
		Integer intresult = intAdder.add();
		System.out.println("Integer Result "+intresult);
		
		Sum<Double> doubleAdder = new Sum(2.3, 3.5);
		Double doubleresult = doubleAdder.add();
		System.out.println("Double result "+doubleresult);

		Sum<Float> floatAdder = new Sum(2.3f, 3.4f);
		Float floatresult = floatAdder.add();
		System.out.println("Float result "+ floatresult);
		
		Sum<Long> longAdder = new Sum(2l, 4l);
		Long longresult = longAdder.add();
		System.out.println("Long result "+ longresult);
	}

}
