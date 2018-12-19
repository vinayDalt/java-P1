import java.util.*;
public class Lettercheck {
    public void check()
    {
        System.out.println("enter any character");
        Scanner sc =new Scanner(System.in);
        char storeAscii= sc.next().charAt(0);
        if (storeAscii>=65 && storeAscii<=90)
        {
            System.out.println("You have entered a capital letter");
        }

        else if (storeAscii>=97 && storeAscii<=122)
        {
            System.out.println("You have entered a small letter");
        }

        else if (storeAscii>=47 && storeAscii<=57)
        {
            System.out.println("You have entered a digit ");
        }

        else if (storeAscii>=0 && storeAscii>=47
                || storeAscii>=54 && storeAscii<=64
                || storeAscii>=91 && storeAscii<=96
                || storeAscii>=123 && storeAscii<=127)
        {
            System.out.println("You have entered a special character");
        }

    }
    public static void main(String[] args)
    {
        Lettercheck obj = new Lettercheck();
        obj.check();
    }
}
