import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencySorting {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3, 1, 2, 5, 2};
        System.out.println(Arrays.toString(sort(nums)));
    }

    private static int[] sort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            if(map.containsKey(num)) {
                int val = map.get(num);
                map.put(num, val + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        Collections.sort(sortedList, (a, b) -> {
            if(a.getValue().equals(b.getValue())) {
                return Integer.compare(a.getKey(), b.getKey());
            } else {
                return Integer.compare(b.getValue(), a.getValue());
            }
        });

        int[] sortedArray = new int[arr.length];
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : sortedList) {
            int num = entry.getKey();
            int freq = entry.getValue();
            for(int i = 0; i < freq; i++) {
                sortedArray[idx++] = num;
            }
        }

        return sortedArray;
    }
}
