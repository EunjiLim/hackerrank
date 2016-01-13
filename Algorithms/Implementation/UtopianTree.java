import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int height = 1;
            for(int a1 = 1 ; a1 <= n ; a1++){
                if(a1%2 == 1) //odd number
                    height = springCycle(height);
                else
                    height = summerCycle(height);
            }
            System.out.println(height);
        }
    }
    
    private static int springCycle(int h){
        return h*2;
    }
    
    private static int summerCycle(int h){
        return h+1;
    }
}