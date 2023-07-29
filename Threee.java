//1import java.util.*;
import java.util.Scanner;

class Threee{
    public static void main (String[] args) {
        System.out.println("Enter the no :");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int count =0;


        while(n!=1){
        if (n% 2 ==0)
            n=n/2;
        else
       n=((3*n)+1);
              System.out.println(n);}

        count+=1;
       System.out.println(count);
    }
}