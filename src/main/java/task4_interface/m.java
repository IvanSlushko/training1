package task4_interface;

import java.util.TreeSet;

public class m {

	public static void main(String[] args) {
		TreeSet<Comp> price = new TreeSet<Comp>();
		price.add(new Comp("Atlas", 90));
		price.add(new Comp("Biblia", 120));
		price.add(new Comp("Atlas", 140));
		price.add(new Comp("Antuan Exuperi", 15));
		price.add(new Comp("Course of math", 18));
		price.add(new Comp("Antuan Exuperi all", 185));
		price.add(new Comp("Proza XVII", 8));

		System.out.println("Po alfavitu:");
		for (Comp e : price) {
			System.out.println(e.str + ", price: " + e.stoimost + " rub");
		}

	}

}