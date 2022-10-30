package JavaBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("outputfile.txt");/*if no absolute file path is given, the file will be created in the project directory(In our case its in Java_Learning Folder.)*/
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is the first line to write in my File.\nFile holds the content of Java. \nBasic program logics in java language.");
		bw.close();/*If this line of code is not present, file will be created but it will be empty.*/
	}

}
