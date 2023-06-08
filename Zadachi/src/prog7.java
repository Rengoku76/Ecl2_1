import java.util.Scanner;
public class prog7 {
	public static void main(String[] args) {
		int i=1;
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		System.out.println(n);
		while (n%2==0)
		{
			n/=2;
			System.out.println(n);
		}
			if (n>1)
				System.out.println("NO");
			else System.out.println("YES");
		
}}
