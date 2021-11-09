package Basic_OOP;

public class Cek_Ongkir {
    public static String ongkir(int p, int l, int t, double berat) {
        int hargamin = 5000;
        int cekDimensi = p * l * t; // Dimensi Barang
        int pembulatanberat = (int) Math.round(berat); //pembulatan berat

        if(cekDimensi <=50 && pembulatanberat <=1){
            String hasil = "Harga Rp."+hargamin;
            return hasil;
        }else{
            int hargaongkir = hargamin * pembulatanberat;
            String hasil = "Harga Rp."+hargaongkir;
            return hasil;
        }
    }

    public static void main(String[] args) {
        System.out.println(ongkir(5,2,4,1));
    }
}
