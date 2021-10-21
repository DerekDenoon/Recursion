/*
Student: Denoon, Derek
Date: 10-21-21
Assignment: Recursion
 */
package apcsjava;

public class Recursion {

	//assumes non-negative integer input
	//computes start!...but not yet
	public int factorial(int start) {
		if(start == 0){
			// base case
			return 1;
		}else{
			// recursive case
			return (start * factorial(start- 1));
		}
	}
	
	//returns nCk (combinations/Pascal's triangle entry...do not use factorial)
	public int choose(int n, int k) {
		// special case 1
		if(n == 0 && k != 0){
			return 0;
		}
		// special case 2 and 3
		if(k == 0|| n == k){
			return 1;
		}else{
			// recursive case
			return choose(n-1,k-1) + choose(n-1, k);
		}
	}
	
	//assumes positive integer input
	//void means it doesn't return a value
	public void collatz(int start) { 		//I wonder what this does
		if (start != 1) {
			System.out.println(start);
			if (start % 2 == 0) {//the % operator returns a remainder.  22 % 3 = 1, for example.
				// recursive case 1
				collatz(start / 2);
			} else {
				// recursive case 2
				collatz(3*start + 1);
			}
		} else {
			// base case
			System.out.println("1. Once again.");
		}
	}
	
	public String reverse(String in) {
		// each time it moves one term to the back
		if(in.length() <= 1){
			// base case
			return in;
		}else{
			// recursive case
			return (reverse(in.substring(1)) + in.charAt(0));
		}
	}
	
	public String lookNSay(String input, int steps) {
		// runs look and say help steps times and return the results
		for (int i = 0; i < steps; i++) {
			input = lookNSayHelp(input);
		}
		return input;
	}

	public String lookNSayHelp(String in) {
		// stringbuilder to return
		StringBuilder out = new StringBuilder();
		// the char that is repeated
		char repeat = in.charAt(0);
		// skip char at 1
		in = in.substring(1);
		// number of times its repeated
		int numberOfOccurrences = 1;


		// array of chars from in
		char[] charArray = in.toCharArray();
		// if the length is 0 it uses the stored values to output
		if(charArray.length == 0){
			return out.append(numberOfOccurrences).append(repeat).toString();
		}
		// goes through the array and checks if a char is repeating
		for (int i = 0; i < charArray.length; i++) {
			char a = charArray[i];
			if (a != repeat) {
				// if not repeat append number of occurrence and char then set occurrences to 1 and repeat to the checked var
				out.append(numberOfOccurrences).append(repeat);
				numberOfOccurrences = 1;
				repeat = a;
			} else {
				// if repeat add an occurrence
				numberOfOccurrences += 1;
			}

			if(i == charArray.length -1){
				// if it reaches the end it appends the number of occurrences and the chars
				out.append(numberOfOccurrences).append(a);
			}
		}

		return out.toString();
	}

	public static void main(String[] args) {
		Recursion whoa = new Recursion();
		int j = 10;
		while (j > 0) {  // while loops run until the condition here is no longer met
			System.out.println(whoa.factorial(j));
			j--;
		}
		whoa.collatz(7);
		//how to manipulate strings, level 1
		String longstring = "I guess this is a long string.";
		System.out.println("The string longstring is " + longstring);
		System.out.println("longstring.substring(4,9) gives me " + longstring.substring(4,9));
		System.out.println("and longstring.substring(11) gives me " + longstring.substring(11));
		//the single slash, \, lets you use quote marks in strings
		System.out.println("Also, longstring.startsWith(\"I g\") returns " + longstring.startsWith("I g"));


		System.out.println(whoa.reverse("tattarrattat"));

		System.out.println(whoa.choose(10,2));



		System.out.println(whoa.lookNSay("22",5));
		System.out.println(whoa.lookNSay("car",5));






	}
}
