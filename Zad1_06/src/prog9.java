import java.util.*;
public class prog9 {
        public static void main(String[] args) {
               ArrayList testList = new ArrayList();
               testList.add("10");
               testList.add("20");
               testList.add("30");
               System.out.println("Цикл For:");
               for(int i=0; i< testList.size(); i++) {
                       System.out.println(testList.get(i));
               }
               System.out.println("Цикл While:");
               Iterator iter = testList.iterator();
               while(iter.hasNext()) {
                       System.out.println(iter.next());
               }
               System.out.println("Улучшенный цикл For:");
               for(Object o : testList) {
                       System.out.println(o);
        }
               
}
}