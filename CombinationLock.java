/**
 *
 * @author mikon
 */
public class CombinationLock {

    public CombinationLock() {

        int[] in = {1, 2, 9, 1, 7};
        int[] des = {3, 5, 2, 9, 3};
        int moves = 0;
        int k = 0;
        
        for (int i = 0; i < 5; i++) {
            k = Math.abs(in[i] - des[i]);
            if (k > 5)
                moves += (10-k);
            else 
                moves += k;
        }
        
        System.out.println("Number of moves: "+moves);
   }
            
}
