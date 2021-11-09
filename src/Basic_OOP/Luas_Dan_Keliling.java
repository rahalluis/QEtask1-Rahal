package Basic_OOP;

public class Luas_Dan_Keliling {

    public static String persegi(int sisi){
        int luas, keliling;
        luas = sisi * sisi;
        keliling = 4 * sisi;
        String hasil = "Luas Persegi = " +luas +"\n"+"Keliling Persegi = "+keliling;
        return  hasil;
    }

    public static String segitiga(int alas, int tinggi){
        double luas, keliling,sisi;
        luas = (alas * tinggi)/2 ;
        sisi = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );
        keliling = alas + tinggi + sisi;
        String hasil = "Luas Segitiga = " +luas +"\n"+"Keliling Segitiga = "+keliling;
        return  hasil;
    }

    public static String persegipanjang(int panjang, int lebar){
        int luas, keliling;
        luas = panjang * lebar ;
        keliling = 2 *(panjang + lebar);
        String hasil = "Luas Persegi Panjang= " +luas +"\n"+"Keliling Persegi Panjang= "+keliling;
        return  hasil;
    }

    public static void main(String[] args)
    {
        System.out.println(persegi(3));
        System.out.println(segitiga(3,4));
        System.out.println(persegipanjang(7,8));
    }

}
