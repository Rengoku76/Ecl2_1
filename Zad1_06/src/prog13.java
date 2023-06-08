public class prog13{
          public static void main(String[] args) {
                  String st = new String("Клавиша");
                  int counter = 0;
                  char[] charsArray = st.toCharArray();
                  System.out.println("Повторяющиеся символы:");
                  for (int i=0; i<st.length();i++) {
                              for(int j=i+1; j<st.length();j++) {
                                         if (charsArray [i] == charsArray [j]) {
                                                    System.out.println(charsArray [j]);
                                                    counter ++;
                                                    break;
                                          }
                               }
                   }
           }
}