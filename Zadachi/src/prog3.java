import java.util.Scanner;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ягод у Маши ");
Scanner a = new Scanner(System.in);
int x = a.nextInt();
System.out.print("Ягод у Миши ");
Scanner b = new Scanner(System.in);
int y = b.nextInt();
System.out.print("Съели: ");
Scanner c = new Scanner(System.in);
int z = c.nextInt();
if (x+y<z)
{
	System.out.println("Нельзя");
}
else
	System.out.println(x+y-z);
	}

}
