import java.io.console;
import java.io.IOException;
public class Palindrome {
	public static void main(String args[]){
		String theString = console.readline("Enter the string to check if there's a palindrome in it");
		char tempArray = new char[theString.legnth];
		theString.getChars(0, theString.length,tempArray,0);

		//On commence à 1. On checke les lettres à sa gauche et a sa droite. Si ce sont les même on continue
		//Si on arrive 0 ou a length, on arrête 
		String tempBest = new String();
		for(int i = 1 ; i < theString.length ;i++){
			for(int j = 1 ; j < theString.length ; j++){
				if(theString.charAt(i-j) == theString.charAt(i+j)){
					if(i*2+1 > tempBest.length()){
						tempBest = theString.getChars
					}
				}
			}
		}
	}
	public Palindrome(){

	}
	public 
}