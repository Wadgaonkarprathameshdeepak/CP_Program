
import java.util.*;
import java.util.Scanner;

class PrimaryArit {
    public static void main(String[] args) {
        	    Scanner sc = new Scanner(System.in);

        while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			       

			if (a == 0 && b == 0) {
				break;
			}
			
		
			int Count = 0;
			int carry = 0;
		
			
			while( a > 0 || b > 0) {
				int d1 = a % 10;
				int d2 = b % 10;
				int sum = d1 + d2 + carry;
				if( sum > 9 ) {
					Count+=1;
					carry = 1;
				}
	    
				a /= 10;
				b /= 10;
			}
			
			if(Count == 0){
			System.out.println("No carry operation.");
			    
			}else if (Count == 1){
			    System.out.println("1 carry operation.");
			}else {
			    System.out.println(Count+ " carry operations.");
			} 	 	
		}
	}
}

    
