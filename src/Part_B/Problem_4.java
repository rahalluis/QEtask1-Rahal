package Part_B;

public class Problem_4 {

    public static int cetakTabelPerkalian(int n){
        for (int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++){

                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }

        return n;
    }

    public static void main(String[] args)
    {
        cetakTabelPerkalian(3);
    }
}
