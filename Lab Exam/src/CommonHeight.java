public class CommonHeight {

    public static int findMostCommonDeviation(int[] heights, int standardHeight) {
        int n = heights.length;
        int[] deviations = new int[n];

        for (int i = 0; i < n; i++) {
            deviations[i] = heights[i] - standardHeight;
        }

        int mostCommonDeviation = deviations[0];
        int maxFrequency = 1;

        for (int i = 0; i < n; i++) {
            int currentDeviation = deviations[i];
            int frequency = 1;

            for (int j = i + 1; j < n; j++) {
                if (deviations[j] == currentDeviation) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostCommonDeviation = currentDeviation;
            }
        }

        return mostCommonDeviation;
    }

    public static void main(String[] args) {
        int[] heights = {170, 175, 180, 175, 165, 170, 175};
        int standardHeight = 170;

        int mostCommonDeviation = findMostCommonDeviation(heights, standardHeight);

        System.out.println("The most common deviation is: " + mostCommonDeviation);
    }
}
