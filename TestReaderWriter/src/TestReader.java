import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr=new FileReader("test.txt");
		FileWriter fw=new FileWriter("testcopy.txt");){
			int x=fr.read();
			while(x!=-1) {
				fw.write(x);
				fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
