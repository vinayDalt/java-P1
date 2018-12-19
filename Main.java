import java.util.*;
public class Main {
    public void palindrome()
    {
        int a,rem,sum=0;

        System.out.println("enter the number" );
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int num=a;
        while(a!=0) {
            rem = a % 10;
            sum = (sum * 10) + rem;
            a = a / 10;
                    }
        if(num==sum)
        {
            System.out.println("this is palindrome");
            int sum2=0,rem1;
            while(num!=0)
            {
                rem1=num%10;
                if(rem1%2==0)
                {
                    sum2=sum2+rem1;
                    if(sum2>25)
                    {
                        System.out.println("sum is more than 25");
                    }
                    else
                        System.out.println("sum is less than 25");
                }
            }
        }
        else
            System.out.println("this is not");
    }
    public static void main(String[] args){
        Main obj=new Main();
        obj.palindrome();

    }
}
