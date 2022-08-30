package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class manavtarti {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut kac kg ?");
		int armut = scan.nextInt();
		
		System.out.print("elma kac kg ?");
		int elma = scan.nextInt();
		
		System.out.print("domates kac kg ?");
		int domates = scan.nextInt();
		
		System.out.print("muz kac kg ?");
		int muz = scan.nextInt();
		
		System.out.print("patlican kac kg ?");
		int patlican = scan.nextInt();
		
		double tutar =(armut * (2.14)) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
		System.out.println("toplam tutar: " + tutar);
		

	}

}
