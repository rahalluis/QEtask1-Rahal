package Part_B;

//Exponentiation
public class Problem_1 {
    public static int pangkat(int a, int b){
        int c =1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        return c;
    }

    public static void main(String[] args)
    {
        System.out.println(pangkat(2, 3));
        System.out.println(pangkat(5, 3));
        System.out.println(pangkat(10, 2));
        System.out.println(pangkat(2, 5));
        System.out.println(pangkat(7, 3));
    }
}
