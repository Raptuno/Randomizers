package dados;
import java.io.*;
import java.io.IOException;

public class BetterRoll {
	public static int roll(){
		
		int diceroll = (int)(Math.random()*((6-1)+1)+1);
		
		return diceroll;
	}
	
	public static void main(String[] args)throws IOException{
		File opt= new File ("C:\\Users\\RaptunoCyborg\\Desktop\\Dice_roll.txt");
		opt.createNewFile();
		System.out.print("How many rolls? ");
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int sizer=Integer.parseInt(scan.readLine());
		FileWriter io=new FileWriter("C:\\Users\\RaptunoCyborg\\Desktop\\Dice_roll.txt");
		io.write("Number of performed dice rolls: "+sizer+"\n\n");
		
		
		for(int i=0; i<sizer; i++) {
			if((i+1)>=1&&(i+1)<=9) {
				System.out.print("• ");
			} else if ((i+1)>=10&&(i+1)<=99) {
				System.out.print("•• ");	
			} else if ((i+1)>=100&&(i+1)<=999) {
				System.out.print("••• ");
			} else if ((i+1)>=1000&&(i+1)<=9999) {
				System.out.print("•••• ");
			}
			System.out.println("Six faces roll #"+(i+1)+": "+roll());
			if((i+1)>=1&&(i+1)<=9) {
				io.write("• ");
			} else if ((i+1)>=10&&(i+1)<=99) {
				io.write("•• ");	
			} else if ((i+1)>=100&&(i+1)<=999) {
				io.write("••• ");
			} else if ((i+1)>=1000&&(i+1)<=9999) {
				io.write("•••• ");
			}
			io.write("Six faces roll #"+(i+1)+": "+roll()+"\n");
		}
		io.close();
	}
}
