import java.util.Scanner;
public class prog1 {
	 public static void main(String[] args)
	 {       
int n,m,k;
System.out.print("� ����� ����� � ��������: ");
Scanner a = new Scanner(System.in);
n = a.nextInt();
System.out.print("� ����� �������: ");
Scanner b = new Scanner(System.in);
m = b.nextInt();
System.out.print("���������� �������: ");
Scanner c = new Scanner(System.in);
k = c.nextInt();
if (n*m>=k)
{
	System.out.print("������");
}
else
	System.out.print("�� ������");
}
}