import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        if(e >= 90)
            System.out.print("A");
        else if(e <= 89 && e >= 80)
            System.out.print("B");
        else if(e <= 79 && e >= 70)
            System.out.print("C");
        else if(e <= 69 && e >= 60)
            System.out.print("D");
        else if(e <= 59)
            System.out.print("F");
    }
}