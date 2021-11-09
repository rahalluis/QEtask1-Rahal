package Part_B;

public class Problem_5 {
    public static StringBuffer ubahhuruf(String text)
    {
        StringBuffer result= new StringBuffer();
        int s=10;
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(ubahhuruf("SEPULSA OKE"));
        System.out.println(ubahhuruf("ALTERRA ACCADEMY"));
        System.out.println(ubahhuruf("INDONESIA"));
        System.out.println(ubahhuruf("GOLANG"));
        System.out.println(ubahhuruf("PROGRAMMER"));
    }
}


