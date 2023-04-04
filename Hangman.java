import java.util.*;
import java.io.Console;
public class Hangman
{
    static int error=0;
    Console c=System.console();
    String first_word;
    Scanner sc=new Scanner(System.in);
    public String First_Input()
    {
        
        char ch[]=c.readPassword();
        first_word=String.valueOf(ch);
        return first_word;
    }
    public char Second_Input()
    {
        String s;char ch;
        System.out.println("ENTER THE CHARACTER");
        for(;;)
        {
            s=sc.nextLine();
            if(s.length()!=1)
            {
                System.out.println("ENTER A CHARACTER");
                continue;
            }
            else
            {
                ch=s.charAt(0);
                break;
            }
        }
        return ch;
    }
    public int Check_Unique(String s)
    {
        int count=0;
        int count_char=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                   count++;
                }
            }
            if(count!=1)
            {
                count=0;
                continue;
            }
            else
            {
                count_char++;
                count=0;
                continue;
            }
        }
        return count_char;
    }
    public String Convert(String s[])
    {
        String l="";
        for(String h:s)
        {
            l+=h;
        }
        return l;
    }
    public String[] Hangman_Check(String s,char ch,String s1[])
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch||s.charAt(i)==Character.toUpperCase(ch))
            {
                s1[i]=String.valueOf(ch);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Sorry wrong guess!Try again");
            Error();
        }
        return s1;
    }
    public int Error()
    {
        error++;
        return error;
    }
}