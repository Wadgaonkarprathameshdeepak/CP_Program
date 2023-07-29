import java.util.*;
import java.util.Scanner;
public class QWERTY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="QWERTYUIOPASDFGHJKLZXCVBNM";
        String  in = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)==' '){
                ans.append(' ');
            }
            else if(in.charAt(i)=='Q')
            ans=ans.append('Q');
            else{
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==in.charAt(i)){
                        ans=ans.append(s.charAt(j-1));
                        break;
                    }
                }
            }

        }
        System.out.println(ans.toString());
    }
}