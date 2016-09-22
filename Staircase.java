import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mikon
 */
public class Staircase {

    public Staircase(int n) {

        for(int i=1; i <= n; i++){
            String hash = "";
            for(int j=0; j < n-i; j++)
                hash += " ";
            for(int k=0; k < i; k++)
                 hash += "#";
            System.out.println(hash);
        }
        // n-i spaces + i hashes
    }
}
