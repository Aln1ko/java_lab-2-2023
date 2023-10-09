import java.util.Random;

public class exercise21 {
    public static void main(String[] args) {
        int n = 20;
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        Random random = new Random();
        System.out.println("array A:");
        fillArray(arrayA,random);
        System.out.println("\narray B:");
        fillArray(arrayB,random);
        System.out.println();

        double[] coeffs = findCoeffs(arrayA,arrayB);
        double k = coeffs[0];
        double c = coeffs[1];
        int[] result = new int[n];
        System.out.println("k is "+k);
        System.out.println("c is "+c);

        for(int i = 0; i < n; i++){
           double value = arrayA[i];
           double toCompare = k *(double)arrayB[i]+c;
           int res = compare(value,toCompare);
           result[i] =res;
        }

        System.out.println("array result:");
        for(int num:result){
            System.out.print(num+" ");
        }

    }
    public static void fillArray(int[] array, Random random){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
    }
    public static double[] findCoeffs(int [] arrayA, int [] arrayB){
        double[] coeffs = new double[2];
        double a1 = arrayA[0];
        double a2 = arrayA[1];
        double b1 = arrayB[0];
        double b2 = arrayB[1];
        if (b1 != b2) {
            double k = (a1 - a2) / (b1 - b2);
            double c = a1 - k * b1;
            coeffs[0] = k;
            coeffs[1] = c;
        } else {
            System.out.println("Error: Division by zero.");
            System.exit(0);

        }

        return coeffs;
    }

    public static int compare(double a, double b){
        double epsilon = 0.000001;
        if(Math.abs(a-b)<epsilon) return 1;
        else return 0;
    }
}


