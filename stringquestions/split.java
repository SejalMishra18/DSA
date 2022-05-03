package stringquestions;
//import java.util.*;
public class split {
    public static void main(String[]args)
    {
        String s="My name is Sejal";
        String[]words=s.split(" ");
        for(int i=0;i<words.length;i++)
        {
         System.out.println(words[i]);
        }
        String str="abcdef";
        for(int i=0;i<str.length();i++)
        {
           System.out.println(i+" "+str.charAt(i));
        }
        }
}
