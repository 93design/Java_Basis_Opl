package Oplossing;

import java.util.Scanner;

public class LussenOefeningIfelseIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				Scanner input = new Scanner(System.in);
				double brutoLoon = input.nextDouble();
				double nettoLoon = 0;
				
				final double HOGE_SCHIJF= 38;
				final double MIDDEL_SCHIJF= 35;
				final double LAGE_SCHIJF= 27;
				
				
				if(brutoLoon > 3000) {
					nettoLoon = brutoLoon *(HOGE_SCHIJF/100);
				} else if (brutoLoon <= 3000 &&brutoLoon >=2000) {
					nettoLoon = brutoLoon *(MIDDEL_SCHIJF/100);
				} else if(brutoLoon <2000) {
					nettoLoon = brutoLoon *(LAGE_SCHIJF/100);
				}
				
				System.out.println("uw nettoLoon is" + nettoLoon);
			
			}
}
