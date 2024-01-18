import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

        System.out.println("iterating map in java using keyset Iterator ");
        System.out.println("--------------------------");
        Set<Integer> keyset = companies.keySet();
        Iterator<Integer> keyIterator = keyset.iterator();;
        while(keyIterator.hasNext()){
            System.out.println("----------------");
            Integer key = keyIterator.next();
            System.out.println("key: "+key + " "+companies.get(key));
        }
        System.out.println("looping map in java using entryset and java5 for loop ");
        Set<Map.Entry<Integer,String>> entrySet = companies.entrySet();
        for(Map.Entry<Integer,String> entry: entrySet){
            System.out.println("--------------------------");
            System.out.println("key + " +entry.getKey()+ "value: "+entry.getValue());
        }

        Set<Map.Entry<Integer,String >> entrySet1 = companies.entrySet();
        Iterator<Map.Entry<Integer,String >> entryIterator = entrySet1.iterator();
        while (entryIterator.hasNext()){
            System.out.println("--------------");
            Map.Entry entry =entryIterator.next();
            System.out.println("key : "+ entry.getKey() + " value "+entry.getValue());
        }
    }
}
