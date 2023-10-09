import java.util.Random;

public class exercise6 {
    public static void main(String[] args){
        int n =20;
        int [] array = new int[n];
        Random random = new Random();

        for(int i = 0 ; i < n; i++){
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int[] localMin = findLocalMin(array);
        for(int i = 0; i < localMin.length; i++){
            System.out.print(localMin[i]+ " ");
        }

    }

    public static int[] findLocalMin(int[] array){
        int n = array.length;
        int [] localMin = new int[n];
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            if( i == 0){
                if(array[0]< array[1]){
                    localMin[index] = array[0];
                    index += 1;
                    continue;
                }
            }
            else if(i == n-1){
                if(array[n-1] < array[n-2]){
                    localMin[index] = array[n-1];
                    index +=1;
                }
            }
            else if(array[i] < array[i-1] && array[i] < array[i+1]){
                localMin[index] = array[i];
                index += 1;
            }

        }
        int[] res = new int[index];
        for(int i = 0; i < index; i++){
            res[i] = localMin[i];
        }
        return res;
    }
}
