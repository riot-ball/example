import java.util.*;
class vtrue
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        String i,a;
        while(true)
        {
            a=in.next();
            if(a.equals("end"))
                break;
            else
                System.out.println(a);
        }
    }
}    