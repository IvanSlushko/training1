/**
����� ������� ������ �� ������ ��� ���������� (� ������ ������������)
� ��� ����� ���� �������� - ���������
�������� ����� "���������".
� ���� ����� ���� �������� "����������" - ������ �������� ��� ��������� (ArrayList ��������)
��������� ����� ���������� ���� ��������� �� ����� �������. 
� ��� ��� ��� ��� ����� ������� ����� �������� "����" � ������, 
������� �������� ������������ ��� ���� �����������. 
����� ����� �������� �� ����� �������� �� ���� ������
 
*/
package kanctovar;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner scn;
	
	private static ArrayList<Kanctovar> kanc1 = new ArrayList<Kanctovar>();
	private static ArrayList<Kanctovar> kanc2 = new ArrayList<Kanctovar>();
	private static ArrayList<Kanctovar> kanc3 = new ArrayList<Kanctovar>();
	
	static int count =0;
	static char[] a,aa,aaa;
	
	public static void  main (String[] arg){
		
		ArrayList<String> sotr = new ArrayList<String>();
		sotr.add("Vasil");
		sotr.add("Petr");
		sotr.add("Olga");
		System.out.println(sotr.get(0)+" , "+sotr.get(1)+" , "+sotr.get(2));
			
				System.out.println("������� ��������� � "+ sotr.get(0)+"?");
				scn=new Scanner (System.in);
				String a=scn.next();
				for (int i=0;i<(Integer.parseInt(a));i++){
					System.out.println("����� ���������: ");
					scn=new Scanner (System.in);
					String b=scn.next();
					System.out.println("����� ���� ����������: ");
					scn=new Scanner (System.in);
					String c=scn.next();
					int d = (Integer.parseInt(c));
					kanc1.add(new Kanctovar (b,d));
				}
	
				System.out.println("������� ��������� � "+ sotr.get(1)+"?");
				scn=new Scanner (System.in);
				String aa=scn.next();
				for (int i=0;i<(Integer.parseInt(aa));i++){
					System.out.println("����� ���������: ");
					scn=new Scanner (System.in);
					String b=scn.next();
					System.out.println("����� ���� ����������: ");
					scn=new Scanner (System.in);
					String c=scn.next();
					int d = (Integer.parseInt(c));
					kanc2.add(new Kanctovar (b,d));
				}
				
				System.out.println("������� ��������� � "+ sotr.get(2)+"?");
				scn=new Scanner (System.in);
				String aaa=scn.next();
				for (int i=0;i<(Integer.parseInt(aaa));i++){
					System.out.println("����� ���������: ");
					scn=new Scanner (System.in);
					String b=scn.next();
					System.out.println("����� ���� ����������: ");
					scn=new Scanner (System.in);
					String c=scn.next();
					int d = (Integer.parseInt(c));
					kanc3.add(new Kanctovar (b,d));
				}
	
		for (Kanctovar k: kanc1) { //����� �� �����
			System.out.println(k.getName()+" "+k.getNumber());
			count =  count + (k.getNumber());
		}
		System.out.println(count);
		count=0;
		for (Kanctovar k: kanc2) { //����� �� �����
			System.out.println(k.getName()+" "+k.getNumber());
			count =  count + (k.getNumber());
		}
		System.out.println(count);
		count=0;
		for (Kanctovar k: kanc3) { //����� �� �����
			System.out.println(k.getName()+" "+k.getNumber());
			count =  count + (k.getNumber());
		}
		System.out.println(count);

		
	//	System.out.println(kanc.size());
		
		
		
	}
	
}

