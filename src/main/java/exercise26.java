import java.util.Random;

public class exercise26 {
    public static void main(String[] args){
        int n =20;
        int [] arrayA = new int[n];

        for(int i = 0 ; i < n; i++){
            arrayA[i] = i;
            System.out.print(arrayA[i]+" ");
        }
        System.out.println();
        int[] res = calc(arrayA);
        for(int num: res){
            System.out.print(num + " ");
        }

    }
    public static int[] calc(int[] array){
        int[] result = new int[array.length];
        int index = 0;
        for( int i = array.length-1; i >= 0;i--){
            result[index] = array[i];
            index++;
        }
        return result;
    }

}
