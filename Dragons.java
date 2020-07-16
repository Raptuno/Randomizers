package dados;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Dragons {
	public static void dice() {
		int dado1 = (int)(Math.random()*((6-1)+1))+1;
		int dado2 = (int)(Math.random()*((6-1)+1))+1;
		System.out.println("Tirada dado 1: "+dado1);
		System.out.println("Tirada dado 2: "+dado2);
	}
	public static void coinFlip () throws IOException {
		String faces [] = {"Sello", "Águila"};
		int coin1 = (int)(Math.random()*((2-1)+1))+1;
		int coin2 = (int)(Math.random()*((2-1)+1))+1;
		int coin3 = (int)(Math.random()*((2-1)+1))+1;
		
		if (coin1==1) {
			System.out.println("Moneda 1: "+faces[0]);
		} else {
			System.out.println("Moneda 1: "+faces[1]);
		}
		if (coin2==1) {
			System.out.println("Moneda 2: "+faces[0]);
		} else {
			System.out.println("Moneda 2: "+faces[1]);
		}
		if (coin3==1) {
			System.out.println("Moneda 3: "+faces[0]);
		} else {
			System.out.println("Moneda 3: "+faces[1]);
		}
	}
	public static void main (String[] args) throws IOException {
		String choose ="";
		System.out.print("Tirar dados o monedas? ");
		
		Scanner vote=new Scanner(System.in);
		choose=vote.nextLine();
		
		switch (choose) {
		case "dados":
			BufferedReader permit = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Cuántas veces? ");
			int diceLoop=Integer.parseInt(permit.readLine());
			if (diceLoop==1) {
				System.out.println();
				dice();
			} else {
				for (int i=0; i<diceLoop; i++) {
					System.out.println();
					System.out.println("Ronda "+(i+1));
					dice();
				}
			}
			break;
		case "monedas":
			BufferedReader beanCounter = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Cuántas veces? ");
			int coinLoop=Integer.parseInt(beanCounter.readLine());
			if(coinLoop>1) {
				for (int i=0; i<coinLoop; i++) {
					System.out.println();
					System.out.println("Tirada "+(i+1));
					coinFlip();
				}
			} else {
				coinFlip();
			}
			break;
		case "ambos":
			
		}
		vote.close();
	}
}
