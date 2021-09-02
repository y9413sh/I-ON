package video.array;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VideoController {
	public static void create(List<Video> list) {
		Scanner sc = new Scanner(System.in);
		Video vd = new Video();

		System.out.print("���� ���� : ");
		vd.setTitle(sc.nextLine());
		System.out.print("���� ī�װ� : ");
		vd.setCategory(sc.nextLine());
		vd.setRent(true);
		vd.setId(list.size() + 1);

		for (Video item : list) {
			if (item.getId() == vd.getId()) {
				vd.setId(vd.getId() + 1);
			}
		}

		System.out.println(vd.getTitle() + " ������ ��ϵǾ����ϴ�.\n���� ���� id�� " + vd.getId() + "�Դϴ�.");
		list.add(vd);

	}

	public static void read(List<Video> list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	public static void delete(List<Video> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� id : ");
		int temp = sc.nextInt();

		int i = 0;
		for (Video item : list) {
			if (item.getId() == temp) {
				break;
			}
			i++;
		}
		list.remove(i);
		System.out.println();
	}

	public static void update(List<Video> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� id : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				System.out.print("���� ���� : ");
				item.setTitle(sc.nextLine());
				System.out.print("���� ī�װ� : ");
				item.setCategory(sc.nextLine());
				list.set(i, item);
			}
			i++;
		}
	}
	
	public static void rental(List<Video> list) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� id : ");
		int temp = sc.nextInt();
		sc.nextLine();
		
		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				if(!item.isRent()) {
					System.out.println("�뿩 �Ұ���");
					break;
				}
				System.out.print("�� �̸� : ");
				item.setRentName(sc.nextLine());
				item.setRentDate();
				item.setRent(false);
				list.set(i, item);
			}
			i++;
		}
	}
	
	public static void rentalCancle(List<Video> list) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� id : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				if(item.isRent()) {
					System.out.println("������ �뿩 ������ �ʽ��ϴ�.");
					break;
				}
				item.setRentName("");
				item.rentDate="";
				item.setRent(true);
				list.set(i, item);
			}
			i++;
		}
	}
}
