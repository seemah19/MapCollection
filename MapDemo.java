import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> companies = new HashMap<>();
        companies.put(1, "infosys");
        companies.put(2, "Amazon");
        companies.put(3, "Google");
        companies.put(4, "microsoft");

        System.out.println("iterating map using jaava5 for each loop ");
        for (Integer key:companies.keySet()){
            System.out.println("---------------------");

            System.out.println("key : "+ key+" value:"+ companies.get(key));

        }


    }
}
