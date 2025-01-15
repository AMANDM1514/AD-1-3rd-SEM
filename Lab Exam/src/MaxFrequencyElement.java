public class MaxFrequencyElement {
    public static int findMaxFrequencyElement(int[] arr) {
        int maxCount = 0;
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        
        return maxElement;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 5, 9, 5, 10, 3};
        int result = findMaxFrequencyElement(arr);
        System.out.println("The element that appears the maximum number of times is: " + result);
    }
}
