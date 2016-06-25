import java.io.*;
import java.util.*;
public class Letters
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string: ");
        String s = br.readLine();
        int l=s.length(); //finding the length of the string

        char ch;

        // Counting frequency of alphabets begins below
        int count=0;
        for(char i=' '; i<='~'; i++)
            {
                count = 0;
                for(int j=0; j<l; j++)
                {
                    ch=s.charAt(j); //extracting characters of the string one by one
                    if(ch==i) //first checking the whole string for 'a', then 'b' and so on
                        count++; //increasing count of those aplhabets which are present in the string
                }
                if(count!=0)//printing only those alphabets whose count is not '0'
                {
                    System.out.println(i+" "+count);
                }
            }
    }
}

