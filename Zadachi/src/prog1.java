import java.util.Scanner;
public class prog1 {
	 public static void main(String[] args)
	 {       
int n,m,k;
System.out.print("У белки шишек с орешками: ");
Scanner a = new Scanner(System.in);
n = a.nextInt();
System.out.print("У белки орешков: ");
Scanner b = new Scanner(System.in);
m = b.nextInt();
System.out.print("Необходимо орешков: ");
Scanner c = new Scanner(System.in);
k = c.nextInt();
if (n*m>=k)
{
	System.out.print("Хватит");
}
else
	System.out.print("Не хватит");
}
}