import java.util.Scanner;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� � ���� ");
Scanner a = new Scanner(System.in);
int x = a.nextInt();
System.out.print("���� � ���� ");
Scanner b = new Scanner(System.in);
int y = b.nextInt();
System.out.print("�����: ");
Scanner c = new Scanner(System.in);
int z = c.nextInt();
if (x+y<z)
{
	System.out.println("������");
}
else
	System.out.println(x+y-z);
	}

}
