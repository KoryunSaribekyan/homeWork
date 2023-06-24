package org.HomeWorks2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class HashSet {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        for (int i = 0; i < 10; i++) {
            myHashSet.add(new Random().nextInt(1000));
        }
        Iterator<Integer> iterator = myHashSet.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
            System.out.println();
        }
    }
}

class MyHashSet<E>{
    private HashMap<E,Object> map =   new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E i){
        return map.put(i, OBJECT ) == null;
    }
    public boolean delete(E i){
        return map.remove(i,OBJECT);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        return map.isEmpty();
    }
    public boolean contains(Object i){
        return map.containsKey(i);
    }
    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }
    public E getElementByIndex (int index){
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
        }
    }

