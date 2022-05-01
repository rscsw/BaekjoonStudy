import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int x = B/100;
        int y = B/10-10*x;
        int z = B-x*100-y*10;
        System.out.print((A*z)+"\n"+(A*y)+"\n"+(A*x)+"\n"+(A*B));
    }
}