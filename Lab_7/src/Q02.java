import java.util.HashMap;
public class Q02 {
    public static void printDuplicates(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        boolean hasDuplicates = false;
        System.out.println("Duplicates in the list:");
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > 1) {
                System.out.println(key + " (count: " + countMap.get(key) + ")");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 5, 6, 9, 5, 10};
        printDuplicates(arr);
    }
}
