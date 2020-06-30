package by.ld.unit04.start;

//Íŕďčřčňĺ ęîíńîëüíîĺ ďđčëîćĺíčĺ – ęîíâĺđňĺđ âŕëţň, ďđč îôîđěëĺíčč ęîäŕ čńďîëüçóéňĺ ďđîöĺäóđíóţ äĺęîěďîçčöčţ.

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Ââĺäčňĺ ńóěěó: ");
		double a = sca.nextDouble();
		
		Scanner scb = new Scanner(System.in);
		
		System.out.print("Ââĺäčňĺ âŕëţňó rub, eur čëč dollar: ");
		String b = scb.nextLine();

		String rub = "rub";
		String eur = "eur";
		String dollar = "dollar";
		
		if(b.equals(rub)) {
			System.out.println("Ńóěěŕ ďî ęóđńó äîëëŕđŕ = " + rub_dol(a));
			System.out.println("Ńóěěŕ ďî ęóđńó ĺâđî = " + rub_eur(a));
		}else {
			if(b.equals(eur)) {
				System.out.println("Ńóěěŕ ďî ęóđńó đóáë˙ = " + eur_rub(a));
				System.out.println("Ńóěěŕ ďî ęóđńó äîëëŕđŕ = " + eur_dol(a));
			}else {
				if(b.equals(dollar)) {
					System.out.println("Ńóěěŕ ďî ęóđńó ĺâđî = " + dol_eur(a));
					System.out.println("Ńóěěŕ ďî ęóđńó đóáë˙ő = " + dol_rub(a));
				}
			}
			}
	}
	
	public static double rub_dol(double a) {// Пожалуйста, соблюдайте правила именования идентификаторов
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

// задачи модуля 4 зачтены


