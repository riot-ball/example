import java.util.*;
class proj3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i=1;
        String end="end";
        String S;
        while(i>0)
        {
           S=in.nextLine(); 
           System.out.println(S.charAt(0)==S.charAt(S.length()-1)?"special":"not special");                     
           System.out.println(S.length());
           S=" ";           
        }   
    }
}     