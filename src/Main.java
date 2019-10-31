import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 4; i++) {
            arr.addLast(i);
        }
        arr.add(3, 6);
        System.out.println(arr);

        arr.addFirst(122);
        System.out.println(arr);

        System.out.println(arr.get(2));
        arr.set(2,10);
        System.out.println(arr.get(2));

        System.out.println(arr.remove(3));
        System.out.println(arr.removeFirst());
        System.out.println(arr.removeLast());
        System.out.println(arr);


    }
}
