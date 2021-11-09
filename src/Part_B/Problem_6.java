package Part_B;

public class Problem_6 {

    private static float Mean(float[] values){
        int n = values.length;
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (float) sum/(float)n;
    }

    public static void main(String[] args)
    {
            float[] values = {1,2,3,4};
            System.out.println(Mean(values));
    }

}
