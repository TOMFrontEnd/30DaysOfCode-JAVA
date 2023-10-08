import java.io.*;
import java.util.*;

public class StringToArray
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++)
        {
            String s = sc.nextLine();
            char[] charArray = s.toCharArray();
            //string turn to char
            for(int j=0; j<s.length(); j++)
            {
                if(j%2==0)
                {
                    System.out.print(charArray[j]);
                    //even char printed one by one(start from first one, actully is odd one for us
                    
                }
            }
            System.out.print("");
            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
//learned from this is : String length is method
// have to include brackets like s.length(), but array is not. length is not method.

