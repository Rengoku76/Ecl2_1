import java.util.Scanner;
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int m1 = a.nextInt();
		Scanner b = new Scanner(System.in);
		int m2 = b.nextInt();
		Scanner c = new Scanner(System.in);
		int m3 = c.nextInt();
		if (m1 >= 94 && m1 <= 727)
		{
			System.out.println("1yes");
		}
		else
			System.out.println("no");
		if (m2 >= 94 && m2 <= 727)
		{
			System.out.println("2yes");
		}
		else
			System.out.println("no");
		if (m3 >= 94 && m3 <= 727)
		{
			System.out.println("3yes");
		}
		else
			System.out.println("no");
		int max=0;
		if (m1>m2 && m1>m3)
		{
			max+=m1;
		}
		else if (m2>m1 && m2>m3)
		{
			max+=m2;
		}
		else max+=m3;
		System.out.println("max"+max);
	}

}
