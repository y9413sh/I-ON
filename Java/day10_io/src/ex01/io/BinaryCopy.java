package ex01.io;
import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		
//		File src = new File("C:\\Windows\\explorer.exe");
		File src = new File("C:\\Users\\dev\\Documents\\workspace-spring-tool-suite-4-4.11.1.RELEASE\\다운로드.jfif");
		File dist = new File("C:\\Users\\dev\\OneDrive\\바탕 화면\\다운로드.jfif");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); //파일입력바이트 스트림 연결
			fos = new FileOutputStream(dist); //파일 출력 바이트스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결
			
			while( (c = bis.read()) != -1 ) {
				bos.write((char)c );
			} // while end
			
			System.out.println("파일 복사 성공");
			bis.close();			bos.close();
			fis.close();			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생!!!");
			//e.printStackTrace();
		} //end try
		
	}

}









