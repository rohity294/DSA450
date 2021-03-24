package dsa450;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String args[]){
        Map m = new HashMap();
        m.put("1","India");
        m.put("2","Russia");
        m.put("1","US");
        m.put("3","Canada");
        Set s = m.entrySet();//converting map to set
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            System.out.println(mapElement.getKey()+":"+mapElement.getValue());
        }
        System.out.println("Size:"+m.size());
    }
}
