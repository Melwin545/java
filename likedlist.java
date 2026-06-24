import java.util.LinkedList;
public class Main{
    public static void main(String[]args){
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(1);
        System.out.println(list);
        list.addFirst(45);
         System.out.println(list);
        list.addLast(87);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}