package ex04.io;

import java.io.*;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		try {
			System.out.print("���� ���� �Է� : ");
			int num = is.read()-48; //���ܹ߻�. '0'~'9' : 48 ~ 57 ASCII
			is.read(); is.read(); // ���� 2����Ʈ ó��
			int num2 = is.read()-48;
			//System.out.println(num);
			System.out.println(num + num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}