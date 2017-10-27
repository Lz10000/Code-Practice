import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1;
        String s2;
        
        s1=scanner.nextLine();
        s2=scanner.nextLine();
        
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hmap2 = new HashMap<Character,Integer>();
        
        for(int i=0;i<s1.length();i++){
            Character c = s1.charAt(i);
            if(!hmap.containsKey(c)){
                hmap.put(c,1);
            }else{
                hmap.put(c,hmap.get(c)+1);
            }
        }
        int counter=0;
        for(int i=0;i<s2.length();i++){
            Character c = s2.charAt(i);
            if(!hmap.containsKey(c)){
                counter++;
            }else{
                if(hmap.get(c) > 1){
                    hmap.put(c,hmap.get(c)-1);
                }else{
                    hmap.remove(c);
                }
            }
        }
        
        if(hmap.size() >0){
           for(Character c : hmap.keySet()){
               if(hmap.get(c) > 0){
                   counter = counter + hmap.get(c);
               }
           }
        }

            System.out.println(counter);
        
    }
}
