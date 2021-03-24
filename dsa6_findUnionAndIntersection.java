package dsa450;

import java.util.*;

public class dsa6_findUnionAndIntersection {
    public static void main(String args[]){
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
        findUnion(a,b);
        findIntersection(a,b);
    }

    static void findUnion(int[]a,int[]b){
        Map map = new HashMap();

        for(int i=0;i<a.length;i++){
            map.put(a[i],"random");
        }

        for(int i=0;i<b.length;i++){
            map.put(b[i],"random");
        }

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        List list = new ArrayList();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry)itr.next();
            //System.out.println(mapElement.getKey()+":"+mapElement.getValue());
            list.add(mapElement.getKey());
        }

        //System.out.println("size:"+map.size());
        System.out.println("Union with only unique elements are as follows:");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void findIntersection(int a[],int b[]){
        Map m1 = new HashMap();
        for(int item:a){
            m1.put(item,"random");
        }

        Map m2 = new HashMap();
        for(int item:b){
            m2.put(item,"random");
        }

        List list1 = new ArrayList();
        Iterator itr = m1.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement= (Map.Entry)itr.next();
            list1.add(mapElement.getKey());
        }

//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }//1,2,3,5,6


        List list2 = new ArrayList();
        itr = m2.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement= (Map.Entry)itr.next();
            list2.add(mapElement.getKey());
        }

//        for(int i=0;i<list2.size();i++){
//            System.out.println(list2.get(i));
//        }//2,4,5,6,8,9

        List list = new ArrayList();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j)){
                    list.add(list1.get(i));
                }
            }
        }

        System.out.println("The intersection with only unique elements in each list is as follows:");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
