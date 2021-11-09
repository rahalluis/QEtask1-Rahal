package Part_B;

//Draw With XYZ
public class Problem_3 {
    private static int DrawXYZ(int n){
        int x = (n * n);
        int y = 1;
        String huruf="";
        while (y <= x)
        {
            if(y%3==0)
            {
                huruf="X";
            }
            else if(y%2==0)
            {
                huruf="Z";
            }
            else
            {
                huruf="Y";
            }
            System.out.print(huruf+" ");
            if( y% n == 0){
                System.out.println();
            }
            y++;

        }

        return n;
    }


    public static void main(String[] args)
    {
        DrawXYZ(3);
        System.out.println();
        DrawXYZ(5);
        System.out.println();
        DrawXYZ(1);
    }
}
