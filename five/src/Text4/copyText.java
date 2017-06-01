package Text4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入源文件路径");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入目标文件路径");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String src = br1.readLine();
		String tag = br2.readLine();
		copyFile(src, tag);

	}
	public static void copyFile(String srcFile,String tagFile) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(srcFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tagFile));
		String line = null;
		while((line = bf.readLine())!= null){
			bw.write(line);
			bw.newLine();
		}
		bf.close();
		bw.close();
	}
}
