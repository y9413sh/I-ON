package ex04.io;

import java.io.IOException;

public class KeyInput {
	public static void main(String[] args) throws IOException {   // ����ó�� ����
		
		int su1 = 0, su2 =0;
		System.out.println("������ �Է� ���� Ctrl + Z ��������. ");
		
		while( (su1 = System.in.read()) != -1 ) {
			System.out.print((char)su1 + "\t");
		}
		System.out.println();
	}
}
