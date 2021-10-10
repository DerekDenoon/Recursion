package apcsjava;

public class Recursion {

	//assumes non-negative integer input
	//computes start!...but not yet
	public int factorial(int start) {
		if(start == 1){
			return 1;
		}else{
			return (start * factorial(start- 1));
		}
	}
	
	//returns nCk (combinations/Pascal's triangle entry...do not use factorial)
	public int choose(int n, int k) {
		return 1;
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
		return null; //must be changed, but to what?
	}
	
	public String lookNSay(String input, int steps) {//returns the first 'steps' strings in a look-and-say sequence that begins with 'input'
		return null;
	}

	public String lookNSayHelp(String in) {//the recursive function used to do look-and-say
		return null;
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
	}
}