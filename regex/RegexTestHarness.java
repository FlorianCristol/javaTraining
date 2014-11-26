import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {
	public static void main(String args[]){
		Console console = System.console();
		if(console == null){
			System.err.println("No console.");
			System.exit(1);
		}
		while(true){
			Pattern pattern = Pattern.compile(console.readLine("Enter the Regex "));
			Matcher matcher = pattern.matcher(console.readLine("Enter string to regex on"));

			boolean found = false;
			while(matcher.find()){
				console.format("I found the text" + " \"%s\" " + "index %d and ending at index %d.%n",
					matcher.group(),
					matcher.start(),
					matcher.end());
				}
				if(!found){
					console.format("No match found. %n");
				}
		}
	}
}