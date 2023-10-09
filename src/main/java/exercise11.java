public class exercise11 {
    public static void main(String[] args){
        if(args.length < 3){
            System.out.println("error, need to enter minimum 3 args");
            return;
        }
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int[] array = new int[args.length-2];
        for(int i = 0; i < args.length-2; i++ ){
            array[i] = Integer.parseInt(args[i+2]);
        }

        for(int i = 0; i < array.length; i ++){
            if(array[i] < min || array[i] > max){
                System.out.println("index in array: "+ i + " number: " + array[i]);
            }
        }
    }
}
