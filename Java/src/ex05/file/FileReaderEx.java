package ex05.file;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) 
			throws IOException { //
		
		int i =0;
		String file;
		BufferedReader br = new BufferedReader(
			      new InputStreamReader(System.in));
		
		System.out.println("�о� �� ���ϸ��� �Է��ϼ���. ----> ");
		file = br.readLine();
		
		System.out.println(file + " ������ ������..... ");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while( (i = reader.read() ) != -1 ) {
			System.out.print((char)i + " ");
			if( fr.equals("\n")) System.out.println();
		}
		
		fr.close();
	}
}










