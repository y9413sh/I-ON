package video.map;

import java.util.Scanner;

public class VideoRentalService {
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print("<1>�������� �߰� <2>�뿩���� ��� <3>�뿩���� ���� <4>���� ���� <5>EXIT : ");
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