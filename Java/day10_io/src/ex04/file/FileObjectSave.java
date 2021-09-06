package ex04.file;

import java.io.*;

public class FileObjectSave {
	public static void main(String[] args) throws IOException {
		String name = null;
		String id = null;
		String pwd = null;
		boolean gender = true;
		int age =0;
		String phone = null;
		String temp = null;
		
		/*InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream  oos = null;
		File f = new File("members.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f, true);  //append mode
			oos = new ObjectOutputStream(fos);
			
			System.out.println("--------------------ȸ�� ���� �Է� �ϱ� ------------------------------");
			System.out.print("�̸� >> ");  		name = br.readLine();
			System.out.print("ID >> "); 		id = br.readLine();
			System.out.print("Password >> "); 	pwd = br.readLine();
			
			System.out.print("����(m,f) >> ");  	temp = br.readLine();
			if( temp.toLowerCase().equals("m")) gender = true;
			else 		gender = false;
			
			System.out.print("���� >> ");  		age = Integer.parseInt( br.readLine() );
			System.out.print("��ȭ��ȣ >> ");  	phone = br.readLine();
			oos.writeObject(name);
			oos.writeObject(id);
			oos.writeObject(pwd);
			oos.writeObject(gender);
			oos.writeObject(age);
			oos.writeObject(phone);
			System.out.println("members.txt  save!!!");		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		} // try end
	}
}






