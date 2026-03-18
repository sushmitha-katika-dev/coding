import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {

    public static void sortByFrequency(int[] arr) {
        // Map to store frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Convert array to list for sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);

        // Sort using custom comparator
        Collections.sort(list, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) return freq.get(b) - freq.get(a);
            return a - b;
        });

        // Convert list back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 1, 2};

        sortByFrequency(arr);

        
    }

}
