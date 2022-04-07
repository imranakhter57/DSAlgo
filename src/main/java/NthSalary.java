import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@MyAnnotation
public class NthSalary {

    public static void main(String[] args) {
        List<Long>  salaries = new ArrayList<>();
        salaries.add(100l);
        salaries.add(20l);
        salaries.add(30l);
        salaries.add(7l);
        salaries.add(23l);
        salaries.add(21l);
        salaries.add(33l);
        System.out.println(salaries.stream().sorted(Collections.reverseOrder()).skip(2).findFirst());
    }
}
