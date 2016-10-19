package Task5_parametrizaciaPere4islenie;

enum Discipl1 {// matematika
	Ivanov(5.2f), Petrov(7.6f), Sidorov(3.67f), Gordeev(9.4f), Goshev(5.22f), Antonov(4.34f);

	private float ball1;

	Discipl1(float ball1) {
		this.ball1 = ball1;
	}

	public float getBall1() {
		return ball1;
	}
}

enum Discipl2 {// rus yaz
	Antonenko(5), Petrov(6), Sidorov(8), Galkin(1), Goshev(2), Manishev(4);
	private int ball;

	Discipl2(int ball) {
		this.ball = ball;
	}

	public int getBall() {
		return ball;
	}
}

enum Discipl3 {// istoriya
	Hromov(4), Petrov(2), Sidorov(6), Gerasimov(7), Goshev(9), Manishev(9);
	private int ball;

	Discipl3(int ball) {
		this.ball = ball;
	}

	public int getBall() {
		return ball;
	}
}

public class m {

	public static void main(String[] args) {

		System.out.println("MATEMATICA:");
		for (Discipl1 d : Discipl1.values()) {
			System.out.println(d + "  " + d.getBall1());
		}
		System.out.println();
		System.out.println("RUSS YAZ:");
		for (Discipl2 d : Discipl2.values()) {
			System.out.println(d + "  " + d.getBall());
		}
		System.out.println();
		System.out.println("ISTORIYA:");
		for (Discipl3 d : Discipl3.values()) {
			System.out.println(d + "  " + d.getBall());
		}
		System.out.println();

		// search student in group
		String student = "Sidorov";

		System.out.println("Student " + student + " learn:");

		for (Discipl1 d : Discipl1.values()) {
			if (d.name() == student)
				System.out.println(" Matemat " + d.getBall1());
		}
		for (Discipl2 d : Discipl2.values()) {
			if (d.name() == student)
				System.out.println(" Rus yaz " + d.getBall());
		}
		for (Discipl3 d : Discipl3.values()) {
			if (d.name() == student)
				System.out.println(" Istor " + d.getBall());
		}

	}

}
