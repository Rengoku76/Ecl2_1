import java.util.Scanner;
public class prog4
{
   public static void main(String args[])
   {
      int a, b;
      System.out.println("Введите нужные значения a и b:");
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextInt();
      b = scanner.nextInt();
      System.out.println("До обмена значениями:\na = "+a+"\nb = "+b);
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("После обмена значениями без промежуточной переменной:\na = "+a+"\nb = "+b);
   }
}