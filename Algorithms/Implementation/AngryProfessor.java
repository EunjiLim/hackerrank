import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
<Problem Statement>
A Discrete Mathematics professor has a class of N  students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K  students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.


<Input Format>
The first line of input contains T , the number of test cases. 

Each test case consists of two lines. The first line has two space-separated integers, N  (students in the class) and K  (the cancelation threshold). 
 The second line contains N  space-separated integers (a 1 ,a 2 ,¡¦,a N  ) describing the arrival times for each student.

Note: Non-positive arrival times (a i ¡Â0 ) indicate the student arrived early or on time; positive arrival times (a i >0 ) indicate the student arrived a i   minutes late.

<Output Format>
For each test case, print the word YES if the class is canceled or NO if it is not. 
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int r=0;
            for(int a_i=0; a_i < n; a_i++){
                if(a[a_i] <= 0)
                    r++;
            }
            if(r >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
