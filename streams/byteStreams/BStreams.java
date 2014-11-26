import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BStreams {
	public static void main(String args[]){
		FileInputStream in = null;
		FileOutputStream out = null;

		try{
			in = new FileInputStream("textToCopy.txt");
			out = new FileOutputStream("textCopied.txt");
			int c;

			while((c = in.read()) != -1){
				out.write(c);
			}
		} catch(IOException ex){
			System.out.println("Error handling file"+ex.getMessage());
		}finally {
			try{
				if(in != null){
				in.close();
			}
			if(out != null){
				out.close();
			}
		} catch(IOException ex){
			System.out.println("Error closing file"+ex.getMessage());
		}
		}
	}
}