import java.util.HashSet;

public class Q01 {
    public static int findFirstRepeated(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int result = findFirstRepeated(arr);
        System.out.println(result != -1 ? "First repeated element: " + result : "No repeated elements found");
    }
}
