package by.ld.unit04.start;

//�������� ���������� ����������, ����������� ������ ������� ���������. 
//��� ���������� ���� ����������� ����������� ������������.

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("������� ����� a: ");
		int a = sca.nextInt();
		
		System.out.print("������� ����� b: ");
		int b = sca.nextInt();
		
		System.out.print("������� ��������� ������������ ����� a � b: ");
		int p = sca.nextInt();
		
		int x;
		x = pro(a,b);
		
		if (x == p) {
			System.out.println("���������� ���������");
		}else {
			System.out.println("������!");
		}
	}
		
		public static int pro(int a, int b) {
			int rez=0;
			rez = a * b;
			
			return rez;
		}
}
