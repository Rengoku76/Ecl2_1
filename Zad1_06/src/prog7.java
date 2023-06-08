import java.util.Scanner;
public class prog7 {
        public static void main(String[] args) {
               int temp, number;
               System.out.print("Введите число: ");
               boolean numberIsPrime = true;
               Scanner scanner = new Scanner(System.in);
               number = scanner.nextInt();
               scanner.close();
               for (int x = 2; x<= number /2; x++) {
                       int tempNumber = number %x;             
                       if (tempNumber == 0) {
                               numberIsPrime = false;
                               break;
                       }
               }
               if(numberIsPrime)
                       System.out.println("Число "+number+" является простым");
                       else
                               System.out.println("Число "+number+" не является простым");
        }
}