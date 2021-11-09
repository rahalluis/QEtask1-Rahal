package Basic_OOP;

public class Kalkulator {
    public static String penjumlahan(int a, int b) {
        int nilai;
        nilai = a + b ;
        String hasil = "Penjumlahan a + b = " + nilai;
        return hasil;
    }

    public static String pengurangan(int a, int b) {
        int nilai;
        nilai = a - b ;
        String hasil = "Pengurangan a - b = " + nilai;
        return hasil;
    }

    public static String perkalian(int a, int b) {
        int nilai;
        nilai = a * b ;
        String hasil = "Perkalian a x b = " + nilai;
        return hasil;
    }

    public static String pembagian(int a, int b) {
        int nilai;
        nilai = a / b ;
        String hasil = "Pembagian a : b = " + nilai;
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(penjumlahan(3,4));
        System.out.println(pengurangan(15,4));
        System.out.println(perkalian(10,10));
        System.out.println(pembagian(12,3));
    }
}
