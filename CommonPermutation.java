import java.util.*;

 class CommonPermutation {

    /**
     * This program finds the longest common permutation of two strings.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Read the two strings from the user.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        // Create two arrays to store the counts of each character in the two strings.
        int[] aCounts = new int[256]; // 256 is the ASCII character set size
        int[] bCounts = new int[256];

        // Initialize the counts arrays.
        for (int i = 0; i < 256; i++) {
            aCounts[i] = bCounts[i] = 0;
        }

        // Count the occurrences of each character in the two strings.
        for (int i = 0; i < a.length(); i++) {
            aCounts[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            bCounts[b.charAt(i)]++;
        }

        // Create a string to store the longest common permutation.
        String longest = "";

        // Iterate over all characters and add them to the longest common permutation if they occur in both strings.
        for (int i = 0; i < 256; i++) {
            int count = Math.min(aCounts[i], bCounts[i]); // Find the minimum of the two counts
            for (int j = 0; j < count; j++) { // Add the minimum count to the longest common permutation
                longest += (char) i;
            }
        }

        // Print the longest common permutation.
        System.out.println(longest);
    }
}
