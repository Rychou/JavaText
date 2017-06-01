package Text6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Text6 {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入电话和姓名!格式如 xxx,张三");
		System.out.println("输入“Done”结束输入");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(".\\src\\Text6\\Info.txt", true));
		String line =null;
		while(true){
			line = br.readLine();
			if("Done".equals(line))
				break;
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader br2 = new BufferedReader(new FileReader(".\\src\\Text6\\Info.txt"));

		while((line = br2.readLine())!=null){
			pw.println(line);
		}
		pw.close();
	}

}
