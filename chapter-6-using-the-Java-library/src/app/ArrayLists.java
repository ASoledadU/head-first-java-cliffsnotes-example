import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        String a = new String("Whoohoo");
        myList.add(a);
        System.out.println("a = " + a);

        String b = new String("Frog");
        myList.add(b);
        System.out.println("b = " + b);

        int theSize = myList.size();
        System.out.println("the size of the list is = " + theSize);

        Object o = myList.get(1);
        System.out.println("The item at index 1 is: " + o);

        myList.remove(1);
        System.out.println("New list: " + myList);

        boolean isIn = myList.contains(b);
        System.out.println("True or False: " + isIn);

    }
}