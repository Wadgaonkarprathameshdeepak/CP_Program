import java.util.*;

class JollyJumper {

    /**
     * This program determines if a sequence is a jolly jumper.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Read the number of elements in the sequence from the user.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an array to store the elements of the sequence.
        int[] a = new int[n];

        // Read the elements of the sequence from the user.
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Create an array to store the differences between successive elements in the sequence.
        int[] differences = new int[n - 1];

        // Calculate the differences between successive elements in the sequence.
        for (int i = 1; i < n; i++) {
            differences[i - 1] = Math.abs(a[i] - a[i - 1]);
        }

        // Sort the differences array.
        Arrays.sort(differences);

        // Check if each element in the differences array is equal to its index + 1.
        // If all elements are equal to their index + 1, then the sequence is a jolly jumper.
        // Otherwise, the sequence is not a jolly jumper.
        boolean isJolly = true;
        for (int i = 0; i < n - 1; i++) {
            if (i + 1 != differences[i]) {
                isJolly = false;
                break;
            }
        }

        // Print the result.
        if (isJolly) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not Jolly");
        }
    }
}
