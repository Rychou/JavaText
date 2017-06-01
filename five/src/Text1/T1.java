package Text1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class T1 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter(".\\src\\Text1\\text.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("–’√˚£∫Œ∫»Ò ƒÍ¡‰£∫20 ∞‡º∂£∫»Ì5");
		bw.close();
	}
}
