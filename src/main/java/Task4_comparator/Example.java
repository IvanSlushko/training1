package Task4_comparator;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		Kniga[] p = new Kniga[4];

		// заполним объект Product содержимым
		p[0] = new Kniga();
		p[0].setName("Biblia");
		p[0].setPrice(7.56);
		p[0].setQuantity(56);

		p[1] = new Kniga();
		p[1].setName("Alexander Pushkin");
		p[1].setPrice(17.00);
		p[1].setQuantity(32);

		p[2] = new Kniga();
		p[2].setName("Voina i mir");
		p[2].setPrice(40.50);
		p[2].setQuantity(500);

		p[3] = new Kniga();
		p[3].setName("Gogol-proza");
		p[3].setPrice(0.50);
		p[3].setQuantity(13);
		
		// выведем данные без сортировки
		System.out.println("============ no sorted ==============");

		for (Kniga i : p) {
			System.out.println("Name: " + i.getName() + " price: " + i.getPrice() + " quantity: " + i.getQuantity());
		}

		// отсортируем и выведем данные по цене
		System.out.println("========== sorted by price===========");

		Arrays.sort(p, new SortedByPrice());

		for (Kniga i : p) {
			System.out.println("Name: " + i.getName() + " price: " + i.getPrice() + " quantity: " + i.getQuantity());
		}

		// отсортируем и выведем данные по названию
		System.out.println("========== sorted by name ===========");

		Arrays.sort(p, new SortedByName());
		for (Kniga i : p) {
			System.out.println("Name: " + i.getName() + " price: " + i.getPrice() + " quantity: " + i.getQuantity());
		}
	}

}