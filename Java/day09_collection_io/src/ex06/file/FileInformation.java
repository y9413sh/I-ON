package ex06.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {  // ����ó�� ����
		
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.print("file name = "); // ����� - momo.txt
				//������ - C:\th129_java_web_app_developer\1_Java\th129_class_java ���ں� ����.txt
		System.in.read(fileName); // ���ܹ߻�
		strName = new String(fileName).trim(); //������ �о ���� �̸� �޾ƿ�
		
		file = new File(strName);
		
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + file.getCanonicalPath());
		System.out.println("���� ������ : " + new Date(file.lastModified()));
		System.out.println("����ũ�� : " + file.length());
		System.out.println("�б�Ӽ� : " + file.canRead());
		System.out.println("����Ӽ� : " + file.canWrite());
		System.out.println("���ϰ�� : " + file.getPath());
		System.out.println("����Ӽ� : " + file.isHidden());
		
	}
}