import java.util.*;
public class Pattern {
    public void pattern() {
        int num;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i, j;
        for (i = 0; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }
    }
 public static void main(String[] args)
 {
     Pattern obj= new Pattern();
     obj.pattern();
 }
}

