package dsa450;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayToSet {
    public static void main(String args[]){

        String[] a = {"a","a","b","c"};
        Set s = new HashSet(Arrays.asList(a));
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

