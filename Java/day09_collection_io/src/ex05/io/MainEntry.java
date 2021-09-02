package ex05.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("charactor input = ");
		//String str = br.readLine();
		int su1 = Integer.parseInt(br.readLine());
		int su2 = Integer.parseInt(br.readLine());
		
		//System.out.println(str + 100);
		System.out.println(su1 + su2);
	}
}
