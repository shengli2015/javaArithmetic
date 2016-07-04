import java.util.Scanner;

/**
 * nine * nine table
 * @author shengli
 *
 */
public class HelloWorld {
	public void n2n() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + " ");
			}
			System.out.print("\n");
		}
	}
	public void scaner() {
		Scanner s = new Scanner(System.in);
		System.out.println("shu ru ti shi:");
		String str1 = s.next();
		System.out.println(str1);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = a + b;
		System.out.print(sum);
	}
	public static void main(String [] args) {
		HelloWorld hw1 = new HelloWorld();
		hw1.scaner();
	}
}


