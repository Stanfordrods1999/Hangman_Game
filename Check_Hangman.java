import java.util.*;
public class Check_Hangman
{
    public static void main(String args[])
    {
        System.out.println("Enter the word");
        Hangman ob=new Hangman();
        String l=ob.First_Input();
        int n=ob.Check_Unique(l);
        char ch;
        String h[]=new String[l.length()];
        Arrays.fill(h,"-");
        for(int i=0;i<n+3;i++)
        {
            ch=ob.Second_Input();
            h=ob.Hangman_Check(l,ch,h);
            System.out.println("-----------\n Error is:- "+ ob.Error());
        }
        String s1=ob.Convert(h);
        if(s1.equalsIgnoreCase(l))
        {
            System.out.println("----------\n You Won the Game \n ------------");
        }
        else
        {
            System.out.println("-----------\n You Lost The Game \n ----------- \n Input Was:-"+l);
        }
    }
}