import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        System.out.print(((A+B)%C)+"\n"+(((A%C)+(B%C))%C)+"\n"+((A*B)%C)+"\n"+(((A%C)*(B%C))%C));
    }
}