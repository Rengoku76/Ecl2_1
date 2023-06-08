import java.util.Scanner;
public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if (n>1)
		{
			if (n%2==0)
			{
				System.out.println(n/2);
			}
			else if (n==1)
			{
				System.out.println("Ошибка");
			}
			else
				System.out.println(n);
		}
	}

}
