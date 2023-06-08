import java.util.Scanner;
public class prog8{
        public static void main (String[] args) {
               String inputString, reversedString = "";
               Scanner scanner = new Scanner(System.in);
               int stringLength;
               System.out.print("¬ведите число или строку: ");
               inputString = scanner.nextLine();
               stringLength = inputString.length();
               for (int x = stringLength -1; x>=0; x--) {
                       reversedString = reversedString + inputString.charAt(x);
               }
               System.out.println("ѕеревернутое значение: " + reversedString);
               if(inputString.equals(reversedString))
                       System.out.println("¬веденное значение €вл€етс€ палиндромом");
               else
                       System.out.println("¬веденное значение не €вл€етс€ палиндромом");
        }
}