package Task6_ClassInClass;

public class NuclearBoat {

	public static void main(String[] args) {

		Dvigatel outClass = new Dvigatel();
		Dvigatel.InnerClass innerClass = outClass.getInnerClass();
		System.out.println("Na bortu lodki dvigatel " + innerClass.getOutInt() + " loshadey!");
		System.out.println(innerClass.getOutStr());
	}

}
