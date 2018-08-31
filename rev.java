import lang.stride.*;
import java.util.*;

/**
 * 
 */
public class rev
{

    /**
     * 
     */
    static public void main()
    {
        Scanner in =  new  Scanner(System.in);
        int n;
        int x;
        int s = 0;
        System.out.println("enter no.");
        n = in.nextInt();
        while (n > 0) {
            x = n % 10;
            n = n / 10;
            s = s * 10 + x;
        }
        System.out.println("reverse no. is " + s);
    }
}
