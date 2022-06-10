import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단 숫자 하나를 입력하시오");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다");

		} else {
			int w = 1;
			int total;

			do {
				total = w * a;
				System.out.println(a + " * " + w + " = " + total);

				w++;
			} while (w < 10);

		}
		sc.close();

	}

}
