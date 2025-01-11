import java.util.HashMap;

public class Q05 {
    public static void findMostFrequent(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = -1;

        for (int key : countMap.keySet()) {
            if (countMap.get(key) > maxCount) {
                maxCount = countMap.get(key);
                mostFrequent = key;
            }
        }

        System.out.println("Element appearing maximum times: " + mostFrequent + " (count: " + maxCount + ")");
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 3, 7, 3, 9, 9, 9};
        findMostFrequent(arr);
    }
}
