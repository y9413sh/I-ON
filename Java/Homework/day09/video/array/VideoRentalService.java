package video.array;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VideoRentalService {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		List<Video> list = new ArrayList<>();

		while (true) {
			System.out.println("1 : ���� �߰� \t 2 : ���� ����");
			System.out.println("3 : ���� ���� \t 4 : ���� ��Ȳ");
			System.out.println("5 : ���� �뿩 \t 6 : ���� �ݳ� \t 0 : ����");
			String controller = sc.nextLine();
			switch (controller) {
				case "0":
					break;
				case "1": // �� �߰�
					VideoController.create(list);
					continue;
				case "2": // �� ����
					VideoController.delete(list);
					continue;
				case "3": // �� ����
					VideoController.update(list);
					continue;
				case "4":
					VideoController.read(list);
					continue;
				case "5":
					VideoController.rental(list);
					continue;
				case "6":
					VideoController.rentalCancle(list);
					continue;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
			break;
		}
	}
}