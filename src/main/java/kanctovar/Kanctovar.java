package kanctovar;

public class Kanctovar {

	private String name;
	private int price;

	// создадим конструктор
	public Kanctovar(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return price;
	}

	public void setNumber(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
