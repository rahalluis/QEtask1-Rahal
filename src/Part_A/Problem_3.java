package Part_A;

public class Problem_3 {
    public static void main(String[] args)
    {
        int bilangan=6;
        int bilangan2=20;
        System.out.print("Input : "+bilangan);
        System.out.print("\n");
        System.out.print("Output : \n");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " \n");
            }
        }
        System.out.print("===================== \n");
        System.out.print("Input : "+bilangan2);
        System.out.print("\n");
        System.out.print("Output : \n");
        for(int i=1;i<=bilangan2;i++)
        {
            if(bilangan2%i == 0)
            {
                System.out.print(i + " \n");
            }
        }
    }
}
