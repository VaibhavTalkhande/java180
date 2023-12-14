import java.util.*;
class  Hashsets{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(8));
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet.remove(11));
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.clone());
        myHashSet.clear();
        System.out.println(myHashSet);
    }
}