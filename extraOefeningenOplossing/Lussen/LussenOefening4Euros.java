package Oplossing;

import java.util.Scanner;

public class LussenOefening4Euros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		
		int geld = input.nextInt();
		
		int count500 = 0;
		int count200 = 0;
		int count100 = 0 ;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		
		while(geld >0) {
			if (geld%500 ==0) {
				count500++;
				geld-=500;
			} else if (geld%200 ==0) {
				count200++;
				geld-=200;
			} else if (geld%100==0) {
				count100++;
				geld-=100;
			} else if (geld%50==0) {
				count500++;
				geld-=50;
			} else if (geld%20 ==0) {
				count20++;
				geld-=20;
			} else if (geld%10 ==0) {
				count10++;
				geld -=10;
			} else if (geld%5 ==0) {
				count5++;
				geld-=5;
			} else if (geld%2 ==0) {
				count2++;
				geld-=2;
			} else {
				count1++;
				geld--;
				
			}
		}
		
		System.out.println("500: " +count500);
		System.out.println("200: " +count200);
		System.out.println("100: " +count100);
		System.out.println("50: " +count50);
		System.out.println("20: " +count20);
		System.out.println("10: " +count10);
		System.out.println("5: " +count5);
		System.out.println("2: " +count2);
		System.out.println("1: " +count1);
			}
}
