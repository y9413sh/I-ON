package ex03.io;

import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
		Grade vo = new Grade();
//		vo.setSubject("�̼�");
//		vo.setScore(80);
		vo.setScore(90);
		vo.setSubject("전산");
		
		System.out.println(vo);
		OutputStream os = new FileOutputStream("grade.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo); //
		oos.close();
	}
}






