package ex01.io;
import java.io.*;
import java.net.*;

public class UriCopy {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {  //����ó������
		
		URL url = new URL("https://www.google.com/logos/doodles/2019/2019-womens-world-cup-day-6-5696430367309824-s.png");
		
		//�бⰴü
		InputStream is = url.openStream();
		//���ⰴü
		OutputStream os = new FileOutputStream("goole.jpg"); // �����
		
		byte[] buffer = new byte[1024];
		
		while(true) {
			int inputData = is.read(buffer);
			
			if( inputData == -1 ) break;
			
			os.write(buffer, 0, inputData);
		}
		
		is.close();		os.close();
		System.out.println("������ ���� ���� �����߽��ϴ�");
	}
}









