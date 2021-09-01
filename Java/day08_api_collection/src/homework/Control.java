package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Control {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> list = new ArrayList<>();

		while (true) {
			System.out.println("1 : �� �߰� \t 2 : �� ����");
			System.out.println("3 : �� ���� \t 4 : �� ��� \t 0 : ����");
			int controller = sc.nextInt();
			switch (controller) {
			case 0:
				break;
			case 1: // �� �߰�
				create(list);
				continue;
			case 2: // �� ����
				delete(list);
				continue;
			case 3: // �� ����
				update(list);
				continue;
			case 4:
				read(list);
				continue;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;
		}
	}

	public static void create(List<Customer> list) {
		Scanner sc = new Scanner(System.in);
		Customer cu = new Customer();

		System.out.print("�� �̸� : ");
		cu.setName(sc.nextLine());
		System.out.print("�� �ּ� : ");
		cu.setAddress(sc.nextLine());
		System.out.print("�� ��ȭ��ȣ : ");
		cu.setTel(sc.nextLine());
		cu.setId(list.size() + 1);

		for (Customer item : list) {
			if (item.getId() == cu.getId()) {
				cu.setId(cu.getId() + 1);
			}
		}

		System.out.println("�ݰ����ϴ�. " + cu.getName() + " ������ id�� " + cu.getId() + "�Դϴ�.");
		list.add(cu);
	}

	public static void read(List<Customer> list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	public static void delete(List<Customer> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���̵� �Է��ϼ��� : ");
		int temp = sc.nextInt();

		list.remove(temp - 1);

	}

	public static void update(List<Customer> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���̵� �Է��ϼ��� : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Customer item : list) {
			int i = 0;
			if (item.getId() == temp) {
				System.out.print("�� �̸� : ");
				item.setName(sc.nextLine());
				System.out.print("�� �ּ� : ");
				item.setAddress(sc.nextLine());
				System.out.print("�� ��ȭ��ȣ : ");
				item.setTel(sc.nextLine());
				list.set(i, item);
			}
			i++;
		}
	}
}
