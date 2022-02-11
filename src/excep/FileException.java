package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) {
		File file = new File("1234.txt");
		int data = 0;
		FileInputStream fis = null;
		
		try {
				fis = new FileInputStream(file);

			while ((data = fis.read()) != -1) {
							//firc.read => 1,2,3,4 한글자씩 읽어주겠다.          != -1  => -1 더이상 내보낼 숫자가 없을때 돌려보낸다. 
				System.out.println((char) data);
			}
			
		} catch (Exception el) {

		} finally {
			try {
				if(fis != null)fis.close();
			} catch (IOException e) {

			}
			
		}

	}

}
