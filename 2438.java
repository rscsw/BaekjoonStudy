import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        for(int i = 0; i < b; i++)
        {
            for(int j = -1; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}