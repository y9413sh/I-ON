package ex04.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave2 {
	public static void main(String[] args) throws IOException {
		// �̸� ���� �μ�
		String name = null;
		String position = null;
		String part = null;
		boolean con = true;

		/*
		 * FileObjectSave ������ �����ð��� �� ����� ��κ� �����մϴ�. ��� �Է����� �˷��ִ� boolean���� con��
		 * ���� ���� �Է��� �޽��ϴ�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("emp.txt");
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f, true); // append mode
			oos = new ObjectOutputStream(fos);

			while (con) {
				System.out.println("----------------ȸ�� ���� �Է� �ϱ� ----------------------");
				System.out.print("�̸� >> ");
				name = br.readLine();
				System.out.print("���� >> ");
				position = br.readLine();
				System.out.print("�μ� >> ");
				part = br.readLine();

				oos.writeObject(name);
				oos.writeObject(position);
				oos.writeObject(part);

				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					con = false;
				}

			} // while end

			System.out.println("emp.txt  save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
//			fos.close();
		} // try end
	}
}
