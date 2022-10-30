package JavaBasics;
/*In case outputfile.txt is not present in your code. First run "WriteToFile" class. It will create a file in the project and then you can run the current program successfully*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("outputfile.txt");/*if no absolute file path is given, the file will be created in the project directory(In our case its in Java_Learning Folder.)*/
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)/*Since, br.readLine() doesn't return any true or false. so we need to add null check conditions explicitly */
		{
			System.out.println(s);
		}
		br.close();
	}

}
