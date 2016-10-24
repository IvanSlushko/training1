package OOP_samples;

public class A2 extends A1 {

	// перезапись
	@Override
	public void process(int i) {
		i+=10; 
		System.out.print("new ");
		super.process(i);
	}

	@Override
	public void process(String i) {
		super.process(i);
	}

}
