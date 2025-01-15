public class TopperFinder {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] marks = {95, 87, 95, 78};
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] < marks[j + 1]) {
                    int tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        int highestMarks = marks[0];
        boolean jointToppers = false;

        System.out.println("Topper(s):");
        System.out.print(names[0]);
        for (int i = 1; i < n; i++) {
            if (marks[i] == highestMarks) {
                jointToppers = true;
                System.out.print(", " + names[i]);
            } else {
                break;
            }
        }

        if (jointToppers) {
            System.out.println("\nResult: Joint Toppers");
        } else {
            System.out.println("\nResult: Unique Topper");
        }
        System.out.println("\nSorted list of students:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }
}
