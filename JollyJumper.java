import java.util.*;

class JollyJumper {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] differences = new int[n - 1];

        for (int i = 1; i < n; i++) {
            differences[i - 1] = Math.abs(a[i] - a[i - 1]);
        }

        Arrays.sort(differences);

       
        boolean isJolly = true;
        for (int i = 0; i < n - 1; i++) {
            if (i + 1 != differences[i]) {
                isJolly = false;
                break;
            }
        }

        if (isJolly) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not Jolly");
        }
    }
}
