/* Introduction (You'll need this...)
 * This program is designed for pulling out random results for dice rolling and coin flips
 * Sample size limit is 3 for coins and 2 for dice
 * Created by RaptunoCyborg as a side project
 * Translated into *** by ******
 * Tested on Eclipse 2019-12 (4.14.0)
 * This program is meant for Spanish speakers. 
 * If you can speak other languages edit the correspondent strings. Also edit the marker comments if you want
 * Replace the *s in line 5 by the language you're translating to and your name to get credit for your translation
 */

package dados;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Vegas {
	public static void diceRoll(int qty, int rpt){
		int dice1=(int)(Math.random()*((6-1)+1))+1;
		int dice2=(int)(Math.random()*((6-1)+1))+1;
		
		if(qty==1) {
			if(rpt==1) {
				System.out.println("\nTirada de un solo dado: "+dice1);
			} else {
				for(int i=0; i<rpt; i++) {
					dice1=(int)(Math.random()*((6-1)+1))+1;
					System.out.println("Tirada "+(i+1)+" de un solo dado: "+dice1);
				}
			}
		} else {
			if (rpt==1) {
				System.out.println("Dado 1: "+dice1);
				System.out.println("Dado 2: "+dice2);
				System.out.println();
			} else {
				for(int i=0; i<rpt; i++) {
					System.out.println("Ronda "+(i+1));
					System.out.println("Dado 1: "+dice1);
					System.out.println("Dado 2: "+dice2);
					System.out.println();
				}
			}
		}
	}
	
	public static void coinFlip(int qty, int rpt)throws IOException {
		String faces[]= {"Sello", "Águila"};
		int coin1=(int)(Math.random()*((2-1)+1)+1);
		int coin2=(int)(Math.random()*((2-1)+1)+1);
		int coin3=(int)(Math.random()*((2-1)+1)+1);
		
		if(qty==1) { //Tamaño de muestra
			if(rpt==1) {//Repeticiones
				System.out.print("Tirada de una sola moneda: ");
				if(coin1==1) {
					System.out.print(faces[0]);
				} else { //Repeticiones
					System.out.print(faces[1]);
				}	
				System.out.println();
			} else {
				for(int i=0; i<rpt; i++) {
					coin1=(int)(Math.random()*((2-1)+1)+1);
					System.out.println("Tirada "+(i+1)+" de una sola moneda: "+coin1);
				}
			}
		} else if (qty==2) { //Tamaño de muestra
			if(rpt==1) { //Repeticiones
				System.out.print("Tirada moneda 1: ");
				if(coin1==1) {
					System.out.print(faces[0]);
				} else {
					System.out.print(faces[1]);
				}
				System.out.println();
				System.out.print("Tirada moneda 2: ");
				if(coin2==1) {
					System.out.print(faces[0]);
				} else {
					System.out.print(faces[1]);
				}
				System.out.println();
			} else { //Repeticiones
				for(int i=0; i<rpt; i++) {
					coin1=(int)(Math.random()*((2-1)+1)+1);
					coin2=(int)(Math.random()*((2-1)+1)+1);
					System.out.print("Tirada moneda 1: ");
					if(coin1==1) {
						System.out.print(faces[0]);
					} else {
						System.out.print(faces[1]);
					}
					System.out.println();
					System.out.print("Tirada moneda 2: ");
					if(coin2==1) {
						System.out.print(faces[0]);
					} else {
						System.out.print(faces[1]);
					}
					System.out.println();
				}
			}
		} else { //Tamaño de muestra
			if(rpt==1) { //Repeticiones
				System.out.print("Tirada moneda 1: ");
				if(coin1==1) {
					System.out.print(faces[0]);
				} else {
					System.out.print(faces[1]);
				}
				System.out.println();
				System.out.print("Tirada moneda 2: ");
				if(coin2==1) {
					System.out.print(faces[0]);
				} else {
					System.out.print(faces[1]);
				}
				System.out.println();
				System.out.print("Tirada moneda 3: ");
				if(coin3==1) {
					System.out.print(faces[0]);
				} else {
					System.out.print(faces[1]);
				}
				System.out.println();
			} else { //Repeticiones
				for (int i=0; i<rpt; i++) {
					coin1=(int)(Math.random()*((2-1)+1)+1);
					coin2=(int)(Math.random()*((2-1)+1)+1);
					coin3=(int)(Math.random()*((2-1)+1)+1);
					System.out.println("Ronda "+(i+1));
					System.out.print("Tirada moneda 1: ");
					if(coin1==1) {
						System.out.print(faces[0]);
					} else {
						System.out.print(faces[1]);
					}
					System.out.println();
					System.out.print("Tirada moneda 2: ");
					if(coin2==1) {
						System.out.print(faces[0]);
					} else {
						System.out.print(faces[1]);
					}
					System.out.println();
					System.out.print("Tirada moneda 3: ");
					if(coin3==1) {
						System.out.print(faces[0]);
					} else {
						System.out.print(faces[1]);
					}
					System.out.println();
				} //Loop
			}
		} //Tamaño de muestra
	}
	
	public static void dont_open_please() {
		/* 
		 * Bevor sie fragen, David Rockenzahn ist mein Freund
		 * Und Ich bin kein Russin
		 * You're one naughty [REDACTED] aren't you?
		 * -Raptuno
		 */
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader ipt=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader loopIpt=new BufferedReader(new InputStreamReader(System.in));
		Scanner vote=new Scanner(System.in);
		int rpt=0;
		char loop='s';
		int qty=0;
		
		while(loop!='n') {
			System.out.print("Qué desea tirar, dados o monedas? ");
			String cheems=vote.nextLine();
			
			switch (cheems) {
			case "monedas":
				System.out.print("Cuántas monedas? ");
				qty=Integer.parseInt(ipt.readLine());
				System.out.print("Cuántas veces? ");
				rpt=Integer.parseInt(loopIpt.readLine());
				coinFlip(qty, rpt);
				break;
			case "dados":
				System.out.print("Cuántos dados, 1 ó 2? ");
				qty=Integer.parseInt(ipt.readLine());
				System.out.print("Cuántas veces? ");
				rpt=Integer.parseInt(loopIpt.readLine());
				diceRoll(qty, rpt);
				break;
			}
			BufferedReader cycle=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Continuar? (s/n) ");
			loop=(char)cycle.read();
			if(loop=='s') {
				System.out.println();
				continue;
			} else {
				break;
			}
		}
		System.out.println("Gracias...");
		vote.close();
	}
}
