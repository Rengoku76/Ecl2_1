import java.util.Scanner;
public class prog4
{
   public static void main(String args[])
   {
      int a, b;
      System.out.println("������� ������ �������� a � b:");
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextInt();
      b = scanner.nextInt();
      System.out.println("�� ������ ����������:\na = "+a+"\nb = "+b);
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("����� ������ ���������� ��� ������������� ����������:\na = "+a+"\nb = "+b);
   }
}