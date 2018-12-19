import java.util.*;
public class Array {
    public void sum()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the values in the array");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
         int sum1=0;
         for(int i=0;i<a;i++)
         {
             sum1=sum1 + arr[i];
             System.out.println("the sum is:" + sum1);
         }
    }
    public static void main(String[] args)
    {
        Array obj= new Array();
        obj.sum();
    }
}
