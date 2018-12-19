import java.util.*;
public class Tom {
    public void checkoddeven()
    {
        int i,num;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

            if(num>20 && num<30)
            {
                if(num%2==0)
                {
                    System.out.println("Jerry");
                }
                else
                    System.out.println("Tom");
            }
            else
                System.out.println("not in range");
    }
    public static void main(String[] arg)
    {
        Tom obj=new Tom();
        obj.checkoddeven();
    }
}
