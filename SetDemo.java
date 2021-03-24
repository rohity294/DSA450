package dsa450;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetDemo {
    public static void main(String args[]){
        Set myset = new HashSet();
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(2);
        printSet(myset);
    }

    static void printSet(Set myset){
        Iterator itr = myset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Size:"+myset.size());
    }
}
