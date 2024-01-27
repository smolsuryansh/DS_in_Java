package recursion_kunal;

public class FibonacciNumbers {
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        // not a tail recursion, not the last function called, we called two functions and then added them
        // These are known linear recursion relations
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
