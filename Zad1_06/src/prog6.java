import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class prog6{
        public static void main(String[] args) {
               HashMap<Integer,String> keyValue = new HashMap<Integer,String>();
               keyValue.put(1, "aaa");
               keyValue.put(2, "bbb");
               keyValue.put(3, "ccc");
               System.out.println("Цикл While:");
               Iterator iter = keyValue.entrySet().iterator();
               while(iter.hasNext()) {
                       Map.Entry qurentMe = (Map.Entry) iter.next();
                       System.out.println("Ключ " + qurentMe.getKey() + ": " + qurentMe.getValue());
               }
               System.out.println("Цикл For:");
               for(Map.Entry qurentMe2: keyValue.entrySet()) {
                       System.out.println("Ключ " + qurentMe2.getKey() + ": " + qurentMe2.getValue());
               }
        }
}