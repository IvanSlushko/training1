package formatter;

import java.util.Formatter;
import java.util.Scanner;

/**		specifikators
		%s - stroka
		%d - int 
		%f - s plav to4koy
		\n - new line
		printf    !!!!!
*/	
public class start {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String[] args) {
			
			try {
				x=new Formatter ("res//2.txt"); //если файла там нету он создаст 
				scn=new Scanner (System.in);
				System.out.println("Сколько вам лет?");
				int a= (int)Double.parseDouble(scn.next()); //кастование
				//String a=scn.next();
				System.out.println("Как вас зовут?");
				String b=scn.next();
				System.out.println("Где вы живете?");
				String c=scn.next();
				x.format("Меня зовут %s, мне %d лет, я живу в городе %s",b,a,c);
				x.close();
			}catch (Exception e){};
	//в папку рес записался файл с данной инфой!
	}
}
