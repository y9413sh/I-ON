package video.map;

import java.util.Scanner;

public class VideoRentalService {
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print("<1>비디오정보 추가 <2>대여정보 출력 <3>대여정보 수정 <4>비디오 삭제 <5>EXIT : ");
			switch (new Scanner(System.in).nextInt() ) {
				case 1:
					VideoController.insert();
					break;
				case 2:
					VideoController.print();
					break;
				case 3:
					VideoController.modify();
					break;
				case 4:
					VideoController.delete();
					break;
				case 5:
					System.out.println("SEE YOU!!");
					System.exit(0);
					break;
			}// switch
		} // while
	}// main
}