import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNicePair {

    public static void main(String[] args) throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("src/main/resources/input.txt"));
        List<Integer> lines = new ArrayList<>();
        String line = abc.readLine();
        abc.close();
        int[] nums = Arrays.stream(line.replace("[","").replace("]","").split(",")).map(x->Integer.parseInt(x)).mapToInt(x->x).toArray();
//        int[] nums = {13, 10, 35, 24, 76};
        System.out.println(nums.length);
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int num : nums) {
            int rev = num - reverse(num);
            tracker.put(rev, tracker.getOrDefault(rev, 0) + 1);
        }
        System.out.println((tracker.entrySet().stream().filter(x -> x.getValue() >= 2).mapToInt(x -> (x.getValue() * (x.getValue() - 1)) / 2).sum() % (Math.pow(10, 9) + 7)));
    }

    public static int reverse(int num) {
        String rev = String.valueOf(num);
        String ans = "";
        for (int i = rev.length() - 1; i >= 0; i--) {
            ans += rev.charAt(i);
        }
        return Integer.parseInt(ans);
    }
}
