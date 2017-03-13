//This is a longer process to read through a java file

package builds;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mono {
	private static final String FILENAME = "c:\\Users\\Xiaomi\\Desktop\\text.txt";
	public static void main(String[] args){
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;
			br = new BufferedReader(new FileReader(FILENAME));
			while ((sCurrentLine = br.readLine())!= null){
				System.out.println(sCurrentLine);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(br!=null)
					br.close();
				if(fr!=null)
					fr.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
			
		}
	}
}
