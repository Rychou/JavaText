package Text2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\Text2\\Text.java"));
		String line = null;
		while((line = br.readLine())!= null){
			System.out.println(line);
		}
		br.close();
	}

}
