import java.util.Scanner;
public class prog3 {
        public static void main(String[] args) {
               int a, b, temp;
               System.out.println("Введите значения a и b:");
               Scanner scanner = new Scanner(System.in);
               a = scanner.nextInt();
               b = scanner.nextInt();
               System.out.println("До обмена значениями: \na = "+a + "\nb = "+b);
               temp = a;
               a = b;
               b = temp;
               System.out.println("После обмена значениями: \nb = "+a + "\na = "+b);
        }
}