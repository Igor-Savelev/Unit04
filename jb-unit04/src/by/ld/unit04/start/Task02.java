package by.ld.unit04.start;

//Напишите консольное приложение – конвертер валют, при оформлении кода используйте процедурную декомпозицию.

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Введите сумму: ");
		double a = sca.nextDouble();
		
		Scanner scb = new Scanner(System.in);
		
		System.out.print("Введите валюту rub, eur или dollar: ");
		String b = scb.nextLine();

		String rub = "rub";
		String eur = "eur";
		String dollar = "dollar";
		
		if(b.equals(rub)) {
			System.out.println("Сумма по курсу доллара = " + rub_dol(a));
			System.out.println("Сумма по курсу евро = " + rub_eur(a));
		}else {
			if(b.equals(eur)) {
				System.out.println("Сумма по курсу рубля = " + eur_rub(a));
				System.out.println("Сумма по курсу доллара = " + eur_dol(a));
			}else {
				if(b.equals(dollar)) {
					System.out.println("Сумма по курсу евро = " + dol_eur(a));
					System.out.println("Сумма по курсу рублях = " + dol_rub(a));
				}
			}
			}
	}
	
	public static double rub_dol(double a) {
		double x=0;	
		x = a / 71.43;
		return x;
	}
	
	public static double rub_eur(double a) {
		double y=0;	
		y= a / 80.60;
		return y;
	}
	
	public static double eur_rub(double a) {
		double x=0;	
		x = a * 80.60;
		return x;
	}
	
	public static double eur_dol(double a) {
		double y=0;	
		y= a * 1.13;
		return y;
	}
	
	public static double dol_eur(double a) {
		double x=0;	
		x = a / 1.13;
		return x;
	}
	
	public static double dol_rub(double a) {
		double y=0;	
		y= a * 71.43;
		return y;
	}
	
}




