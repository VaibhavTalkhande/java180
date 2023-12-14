import java.util.*;
public class Linkedlists {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        System.out.println(l1);
        l1.add(0, 5);
        System.out.println("add()"+l1);

        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.set(0, 1);
        System.out.println("set()"+l1);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println("contains()"+l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);
        ad1.addLast(5);
        ad1.offerLast(10);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        System.out.println(ad1.removeFirst());
        System.out.println(ad1.pollFirst());//poll() is same as remove()
        System.out.println(ad1.removeLast());
        System.out.println(ad1.pollLast());
        System.out.println(ad1);
        System.out.println(ad1.remove());
        System.out.println(ad1.poll());
        System.out.println(ad1);
    }
}
