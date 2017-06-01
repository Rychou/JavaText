package Text3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\Text3\\Text1.java");
		FileOutputStream fos = new FileOutputStream(".\\src\\Text3\\Text2.java");
		byte[] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b)) != -1){
			fos.write(b, 0, len);
		}
		fis.close();
		fos.close();
	}

}
