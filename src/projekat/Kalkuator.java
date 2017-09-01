package projekat;


import java.util.Scanner;


public class Kalkuator{
	
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String args[]){
		String odgovor;
		do 
		{
		int a, b, izbor, rez;
		System.out.println("----kalkulator----");
		System.out.println("Unesite prvi broj:");
		a = scan.nextInt();
		System.out.println("a = " + a);
		System.out.println("Unesite drugi broj:");
		b = scan.nextInt();
		System.out.println("b = " + b);
		System.out.println("Izaberite zeljenu opciju:");
		System.out.println("1. Sabiranje,");
		System.out.println("2. Oduzimanje,");
		System.out.println("3. Mnozenje,");
		System.out.println("4. Deljenje,");
		izbor = scan.nextInt();
		
		switch(izbor){
		case 1:
			rez = a + b;
			System.out.println("Rezultat je: " + rez);
			break;
		case 2:
			rez = a - b;
			System.out.println("Razultat je: " + rez);
			break;
		case 3:
			rez = a * b;
			System.out.println("Rezultat je: " + rez);
			break;
		case 4:
			rez = a / b;
			System.out.println("Rezultat je: " + rez);
			break;
			default:
				System.out.println("Izabrali ste pogresnu opciju, pokusajte ponovo!");
		}
		System.out.println("Zelite li da ponovite unos? [D/N]\n");
		odgovor = scan.nextLine();
		}
		while(odgovor == "D" || odgovor =="d");	
	}
}
