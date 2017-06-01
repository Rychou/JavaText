package Text5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\Text5\\Text5_1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\src\\Text5\\Text5_2.txt"));
		String line = null;
		int num =0;
		while((line = br.readLine())!=null){
			num++;
			bw.write(num+".");
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
