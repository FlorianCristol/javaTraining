import java.io.Console;
import java.io.IOException;
public class StringManipulation{
	public static void main(String args[]) throws IOException{
		Console c = System.console();
		if(c == null){
			System.err.println("No console!");
			System.exit(1);
		}

		System.out.println("Here we reverse a String");

		String bonjour = c.readLine("Enter the word to reverse please: ");
		char[] tempArray = new char[bonjour.length()];
		for(int i = 0 ; i < bonjour.length(); i ++){
			tempArray[i] = bonjour.charAt(bonjour.length() - 1 - i);
		}

		System.out.println(tempArray);
		String reverseString = new String(tempArray);

		System.out.println(reverseString);

		System.out.println("Easy way to copy a String into a Char[] :");
		bonjour.getChars(0,bonjour.length(),tempArray,0);

		System.out.println("Concat two strings:");
		
		bonjour = bonjour.concat(reverseString);
		System.out.println(bonjour);

		String subString = bonjour.substring(2,5);
		System.out.println(subString);
	}
}