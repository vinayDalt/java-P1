import java.util.*;
public class Reverse {
    public void stringReverse()
    {
        String str2="";
       String str1="vinay";
        int n=str1.length();
            for (int i = n-1; i>=0; i--){
                str2 += str1.charAt(i);}
            System.out.println("reverse string is:" + str2);
    }
    public static void main(String[] args)
    {
        Reverse obj= new Reverse();
        obj.stringReverse();
    }
}

