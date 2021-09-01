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
			System.out.println("1 : 고객 추가 \t 2 : 고객 삭제");
			System.out.println("3 : 고객 수정 \t 4 : 고객 출력 \t 0 : 종료");
			int controller = sc.nextInt();
			switch (controller) {
			case 0:
				break;
			case 1: // 고객 추가
				create(list);
				continue;
			case 2: // 고객 삭제
				delete(list);
				continue;
			case 3: // 고객 수정
				update(list);
				continue;
			case 4:
				read(list);
				continue;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
	}

	public static void create(List<Customer> list) {
		Scanner sc = new Scanner(System.in);
		Customer cu = new Customer();

		System.out.print("고객 이름 : ");
		cu.setName(sc.nextLine());
		System.out.print("고객 주소 : ");
		cu.setAddress(sc.nextLine());
		System.out.print("고객 전화번호 : ");
		cu.setTel(sc.nextLine());
		cu.setId(list.size() + 1);

		for (Customer item : list) {
			if (item.getId() == cu.getId()) {
				cu.setId(cu.getId() + 1);
			}
		}

		System.out.println("반갑습니다. " + cu.getName() + " 고객님의 id는 " + cu.getId() + "입니다.");
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

		System.out.print("고객 아이디를 입력하세요 : ");
		int temp = sc.nextInt();

		list.remove(temp - 1);

	}

	public static void update(List<Customer> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("고객 아이디를 입력하세요 : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Customer item : list) {
			int i = 0;
			if (item.getId() == temp) {
				System.out.print("고객 이름 : ");
				item.setName(sc.nextLine());
				System.out.print("고객 주소 : ");
				item.setAddress(sc.nextLine());
				System.out.print("고객 전화번호 : ");
				item.setTel(sc.nextLine());
				list.set(i, item);
			}
			i++;
		}
	}
}
