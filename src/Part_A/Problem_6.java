package Part_A;

public class Problem_6 {
    static boolean palindrome(String text)
    {
        String hapus = text.replaceAll("\\s+", "").toLowerCase();
        int length = hapus.length();
        int awal = 0;
        int akhir = length - 1;
        while (akhir > awal) {
            char AwalKata = hapus.charAt(awal++);
            char AkhirKata = hapus.charAt(akhir--);
            if (AwalKata != AkhirKata   )
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome("CIVIC"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
