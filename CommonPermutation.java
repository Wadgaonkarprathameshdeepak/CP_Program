import java.util.*;

 class CommonPermutation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] aCounts = new int[256]; // 256 is the ASCII character set size
        int[] bCounts = new int[256];

        for (int i = 0; i < 256; i++) {
            aCounts[i] = bCounts[i] = 0;
        }

        for (int i = 0; i < a.length(); i++) {
            aCounts[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            bCounts[b.charAt(i)]++;
        }

        String longest = "";

        for (int i = 0; i < 256; i++) {
            int count = Math.min(aCounts[i], bCounts[i]); // Find the minimum of the two counts
            for (int j = 0; j < count; j++) { // Add the minimum count to the longest common permutation
                longest += (char) i;
            }
        }

        System.out.println(longest);
    }
}
