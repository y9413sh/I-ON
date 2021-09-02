package ex06.file;
import java.io.*;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
				//throws FileNotFoundException ���� �߻�
		
		Scanner sc = new Scanner(System.in);
		
		try {
			OutputStream os = new FileOutputStream("memo.txt"); //�����
			//OutputStream os = new FileOutputStream("C:\\th129_java_web_app_developer\\1_Java\\test.dat"); //������
			//OutputStream os = new FileOutputStream("C:/IDE/sample.txt"); //������
			
			while(true) {
				System.out.println("���ڿ� �Է� ��� : ");
				String str = sc.nextLine() + "\r\n";
				
				if( str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes()); //�о���� ���� str�� ����(getBytes())��ŭ ���ּ���.
				//System.out.println(str); //ȭ�����
			} //end while
			
			System.out.println("memo.txt save success!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}





