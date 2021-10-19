package apcsjava;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

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
			if (start % 2 == 0) { //the % operator returns a remainder.  22 % 3 = 1, for example.
				collatz(start / 2);
			} else {
				collatz(3*start + 1);
			}
		} else {
			System.out.println("1. Once again.");
		}
	}
	
	public String reverse(String in) {
		// each time it moves one term to the back
		if(in.length() <= 1){
			return in;
		}else{
			return (reverse(in.substring(1)) + in.charAt(0));
		}
	}
	
	public String lookNSay(String input, int steps) {

		//returns the first 'steps' strings in a look-and-say sequence that begins with 'input'
		return null;
	}

	public String lookNSayHelp(String in) {
		// finish making more efficient
		StringBuilder out = new StringBuilder();

		char repeat = in.charAt(0);
		in = in.substring(1);
		int times = 1;

		for (char a : in.toCharArray()) {
			if(a != repeat){
				out.append(times + "" + repeat);
				times =1;
				repeat = a;
			}else{
				times += 1;
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


		System.out.println(whoa.lookNSayHelp("HEELLLLO"));

	}
}
