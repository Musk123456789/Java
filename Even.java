import java.util.Scanner;
public class Even {
    public static void main(String []args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
          n = sc.nextInt();
         if(n%2==0)
         {
            System.out.println("no is even");
         }
         else
         {
            System.out.println("no is odd");
         }
         sc.close();
    }
}
