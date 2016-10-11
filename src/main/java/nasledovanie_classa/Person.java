package nasledovanie_classa;

public class Person {
	
	protected String name = "n/a";
	protected int age = 0;
	protected String address ="n/a";
	
	public Person(){//конструктор пустой
	}
	
	public Person(String name,int age){//конструктор принимает параметры
		this.name=name;
		this.age=age;
		}
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}	
	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return age;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		this.address = a;
	}	
	
	public void descriptionOfPerson (){
		System.out.println("--------------------");
		System.out.println("| My name is: "+ name);
		System.out.println("| I'm "+age+ " let");
		System.out.println("| My address is "+address);
	}

	//статический метод (будет во всех классах одинаковое значение)
	static void testStatic (){
		System.out.println("i'm static");
	}
	
}
