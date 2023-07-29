import java.util.*;

public class trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of trip people :");

        int n = sc.nextInt();

        float[] money = new float[n];
        
        float sum = 0;

        for (int i = 0; i < n; i++) {
            money[i] = sc.nextFloat();
            sum += money[i];
        }
        System.out.println("Total of All Member money : "+ sum);


        float avg = sum / n;
        System.out.println("Average of all member money : "+ avg);

        float sumd = 0;

        for (int i = 0; i < n; i++) {
            if (money[i] > avg) {
                sumd += money[i] - avg;
            }
        }

        System.out.println(sumd);
    }
}
