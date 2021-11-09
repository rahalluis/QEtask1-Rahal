package Basic_OOP;

public class Volume {

    public static String Kubus(int rusuk) {
        int volume;
        volume = rusuk * rusuk * rusuk;
        String hasil = "Volume Kubus = " + volume;
        return hasil;
    }

    public static String Balok(int panjang,int lebar,int tinggi) {
        int volume;
        volume = panjang * lebar * tinggi;
        String hasil = "Volume Balok = " + volume;
        return hasil;
    }

    public static String Tabung(int diamater,int tinggi) {
        
        if( diamater%7==0) {
            int volume = diamater * diamater * tinggi * 22/7;
            String hasil = "Volume Tabung = " + volume;
            return hasil;
        }else {
            double volume = 3.14 * diamater * diamater * tinggi ;
            String hasil = "Volume Tabung = " + volume;
            return hasil;
        }
    }


    public static void main(String[] args) {
        System.out.println(Kubus(10));
        System.out.println(Balok(3,6,10));
        System.out.println(Tabung(7,10));
    }


}
