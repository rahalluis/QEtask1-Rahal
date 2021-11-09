package Part_A;

public abstract class Problem_2 {
    public static void main(String[] args)
    {
	    int studentScore = 80;
        String Huruf ="";

        if(studentScore >=80 && studentScore <=100)
        {
            Huruf="Nilai A";
        }
        else if(studentScore >=65 && studentScore <=79)
        {
            Huruf="Nilai B+";
        }
        else if(studentScore >=50 && studentScore <=64)
        {
            Huruf="Nilai B";
        }
        else if(studentScore >=35 && studentScore <=49)
        {
            Huruf="Nilai C";
        }
        else if(studentScore >=0 && studentScore <=34)
        {
            Huruf="Nilai D";
        }
        else
        {
            Huruf="Nilai Invalid";
        }

        System.out.println(Huruf);
    }
}
