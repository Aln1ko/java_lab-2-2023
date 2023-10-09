import java.util.Arrays;

public class exercise16 {
    public static void main(String[] args){
        int size = 10;
        int[] arrayA = new int[size];
        int[] arrayB = new int[size];

        for(int i = 0; i < size; i++){
            arrayA[i] = i-3;
            arrayB[i] = i+3;
        }

        printArray(arrayA);
        printArray(arrayB);

        int[] res = findNewArray(arrayA,arrayB);
        printArray(res);
    }

    public static int[] findNewArray(int[] arrayA,int[] arrayB){
        int newSize = arrayA.length + arrayB.length;
        int [] newArray = new int[newSize];
        int indexInNewArray = 0;

        for (int i = 0; i < arrayA.length; i++){
            if(findElement(arrayB,arrayA[i]) == null){
                newArray[indexInNewArray] = arrayA[i];
                indexInNewArray += 1;
            }
        }

        for (int i = 0; i < arrayB.length; i++){
            if(findElement(arrayA,arrayB[i]) == null){
                newArray[indexInNewArray] = arrayB[i];
                indexInNewArray += 1;
            }
        }
        int[] res = new int[indexInNewArray];
        for(int i = 0; i < indexInNewArray; i++){
            res[i] = newArray[i];
        }
        return res;
    }
    public static Integer findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return null;
    }

    public static void printArray(int[] array){
        for (int num:array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
