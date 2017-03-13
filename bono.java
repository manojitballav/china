//This is a shorter java program to read through line of a text file

package builds;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bono {
	private static final String FILENAME = "c:\\Users\\Xiaomi\\Desktop\\text.txt";
	
	public static void main(String[] args){
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String sCurrentLine;
			while ((sCurrentLine = br.readLine())!=null){
				System.out.println(sCurrentLine);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.print("Done");
	}
	//System.out.println("Done");

}
