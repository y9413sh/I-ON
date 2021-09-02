package ex04.io;

public class InputStreamTest {
	public static void main(String[] args) {
		System.out.print("input = ");

		try {
			int su;

			while ((su = System.in.read()) != -1) {

				if (su == 10 || su == 13 || su == 32)
					continue;
				if (su == 113 || su == 81)
					break; // 'q' || 'Q'

				char ch = (char) su;
				System.out.println(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
