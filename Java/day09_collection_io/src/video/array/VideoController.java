package video.array;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VideoController {
	public static void create(List<Video> list) {
		Scanner sc = new Scanner(System.in);
		Video vd = new Video();

		System.out.print("비디오 제목 : ");
		vd.setTitle(sc.nextLine());
		System.out.print("비디오 카테고리 : ");
		vd.setCategory(sc.nextLine());
		vd.setRent(true);
		vd.setId(list.size() + 1);

		for (Video item : list) {
			if (item.getId() == vd.getId()) {
				vd.setId(vd.getId() + 1);
			}
		}

		System.out.println(vd.getTitle() + " 비디오가 등록되었습니다.\n비디오 고유 id는 " + vd.getId() + "입니다.");
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

		System.out.print("비디오 고유 id : ");
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

		System.out.print("비디오 고유 id : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				System.out.print("비디오 제목 : ");
				item.setTitle(sc.nextLine());
				System.out.print("비디오 카테고리 : ");
				item.setCategory(sc.nextLine());
				list.set(i, item);
			}
			i++;
		}
	}
	
	public static void rental(List<Video> list) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비디오 고유 id : ");
		int temp = sc.nextInt();
		sc.nextLine();
		
		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				if(!item.isRent()) {
					System.out.println("대여 불가능");
					break;
				}
				System.out.print("고객 이름 : ");
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
		
		System.out.print("비디오 고유 id : ");
		int temp = sc.nextInt();
		sc.nextLine();

		for (Video item : list) {
			int i = 0;
			if (item.getId() == temp) {
				if(item.isRent()) {
					System.out.println("비디오가 대여 중이지 않습니다.");
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
