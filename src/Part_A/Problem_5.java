package Part_A;

public class Problem_5 {
    static boolean primenumber(int number)
    {
        int bil=0;
        for (int i=number; i<=number; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
        }
        if (bil==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int angka=11;
        System.out.println("Input : "+angka);
        System.out.println("Output : "+primenumber(angka));
        System.out.println(primenumber(11));
        System.out.println(primenumber(13));
        System.out.println(primenumber(17));
        System.out.println(primenumber(20));
        System.out.println(primenumber(35));
    }
}
