package recursion_kunal;

public class NumbersExampleRecursion {
    static void printNums(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // this is called tail recursion, last function called
        printNums(n + 1);
    }

    public static void main(String[] args) {
        printNums(1);
    }
}
