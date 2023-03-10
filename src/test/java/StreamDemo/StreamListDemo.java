package StreamDemo;

import com.sun.jna.platform.unix.X11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListDemo {

    public static void main(String[] args) {

        List<String> list= new ArrayList<String>();
        list.add("Banana");
        list.add("Kiwi");
        list.add("Apple");
        list.add("Orange");


        //Ascending order
      List<String> sortedList=  list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted List:-----"+sortedList);


        List<String> sortedList1=  list.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("Sorted list using o1, o2:--"+sortedList1);


        List<String> sortedList2=  list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list without:--"+sortedList2);


        //Descending order

        List<String> sortedDesList=  list.stream().sorted(Comparator.reverseOrder() ).collect(Collectors.toList());
        System.out.println("Sorted List:-----"+sortedDesList);


        List<String> sortedDesList1=  list.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println("Sorted list using o1, o2:--"+sortedDesList1);





    }
}

