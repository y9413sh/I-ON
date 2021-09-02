package ex01.collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("kosa", "123");
		map.put("zzzz", "1004");
		map.put("ssss", "hi");
		map.put("kosa", "123");
		
		System.out.println("��� ���� : " + map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password �Է��ϼ���. ");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pw : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if(!map.get(id).equals(pw)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} else {
					System.out.println(id + "�� " + pw + "�� ��ġ�մϴ�");
					break;
				}
			}
		}
	}
}
