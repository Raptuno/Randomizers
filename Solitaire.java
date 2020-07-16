/*	Introduction (You'll need this)
 * 
 */

package dados;

import java.io.*;
import javax.swing.*;


@SuppressWarnings("unused")
public class Solitaire {
	
	public static void assign(String[] assigner, String[] cards, String[] suits, String[] colors) {
		try {
			for (int i=0; i<2; i++) {
				assigner[i]=suits[(int)(Math.random()*(4-0))]+" "+colors[(int)(Math.random()*(2-0))]+" "+cards[(int)(Math.random()*(14-0))];
				System.out.println(i);
			}
		} catch (Exception IndexOutOfBounds) {
			System.out.println("Longitud de assigner: "+assigner.length+"\nLongitud de suits: "+suits.length+"\nLongitud de colors: "+colors.length+"\nLongitud de cards: "+cards.length);
		}
	}
	
	public static void shwd (String[] showdown, String[] cards, String[] suits, String[] colors) {
		for (int i=0; i<5; i++) {
			showdown[i]=suits[(int)(Math.random()*(4-0))]+" "+colors[(int)(Math.random()*(2-0))]+" "+cards[(int)(Math.random()*(14-0))];
		}
	}
	
	public static void main(String[] args)throws IOException {
		String cards[]= {"King", "Queen", "Jack" , "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "Ace"};
		String colors[]= {"Red", "Black"};
		String suits[]= {"Club ♣", "Diamond ♦", "Heart ♥", "Spade ♠"};
		System.out.println (suits[(int)(Math.random()*(4-0))]+" "+colors[(int)(Math.random()*(2-0))]+" "+cards[(int)(Math.random()*(14-0))]);
		String assigner[]=new String[2];
		String showdown[]=new String[5];
		
		assign(assigner, cards, suits, colors);
		System.out.println("\nYour cards: ");
		for (int i=0; i<2; i++) {
			System.out.println("\t"+assigner[i]);
		}
		
		shwd(showdown, cards, suits, colors);
		
		System.out.println("Flop: ");
		for (int i=0; i<3; i++) {
			System.out.print("Card "+(i+1)+":"+"\t"+showdown[i]+"\n");
		}
		System.out.println("\nTurn: "+showdown[3]);
		try {
			System.out.println("\nRiver: "+showdown[4]);
		} catch(Exception IndexOutOfBounds) {
			System.out.println("\nThere's only five cards on the table during showdown phase...");
		}
		
		
	}
}
