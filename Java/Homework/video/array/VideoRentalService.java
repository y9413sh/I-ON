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
			System.out.println("1 : 비디오 추가 \t 2 : 비디오 삭제");
			System.out.println("3 : 비디오 수정 \t 4 : 비디오 현황");
			System.out.println("5 : 비디오 대여 \t 6 : 비디오 반납 \t 0 : 종료");
			String controller = sc.nextLine();
			switch (controller) {
				case "0":
					break;
				case "1": // 고객 추가
					VideoController.create(list);
					continue;
				case "2": // 고객 삭제
					VideoController.delete(list);
					continue;
				case "3": // 고객 수정
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
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			break;
		}
	}
}