public class prog2 {
        public static void main(String[] args) {
               String st = "Компьютер";
               char symbols[] = st.toCharArray();
               for(int x= symbols.length-1; x>=0; x--) {
                       System.out.print(symbols [x]);
               }
        }
}