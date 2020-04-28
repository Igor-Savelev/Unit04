package by.ld.unit04.start;

//Напишите консольное приложение, проверяющее знание таблицы умножения. 
//При оформлении кода используйте процедурную декомпозицию.

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Введите число a: ");
		int a = sca.nextInt();
		
		System.out.print("Введите число b: ");
		int b = sca.nextInt();
		
		System.out.print("Введите результат произведения чисел a и b: ");
		int p = sca.nextInt();
		
		int x;
		x = pro(a,b);
		
		if (x == p) {
			System.out.println("Правильный результат");
		}else {
			System.out.println("Ошибка!");
		}
	}
		
		public static int pro(int a, int b) {
			int rez=0;
			rez = a * b;
			
			return rez;
		}
}
