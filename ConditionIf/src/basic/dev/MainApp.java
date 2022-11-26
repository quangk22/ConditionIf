package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * 9.1.Viết chương trình nhập vào một sốnguyên. Kiểm tra số đón guyên
		 * dương hay nguyên âm. In ra màn hình kết quả
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap n");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("Đây là số dương");
		} else if (n != 0) {
			System.out.println("Đây là số âm");
		}
		/*
		 * 9.2Viết chương trình nhập vào một số nguyên n. Kiểm tra n chia hết
		 * cho 3hay 5. In kết quả ra màn hình
		 */
		if (n % 3 == 0) {
			System.out.format("%d chia hết cho 3", n);
		}
		if (n % 5 == 0) {
			System.out.format("%d chia hết cho 5", n);
		}
		/*
		 * 9.3.Viết chương trình nhập vào tháng trong năm.In ra số ngày của
		 * tháng đó
		 */
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
			System.out.println("Tháng có 31 ngày ");
		}
		if (n == 4 || n == 6 || n == 9 || n == 11) {
			System.out.println("Tháng có 30 ngày ");
		}
		if (n == 2) {
			System.out.println("Tháng có 28 ngày");
		}
		/*
		 * 9.4.Viết chương trình giải phương trình bậc 2
		 */
		int a, b, c;
		System.out.println("Nhập a");
		a = sc.nextInt();
		System.out.println("Nhập b");
		b = sc.nextInt();
		System.out.println("Nhập c");
		c = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println(" vô số nghiệm");
			} else {
				System.out.println("vô nghiệm");
			}

		} else {
			float x = -b / (float) a;
			System.out.println("x = " + x);
		}
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 =" + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}
		/*
		 * 9.5.Viết chương trình nhập vào 3 sốa, b, c. Kiểm tra có phải là3
		 * cạnh của một tam giác không?
		 */
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Đây là tam giác");

		} else {

			System.out.println("Đây không phải tam giác");
		}
	}

}
