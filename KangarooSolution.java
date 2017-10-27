import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        
        int kang1 = x1; 
        int kang2 = x2; 
        boolean meet = false;
        String willMeet = null;
        while(!meet){
            if(kang1 == kang2){
                meet = true;
                willMeet = "YES";
            }else{
                //increment 
                kang1 += v1; 
                kang2 += v2;
                meet = false;
                if(kang1 > kang2 && v1 >= v2){
                    willMeet = "NO";
                    break;
                }else if(kang2 > kang1 && v2 >= v1){
                    willMeet =  "NO";
                    break;
                }
            }
        }
        return willMeet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
