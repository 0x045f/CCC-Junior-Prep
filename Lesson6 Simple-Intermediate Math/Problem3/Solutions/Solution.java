import java.util.Scanner;
public class Solution {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		int a = Math.abs((x - y + z) / 2);
		int b = Math.abs((y - z + x) / 2);
		int c = Math.abs((z - x + y) / 2);
		int ans1 = a + 10; 
		int ans2 = b + 10;
		int ans3 = c + 10;
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		sc.close();
	}
}