import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.function.Predicate;

public class MyIterator {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("12","2","35","3");
        /*Iterator iterator = lst.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        Predicate<String> pre = i -> i.length()>=2;
        lst.stream().filter(pre).forEach(x -> System.out.println(x));
        Queue<String> q = new ArrayDeque<>();
        q.add("imran");
        q.add("imran1");
        q.add("imran2");
        q.add("imran3");
        q.add("imran4");
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
