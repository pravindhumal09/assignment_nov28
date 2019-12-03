package com.assignment.nov28;
import java.util.Scanner;

/**
 * @author 799197
 *.       Reverse the string without using any String method e.g. One to enO, apple ball to llab elppa
 */
public class ReverseString {
	



		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			ReverseString rev = new ReverseString();
			System.out.println("Enter a String to reverse:");
			String str = sc.next();
			rev.revString(str);
			sc.close();
		}

		public void revString(String str) {
			String str1 = "";
			// to calculate the length of string
			for (int i = str.length() - 1; i >= 0; i--) {
				//to find each character from end of the input string and add it in new string
				str1 = str1 + str.charAt(i);

			}
			System.out.println("The reverse of the String is: " + str1);
		}
	}


