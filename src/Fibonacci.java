public class Fibonacci {

    void calculadorFibonacci(int numero){
        int[] array = new int[numero];

        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < numero; i++){
            array[i] = array[i - 1] + array[i - 2];
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
