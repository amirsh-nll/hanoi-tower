package Class;

public class Hanoi
{

    public void run(int n, String start, String auxiliary, String end)
    {
        if (n == 1)
        {
            System.out.println(start + " Go To " + end);
        }
        else
        {
            run(n - 1, start, end, auxiliary);
            System.out.println(start + " Go To " + end);
            run(n - 1, auxiliary, start, end);
        }
    }

}
