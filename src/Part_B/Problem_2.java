package Part_B;

//Play With Asterisk
public class Problem_2 {
    private static int playWithAsterisk(int n){
        int x = (n - 1);
        for (int b = 1; b <= n; b++){
            for (int c = x; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args)
    {
        playWithAsterisk(5);
    }
}
