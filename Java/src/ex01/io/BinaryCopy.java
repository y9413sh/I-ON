package ex01.io;
import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		
//		File src = new File("C:\\Windows\\explorer.exe");
		File src = new File("C:\\Users\\dev\\Documents\\workspace-spring-tool-suite-4-4.11.1.RELEASE\\�ٿ�ε�.jfif");
		File dist = new File("C:\\Users\\dev\\OneDrive\\���� ȭ��\\�ٿ�ε�.jfif");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); //�����Է¹���Ʈ ��Ʈ�� ����
			fos = new FileOutputStream(dist); //���� ��� ����Ʈ��Ʈ�� ����
			bis = new BufferedInputStream(fis); // ���� �Է½�Ʈ�� ����
			bos = new BufferedOutputStream(fos); // ���� ��½�Ʈ�� ����
			
			while( (c = bis.read()) != -1 ) {
				bos.write((char)c );
			} // while end
			
			System.out.println("���� ���� ����");
			bis.close();			bos.close();
			fis.close();			fos.close();
			
		} catch (Exception e) {
			System.out.println("���� ���� ���� �߻�!!!");
			//e.printStackTrace();
		} //end try
		
	}

}









