import Class.Hanoi;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Hanoi h1 = new Hanoi();
        System.out.print("Enter disc Count : ");
        Scanner s1 = new Scanner(System.in);
        int discs = s1.nextInt();
        h1.run(discs, "A", "B", "C");
    }

}
