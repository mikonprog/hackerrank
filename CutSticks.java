/*
 * You are given N sticks (a[]), where the length of each stick is a positive 
 * integer. A cut operation is performed on the sticks such that all of them are
 * reduced by the length of the smallest stick.
 * For each operation, print the number of sticks that are cut, on separate 
 * lines.
 */
package testproject;

import java.util.Arrays;

/**
 *
 * @author mikon
 */
public class CutSticks {

    public CutSticks(int a[]) {
        
        Arrays.sort(a);
        int min = a[0];
        
        System.out.println("Iteration No 1: "+a.length + " sticks cut.");
        //while(i < a.length){
        for(int i=1; i < a.length; i++){
            if(a[i] == min){               
                continue;
            }
            System.out.println("Iteration No "+ (i+1) +": "+(a.length - i)+" sticks cut.");
            min = a[i];
        }
        
    }
}
