
public class MathSingleton {
	private static MathSingleton mathinstance;
	
	private MathSingleton(){};
	
	public static MathSingleton getInstance() {
		if(mathinstance == null) {
			mathinstance = new MathSingleton();
		}
		return mathinstance;
	}
	
	public int add(int a,int b) {
		return a + b;
	}
	
	public int subtract(int a,int b) {
		return a - b;
	}
	
	public int multiply(int a,int b) {
		return a * b;
	}
	
	public int divide(int a,int b) {
		return a / b;
	}
}
