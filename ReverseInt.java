package com.assignment.nov28;
import java.util.Scanner;



	/**
	 * @author 799197
	 *.       Reverse the integer number without using any methods e.g.  154 to 451 , 88765 to 56788
	 */
	public class ReverseInt {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			ReverseInt Rev = new ReverseInt();
			System.out.println("Enter a number to reverse:");
			int num = sc.nextInt();
			Rev.revNum(num);
			sc.close();
		}

		// logic to reverse the number
		public void revNum(int num) {
			int sum = 0;
			while (num > 0) {
				sum = sum * 10 + num % 10;
				num = num / 10;
			}
			System.out.println("The reverse of the number is: " + sum);
		}
	}


