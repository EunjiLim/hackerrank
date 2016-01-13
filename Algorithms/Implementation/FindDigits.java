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
            int tempN = n;
            int[] digits = new int[10];
            int i=0;
            while(tempN != 0){
                digits[i++] = tempN % 10;
                tempN = tempN / 10;
            }
            int num = 0;
            for(int e : digits){
                if(e != 0 && n % e == 0)
                    num++;
            }
            System.out.println(num);
        }
    }
}
