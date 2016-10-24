package OOP_samples;

public class Main {

	public static int param1 = 45;
	public static String param2 = "qwerty";
	public static A1 a1 = new A1();
	public static A2 a2 = new A2();
	public static AA1 obj = new AA1();
	public static AA1 objList = new AA1();

	public static void main(String[] args) {
		a1.process(param1);
		// a1.process(param2);
		a2.process(param1);
		// a2.process(param2);

		obj.setA(22);

		System.out.println(obj.getA() + " " + obj.getB());

	}

}
