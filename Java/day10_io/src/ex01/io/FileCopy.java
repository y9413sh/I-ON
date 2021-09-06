//*
package ex01.io;
import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception { //����ó�� ����
		//�бⰴü - FileInputStream
		InputStream is = new FileInputStream("Koala.jpg");
		//���ⰴü - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		//byte[] buffer = new byte[1024 * 8];  //
		
		long start = System.currentTimeMillis();  //���� �ð� ����
		
		while(true) {
			int inputData = is.read();
			if( inputData == -1 ) break;
			os.write(inputData);
		}
		
//		while(true) {
//			int inputData = is.read(buffer); // buffer ũ�⸸ŭ �о����
//			if( inputData == -1 ) break;
//			os.write(buffer, 0, inputData); //
//		} //end while
		
		long end = System.currentTimeMillis(); // ���� �ð� ���� 
		
		System.out.println(end - start); //����(�۾�)�� �ɸ� �ð� ����
		
		is.close();		os.close();
		System.out.println("copy success!!!");
		
	}
}
//*/



/*
package ex05.io;
import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception { //����ó�� ����
		//�бⰴü - FileInputStream
		InputStream is = new FileInputStream("Koala.jpg");
		//���ⰴü - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read();
			if( inputData == -1 ) break;
			os.write(inputData);
		} //end while
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); //����(�۾�)�� �ɸ� �ð� ����
		
		is.close();		os.close();
		System.out.println("copy success!!!");
		
	}
}
//*/

