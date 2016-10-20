package Task6_ClassInClass;

class Dvigatel {

	private int dviglo = 650;
	private String mes = "GOGOGO...";

	class InnerClass {

		int getOutInt() {
			return dviglo;
		}

		String getOutStr() {
			return mes;
		}
	}

	InnerClass getInnerClass() {
		return new InnerClass();
	}

}