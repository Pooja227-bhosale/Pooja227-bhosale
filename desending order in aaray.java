/* Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]
*/

package Java_Internship;

import java.util.Arrays;
import java.util.Collections;

public class Descending_order {
    public static void main(String[] args) {
        String[] arr = {"P", "J", "A", "S", "V", "R", "K", "B"};
        
        
        Arrays.sort(arr, Collections.reverseOrder());  // Sorting the array in descending order
        
        
        System.out.println("Sorted Array in Descending_order : "+ Arrays.toString(arr));  // Display the sorted array
    }
}

/*OUTPUT

Sorted Array in Descending Order : [V, S, R, P, K, J, B, A]
*/