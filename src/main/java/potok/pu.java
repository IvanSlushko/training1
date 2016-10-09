package potok;

import java.util.Random;

class pu implements Runnable {

	int time; //время сна потока
	String name; //имя потока
	Random r = new Random();
	
	public pu(String name){
		this.name=name; //приравниваем переменную в классе к локальной переменной
		time=r.nextInt(999); //милисеки сна потока
	}
	
	public void run(){
		System.out.printf("Поток %s спит %d милисекунд \n", name, time);
		try {  //отправить поток в сон
			Thread.sleep(time);
		}catch (Exception e){}; 
		System.out.printf("Поток %s простулся и закончился\n", name);
	}
}
